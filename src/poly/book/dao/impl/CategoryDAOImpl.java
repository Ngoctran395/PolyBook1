/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.book.dao.impl;

import java.util.List;
import poly.book.dao.CategoryDAO;
import poly.book.entity.Category;
import poly.book.util.XJdbc;
import poly.book.util.XQuery;

/**
 *
 * @author Dell
 */
public class CategoryDAOImpl implements CategoryDAO {

    String createSql = "INSERT INTO Category(CategoryId, CategoryName) VALUES(?, ?)";
    String updateSql = "UPDATE Category SET CategoryName=? WHERE CategoryId=?";
    String deleteSql = "DELETE FROM Category WHERE CategoryId=?";
    String findAllSql = "SELECT * FROM Category";
    String findByIdSql = "SELECT * FROM Category WHERE CategoryId=?";

// Thêm mới
    @Override
    public Category create(Category entity) {
        Object[] values = {
            entity.getCategoryID(),
            entity.getCategoryName()
        };
        XJdbc.executeUpdate(createSql, values);
        return entity;
    }

// Cập nhật
    @Override
    public void update(Category entity) {
        Object[] values = {
            entity.getCategoryName(),
            entity.getCategoryID()
        };
        XJdbc.executeUpdate(updateSql, values);
    }

// Xoá theo ID
    @Override
    public void deleteById(String id) {
        XJdbc.executeUpdate(deleteSql, id);
    }

// Lấy tất cả
    @Override
    public List<Category> findAll() {
        return XQuery.getBeanList(Category.class, findAllSql);
    }

// Tìm theo ID
    @Override
    public Category findById(String id) {
        return XQuery.getSingleBean(Category.class, findByIdSql, id);
    }
    
}
