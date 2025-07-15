/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.book.util;

import poly.book.entity.User;


/**
 *
 * @author Dell
 */
public class XAuth {
    public static User user;

    static {
        user = new User();
        user.setUsername("admin");
        user.setPassword("123");
        user.setFullName("Lê Ngọc Trân");
        user.setPhoto("trump.png");
        user.setEnabled(true);
        user.setManager(true);
    }
}
