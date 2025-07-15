package poly.book.dao.impl;

import java.util.List;
import poly.book.dao.BillDetailDAO;
import poly.book.entity.BillDetail;
import poly.book.util.XJdbc;
import poly.book.util.XQuery;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Dell
 */
public class BillDetailDAOImpl implements BillDetailDAO {

    String createSql = "INSERT INTO BillDetail(BillID, BookID, UnitPrice, Quantity) VALUES (?, ?, ?, ?)";
    String updateSql = "UPDATE BillDetail SET BillID=?, BookID=?, UnitPrice=?, Quantity=? WHERE BillDetailID=?";
    String deleteSql = "DELETE FROM BillDetail WHERE BillDetailID=?";
    String findAllSql = "SELECT * FROM BillDetail";
    String findByIdSql = "SELECT * FROM BillDetail WHERE BillDetailID=?";
    String findByBillIdSql = "SELECT * FROM BillDetail WHERE BillID=?"; // ✅ Sửa đúng ở đây

    @Override
    public BillDetail create(BillDetail entity) {
        XJdbc.executeUpdate(createSql,
                entity.getBillID(),
                entity.getBookID(),
                entity.getUnitPrice(),
                entity.getQuantity());
        return entity;
    }

    @Override
    public void update(BillDetail entity) {
        XJdbc.executeUpdate(updateSql,
                entity.getBillID(),
                entity.getBookID(),
                entity.getUnitPrice(),
                entity.getQuantity(),
                entity.getBillDetailID());
    }

    @Override
    public void deleteById(Long id) {
        XJdbc.executeUpdate(deleteSql, id);
    }

    @Override
    public List<BillDetail> findAll() {
        return XQuery.getBeanList(BillDetail.class, findAllSql);
    }

    @Override
    public BillDetail findById(Long id) {
        return XQuery.getSingleBean(BillDetail.class, findByIdSql, id);
    }

    @Override
    public void insert(BillDetail detail) {
        XJdbc.executeUpdate(createSql,
                detail.getBillID(),
                detail.getBookID(),
                detail.getUnitPrice(),
                detail.getQuantity());
    }

    @Override
    public List<BillDetail> findByBillId(long billID) {
        return XQuery.getBeanList(BillDetail.class, findByBillIdSql, billID);
    }

}
