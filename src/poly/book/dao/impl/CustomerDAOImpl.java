/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.book.dao.impl;

import java.util.List;
import poly.book.dao.CustomerDAO;
import poly.book.entity.Customer;
import poly.book.util.XJdbc;
import poly.book.util.XQuery;

/**
 *
 * @author Dell
 */
public class CustomerDAOImpl implements CustomerDAO {

    String createSql = "INSERT INTO Customer(CustomerName, Phone, PurchaseCount, IsLoyal) VALUES (?, ?, ?, ?)";
    String updateSql = "UPDATE Customer SET CustomerName=?, Phone=?, PurchaseCount=?, IsLoyal=? WHERE CustomerID=?";
    String deleteSql = "DELETE FROM Customer WHERE CustomerID=?";
    String findAllSql = "SELECT * FROM Customer";
    String findByIdSql = "SELECT * FROM Customer WHERE CustomerID=?";

    @Override
    public Customer create(Customer entity) {
        XJdbc.executeUpdate(createSql,
                entity.getCustomerName(),
                entity.getPhone(),
                entity.getPurchaseCount(),
                entity.isLoyal());
        return entity;
    }

    @Override
    public void update(Customer entity) {
        XJdbc.executeUpdate(updateSql,
                entity.getCustomerName(),
                entity.getPhone(),
                entity.getPurchaseCount(),
                entity.isLoyal(),
                entity.getCustomerID());
    }

    @Override
    public void deleteById(Integer id) {
        XJdbc.executeUpdate(deleteSql, id);
    }

    @Override
    public List<Customer> findAll() {
        return XQuery.getBeanList(Customer.class, findAllSql);
    }

    @Override
    public Customer findById(Integer id) {
        return XQuery.getSingleBean(Customer.class, findByIdSql, id);
    }

    @Override
    public void insert(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
