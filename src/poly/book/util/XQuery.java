/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.book.util;

import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import poly.book.entity.User;

/**
 *
 * @author Dell
 */
public class XQuery {

    public static <B> B getSingleBean(Class<B> beanClass, String sql, Object... values) {
        List<B> list = XQuery.getBeanList(beanClass, sql, values);
        if (!list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    public static <B> List<B> getBeanList(Class<B> beanClass, String sql, Object... values) {
        List<B> list = new ArrayList<>();
        try {
            ResultSet resultSet = XJdbc.executeQuery(sql, values);
            while (resultSet.next()) {
                list.add(XQuery.readBean(resultSet, beanClass));
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private static <B> B readBean(ResultSet resultSet, Class<B> beanClass) throws Exception {
        B bean = beanClass.getDeclaredConstructor().newInstance();
        Method[] methods = beanClass.getDeclaredMethods();

        for (Method method : methods) {
            String name = method.getName();
            if (name.startsWith("set") && method.getParameterCount() == 1) {
                String columnName = name.substring(3); // Lấy phần sau 'set', ví dụ "Category", "Revenue"
                try {
                    Object value = resultSet.getObject(columnName);
                    method.invoke(bean, value);
                } catch (SQLException e) {
                    // Nếu cột không tồn tại hoặc tên không khớp, có thể thử lowercase
                    try {
                        Object value = resultSet.getObject(columnName.toLowerCase());
                        method.invoke(bean, value);
                    } catch (SQLException ex) {
                        System.out.printf("+ Column '%s' not found!\r\n", columnName);
                    }
                }
            }
        }
        return bean;
    }

    private static String toCamelCase(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

    public static void main(String[] args) {
        demo1();
        demo2();
    }

    private static void demo1() {
        String sql = "SELECT * FROM Users WHERE Username=? AND Password=?";
        User user = XQuery.getSingleBean(User.class, sql, "NghiemN", "123456");
    }

    private static void demo2() {
        String sql = "SELECT * FROM Users WHERE Fullname LIKE ?";
        List<User> list = XQuery.getBeanList(User.class, sql, "%Nguyễn %");
    }
}
