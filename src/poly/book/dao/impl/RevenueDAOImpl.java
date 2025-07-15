package poly.book.dao.impl;

import java.util.Date;
import java.util.List;
import poly.book.dao.RevenueDAO;
import poly.book.entity.Revenue.ByCategory;
import poly.book.entity.Revenue.ByUser;
import poly.book.util.XQuery;

public class RevenueDAOImpl implements RevenueDAO {

    @Override
    public List<ByCategory> getByCategory(Date begin, Date end) {
        String sql = """
            SELECT c.CategoryName AS Category,
                   SUM(d.UnitPrice * d.Quantity) AS Revenue,
                   SUM(d.Quantity) AS Quantity,
                   MIN(d.UnitPrice) AS MinPrice,
                   MAX(d.UnitPrice) AS MaxPrice,
                   AVG(d.UnitPrice) AS AvgPrice
            FROM BillDetail d
            JOIN Book b ON b.BookID = d.BookID
            JOIN Category c ON c.CategoryID = b.CategoryID
            JOIN Bill bill ON bill.BillID = d.BillID
            WHERE bill.Status = 1
              AND bill.Checkout IS NOT NULL
              AND bill.Checkout BETWEEN ? AND ?
            GROUP BY c.CategoryName
            ORDER BY Revenue DESC
        """;

        return XQuery.getBeanList(ByCategory.class, sql, begin, end);
    }

    @Override
    public List<ByUser> getByUser(Date begin, Date end) {
        String sql = """
            SELECT bill.Username AS [User],
                   SUM(d.UnitPrice * d.Quantity) AS Revenue,
                   COUNT(DISTINCT d.BillID) AS Quantity,
                   MIN(bill.Checkin) AS FirstTime,
                   MAX(bill.Checkin) AS LastTime
            FROM BillDetail d
            JOIN Bill bill ON bill.BillID = d.BillID
            WHERE bill.Status = 1
              AND bill.Checkout IS NOT NULL
              AND bill.Checkout BETWEEN ? AND ?
            GROUP BY bill.Username
            ORDER BY Revenue DESC
        """;

        return XQuery.getBeanList(ByUser.class, sql, begin, end);
    }
}
