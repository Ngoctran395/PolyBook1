/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.book.entity;

/**
 *
 * @author Dell
 */
public class Customer {

    private int customerID;
    private String customerName;
    private String phone;
    private int purchaseCount;
    private boolean isLoyal;

    public Customer() {
    }

    public Customer(int customerID, String customerName, String phone, int purchaseCount, boolean isLoyal) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.phone = phone;
        this.purchaseCount = purchaseCount;
        this.isLoyal = isLoyal;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
        this.isLoyal = purchaseCount >= 10; // Tự động đánh dấu loyal
    }

    public boolean isLoyal() {
        return isLoyal;
    }

    public void setLoyal(boolean isLoyal) {
        this.isLoyal = isLoyal;
    }

    @Override
    public String toString() {
        return customerName;
    }
}
