/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.book.entity;

/**
 *
 * @author Dell
 */
public class Book {
private String bookID;
    private String bookName;
    private String author;
    private double price;
    private int stockQuantity;
    private boolean available;
    private String imageBook;
    private String categoryID;

    public Book() {
    }

    public Book(String bookID, String bookName, String author, double price, int stockQuantity, boolean available, String imageBook, String categoryID) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.available = available;
        this.imageBook = imageBook;
        this.categoryID = categoryID;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getImageBook() {
        return imageBook;
    }

    public void setImageBook(String imageBook) {
        this.imageBook = imageBook;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    @Override
    public String toString() {
        return bookName; // Dùng cho hiển thị trong combobox hoặc list
    }
}
