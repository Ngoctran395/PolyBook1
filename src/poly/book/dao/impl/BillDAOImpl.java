/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.book.dao.impl;

import java.util.Date;
import java.util.List;
import poly.book.dao.BillDAO;
import poly.book.entity.Bill;
import poly.book.util.XJdbc;
import poly.book.util.XQuery;

/**
 *
 * @author Dell
 */
public class BillDAOImpl implements BillDAO {

    String createSql = "INSERT INTO Bill(Username, CustomerID, Checkin, Checkout, Status) VALUES (?, ?, ?, ?, ?)";
    String updateSql = "UPDATE Bill SET Username=?, CustomerID=?, Checkin=?, Checkout=?, Status=? WHERE BillID=?";
    String deleteSql = "DELETE FROM Bill WHERE BillID=?";
    String findAllSql = "SELECT * FROM Bill";
    String findByIdSql = "SELECT * FROM Bill WHERE BillID=?";
    String findByUsernameSql = "SELECT * FROM Bill WHERE Username=?";
    String findByTimeRangeSql = "SELECT * FROM Bill WHERE Checkin BETWEEN ? AND ? ORDER BY Checkin DESC";

    @Override
    public Bill create(Bill entity) {
        XJdbc.executeUpdate(createSql,
                entity.getUsername(),
                entity.getCustomerID(),
                entity.getCheckin(),
                entity.getCheckout(),
                entity.getStatus());
        return entity;
    }

    @Override
    public void update(Bill entity) {
        XJdbc.executeUpdate(updateSql,
                entity.getUsername(),
                entity.getCustomerID(),
                entity.getCheckin(),
                entity.getCheckout(),
                entity.getStatus(),
                entity.getBillID());
    }

    @Override
    public void deleteById(Long id) {
        XJdbc.executeUpdate(deleteSql, id);
    }

    @Override
    public List<Bill> findAll() {
        return XQuery.getBeanList(Bill.class, findAllSql);
    }

    @Override
    public Bill findById(Long id) {
        return XQuery.getSingleBean(Bill.class, findByIdSql, id);
    }

    @Override
    public List<Bill> findByUsername(String username) {
        return XQuery.getBeanList(Bill.class, findByUsernameSql, username);
    }

    @Override
    public List<Bill> findByTimeRange(Date begin, Date end) {
        return XQuery.getBeanList(Bill.class, findByTimeRangeSql, begin, end);
    }

    @Override
    public List<Bill> findByUserAndTimeRange(String username, Date begin, Date end) {
        String sql = "SELECT * FROM Bill WHERE Username=? AND Checkin BETWEEN ? AND ?";
        return XQuery.getBeanList(Bill.class, sql, username, begin, end);
    }

    @Override
    public void insert(Bill bill) {
        this.create(bill);
    }
}
