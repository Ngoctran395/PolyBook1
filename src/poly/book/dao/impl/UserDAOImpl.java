/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.book.dao.impl;

import java.util.List;
import poly.book.dao.UserDAO;
import poly.book.entity.User;
import poly.book.util.XJdbc;
import poly.book.util.XQuery;

/**
 *
 * @author Dell
 */
public class UserDAOImpl implements UserDAO {

    String createSql = "INSERT INTO Users(Username, Password, Fullname, Photo, Enabled, Manager) VALUES(?, ?, ?, ?, ?, ?)";
    String updateSql = "UPDATE Users SET Password=?, Fullname=?, Photo=?, Enabled=?, Manager=? WHERE Username=?";
    String deleteSql = "DELETE FROM Users WHERE Username=?";
    String findAllSql = "SELECT * FROM Users";
    String findByIdSql = "SELECT * FROM Users WHERE Username=?";

    @Override
    public User create(User user) {
        Object[] values = {
            user.getUsername(), user.getPassword(), user.getFullName(),
            user.getPhoto(), user.isEnabled(), user.isManager()
        };
        XJdbc.executeUpdate(createSql, values);
        return user;
    }

    @Override
    public void update(User user) {
        Object[] values = {
            user.getPassword(), user.getFullName(), user.getPhoto(),
            user.isEnabled(), user.isManager(), user.getUsername()
        };
        XJdbc.executeUpdate(updateSql, values);
    }

    @Override
    public void deleteById(String username) {
        XJdbc.executeUpdate(deleteSql, username);
    }

    @Override
    public List<User> findAll() {
        return XQuery.getBeanList(User.class, findAllSql);
    }

    @Override
    public User findById(String username) {
        return XQuery.getSingleBean(User.class, findByIdSql, username);
    }
}
