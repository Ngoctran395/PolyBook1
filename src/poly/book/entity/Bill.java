/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.book.entity;

import java.util.Date;

/**
 *
 * @author Dell
 */
public class Bill {

    private long billID;
    private String username;
    private int customerID;
    private Date checkin;
    private Date checkout;
    private int status;

   

    public Bill() {
    }

    public Bill(long billID, String username, int customerID, Date checkin, Date checkout, int status) {
        this.billID = billID;
        this.username = username;
        this.customerID = customerID;
        this.checkin = checkin;
        this.checkout = checkout;
        this.status = status;
    }

    public long getBillID() {
        return billID;
    }

    public void setBillID(long billID) {
        this.billID = billID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static class Status {

        public static int Servicing;
        public static int Completed;
        public static int Canceled;

        public Status() {
        }
    }
}
