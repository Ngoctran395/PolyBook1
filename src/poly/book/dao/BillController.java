/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poly.book.dao;

import java.util.List;
import poly.book.entity.Bill;

/**
 *
 * @author Dell
 */
public interface BillController {
  
    void setBill(Bill bill); // truyền bill vào cửa sổ để hiển thị

    void open(); // Hiển thị bill

    void close(); // Xóa bill nếu ko chứa đồ uống nào

    void showBillJDialog(); // Hiển thị cửa sổ bổ sung đồ uống vào bill

    void removeBills(); // Xóa đồ uống khỏi bill

    void updateQuantity(); // Thay đổi số lượng đồ uống

    void checkout(); // Thanh toán

    void cancel();
}
