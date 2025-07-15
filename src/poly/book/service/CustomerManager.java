/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import poly.book.dao.CustomerDAO;
import poly.book.dao.impl.CustomerDAOImpl;
import poly.book.entity.Customer;

/**
 *
 * @author ADMIN
 */


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerManager {

    private CustomerDAO dao = new CustomerDAOImpl();
    private List<Customer> customers = new ArrayList<>();

    // Tải dữ liệu và cập nhật trạng thái thân thiết
    public void loadAndUpdateLoyalty() {
        customers = dao.findAll();
        for (Customer c : customers) {
            boolean loyal = c.getPurchaseCount() >= 10;
            if (c.isLoyal() != loyal) {
                c.setLoyal(loyal);
                dao.update(c);
            }
        }
    }

    // Thêm khách hàng mới nếu chưa tồn tại theo số điện thoại
    public void addCustomer(String name, String phone) {
        Customer existing = findByPhone(phone);
        if (existing != null) {
            System.out.println("Khách hàng đã tồn tại với SĐT: " + phone);
            return;
        }

        Customer c = new Customer();
        c.setCustomerName(name);
        c.setPhone(phone);
        c.setPurchaseCount(0);
        c.setLoyal(false);
        dao.create(c);
    }

    // Tăng lượt mua và cập nhật trạng thái thân thiết
    public void incrementPurchase(int customerId) {
        Customer c = dao.findById(customerId);
        if (c != null) {
            c.setPurchaseCount(c.getPurchaseCount() + 1);
            c.setLoyal(c.getPurchaseCount() >= 10);
            dao.update(c);
        }
    }

    // Xóa khách hàng
    public void deleteCustomer(int customerId) {
        dao.deleteById(customerId);
    }

    // Lấy toàn bộ khách hàng
    public List<Customer> getAllCustomers() {
        return dao.findAll();
    }

    // Tìm kiếm theo tên hoặc số điện thoại
    public List<Customer> searchCustomers(String keyword) {
        return getAllCustomers().stream()
                .filter(c -> c.getCustomerName().toLowerCase().contains(keyword.toLowerCase())
                        || c.getPhone().contains(keyword))
                .collect(Collectors.toList());
    }

    //  Tìm khách hàng theo SĐT (dùng để kiểm tra trùng)
    public Customer findByPhone(String phone) {
        return dao.findAll().stream()
                .filter(c -> c.getPhone().equals(phone))
                .findFirst()
                .orElse(null);
    }

    public Customer getCustomerById(int id) {
     return dao.findById(id);// DAO gọi đúng dữ liệu từ DB
}
}



