package poly.book.dao;

import java.util.Date;
import java.util.List;
import poly.book.entity.Revenue;

public interface RevenueDAO {


   
    List<Revenue.ByCategory> getByCategory(Date begin, Date end);

    List<Revenue.ByUser> getByUser(Date begin, Date end);
}
