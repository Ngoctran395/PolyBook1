/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poly.book.dao;

import java.util.Date;
import java.util.List;
import poly.book.dao.CrudDAO;
import poly.book.entity.Bill;

/**
 *
 * @author Dell
 */
public interface BillDAO extends CrudDAO<Bill, Long> {
 List<Bill> findByUsername(String username);

    

    List<Bill> findByTimeRange(Date begin, Date end);

   

    List<Bill> findByUserAndTimeRange(String username, Date begin, Date end);

    public void insert(Bill bill);
}
