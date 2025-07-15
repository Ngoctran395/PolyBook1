/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poly.book.dao;

import java.util.List;
import poly.book.entity.BillDetail;

/**
 *
 * @author Dell
 */
public interface BillDetailController {
      List<BillDetail> getByBillId(Long billId);
    BillDetail create(BillDetail detail);
    void delete(Long id);
}
