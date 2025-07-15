CREATE DATABASE PolyBook;
USE PolyBook;

-- Danh mục thể loại
CREATE TABLE Category (
    CategoryID VARCHAR(20) NOT NULL PRIMARY KEY,
    CategoryName NVARCHAR(50) NOT NULL
);

-- Sách
CREATE TABLE Book (
    BookID VARCHAR(20) NOT NULL PRIMARY KEY,
    BookName NVARCHAR(100) NOT NULL,
    Author NVARCHAR(50) NOT NULL,
    Price FLOAT NOT NULL,
    StockQuantity INT NOT NULL, -- Số lượng trong kho
    Available BIT NOT NULL,
    ImageBook NVARCHAR(50) NOT NULL,
    CategoryID VARCHAR(20) NOT NULL,
    FOREIGN KEY (CategoryID) REFERENCES Category(CategoryID)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);

-- Người dùng
CREATE TABLE Users (
    Username NVARCHAR(20) NOT NULL PRIMARY KEY,
    FullName NVARCHAR(50) NOT NULL,
    Password NVARCHAR(50) NOT NULL,
    Photo NVARCHAR(100) NOT NULL,
    Manager BIT NOT NULL,
    Enabled BIT NOT NULL
);

-- Khách hàng (mã tự sinh)
CREATE TABLE Customer (
    CustomerID INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
    CustomerName NVARCHAR(100) NOT NULL,
    Phone NVARCHAR(11) NOT NULL,
    PurchaseCount INT DEFAULT 0,
    IsLoyal BIT DEFAULT 0
);

-- Hóa đơn
CREATE TABLE Bill (
    BillID BIGINT NOT NULL IDENTITY(10000, 1) PRIMARY KEY,
    Username NVARCHAR(20) NOT NULL,
    CustomerID INT NOT NULL,
    Checkin DATETIME NOT NULL,
    Checkout DATETIME NULL,
    Status INT NOT NULL,
    FOREIGN KEY (Username) REFERENCES Users(Username)
        ON UPDATE CASCADE,
    FOREIGN KEY (CustomerID) REFERENCES Customer(CustomerID)
        ON UPDATE CASCADE
);

-- Chi tiết hóa đơn
CREATE TABLE BillDetail (
    BillDetailID BIGINT NOT NULL IDENTITY(100000, 1) PRIMARY KEY,
    BillID BIGINT NOT NULL,
    BookID VARCHAR(20) NOT NULL,
    UnitPrice FLOAT NOT NULL,
    Quantity INT NOT NULL, -- Số lượng sách mua
    FOREIGN KEY (BillID) REFERENCES Bill(BillID)
        ON DELETE CASCADE,
    FOREIGN KEY (BookID) REFERENCES Book(BookID)
        ON UPDATE CASCADE
);