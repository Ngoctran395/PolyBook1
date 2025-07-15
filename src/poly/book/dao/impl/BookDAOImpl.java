/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.book.dao.impl;

import java.util.List;
import poly.book.dao.BookDAO;
import poly.book.entity.Book;
import poly.book.util.XJdbc;
import poly.book.util.XQuery;

/**
 *
 * @author Dell
 */
public class BookDAOImpl implements BookDAO {

    String createSql = "INSERT INTO Book(BookID, BookName, Author, Price, StockQuantity, Available, ImageBook, CategoryID) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    String updateSql = "UPDATE Book SET BookName=?, Author=?, Price=?, StockQuantity=?, Available=?, ImageBook=?, CategoryID=? WHERE BookID=?";
    String deleteSql = "DELETE FROM Book WHERE BookID=?";
    String findAllSql = "SELECT * FROM Book";
    String findByIdSql = "SELECT * FROM Book WHERE BookID=?";
    String sql = "SELECT * FROM Book WHERE CategoryID = ?";

    @Override
    public Book create(Book book) {
        Object[] values = {
            book.getBookID(),
            book.getBookName(),
            book.getAuthor(),
            book.getPrice(),
            book.getStockQuantity(),
            book.isAvailable(),
            book.getImageBook(),
            book.getCategoryID()
        };
        XJdbc.executeUpdate(createSql, values);
        return book;
    }

    @Override
    public void update(Book book) {
        Object[] values = {
            book.getBookName(),
            book.getAuthor(),
            book.getPrice(),
            book.getStockQuantity(),
            book.isAvailable(),
            book.getImageBook(),
            book.getCategoryID(),
            book.getBookID()
        };
        XJdbc.executeUpdate(updateSql, values);
    }

    @Override
    public void deleteById(String id) {
        XJdbc.executeUpdate(deleteSql, id);
    }

    @Override
    public List<Book> findAll() {
        return XQuery.getBeanList(Book.class, findAllSql);
    }

    @Override
    public Book findById(String id) {
        return XQuery.getSingleBean(Book.class, findByIdSql, id);
    }

    @Override
    public List<Book> findByCategoryId(String categoryID) {

        return XQuery.getBeanList(Book.class, sql, categoryID);
    }
}
