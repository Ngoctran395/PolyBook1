/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poly.book.dao;

import java.util.List;
import poly.book.entity.Book;

/**
 *
 * @author Dell
 */
public interface BookDAO extends CrudDAO<Book, String>{


    public List<Book> findByCategoryId(String categoryID);
    
}
