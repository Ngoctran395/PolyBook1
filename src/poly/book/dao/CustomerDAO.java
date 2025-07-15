/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poly.book.dao;

import poly.book.entity.Customer;

/**
 *
 * @author Dell
 */
public interface CustomerDAO extends CrudDAO<Customer, Integer> {

    public void insert(Customer customer);
}
