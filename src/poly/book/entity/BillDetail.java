/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.book.entity;

/**
 *
 * @author Dell
 */
public class BillDetail {
   private long billDetailID;
    private long billID;
    private String bookID;
    private double unitPrice;
    private int quantity;

    public BillDetail() {
    }

    public BillDetail(long billDetailID, long billID, String bookID, double unitPrice, int quantity) {
        this.billDetailID = billDetailID;
        this.billID = billID;
        this.bookID = bookID;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public long getBillDetailID() {
        return billDetailID;
    }

    public void setBillDetailID(long billDetailID) {
        this.billDetailID = billDetailID;
    }

    public long getBillID() {
        return billID;
    }

    public void setBillID(long billID) {
        this.billID = billID;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
