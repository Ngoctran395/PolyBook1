/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.book.util;

/**
 *
 * @author Dell
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class XJdbc {

    private static Connection connection;

    public static Connection openConnection() {
        var driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        var dburl = "jdbc:sqlserver://localhost:1433;database=PolyBook;encrypt=false";
        var username = "sa";
        var password = "12345";
        try {
            if (!XJdbc.isReady()) {
                Class.forName(driver);
                connection = DriverManager.getConnection(dburl, username, password);
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            if (XJdbc.isReady()) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean isReady() {
        try {
            return (connection != null && !connection.isClosed());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static int executeUpdate(String sql, Object... values) {
        try {
            var stmt = XJdbc.getStmt(sql, values);
            return stmt.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static ResultSet executeQuery(String sql, Object... values) {
        try {
            var stmt = XJdbc.getStmt(sql, values);
            return stmt.executeQuery();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static <T> T getValue(String sql, Object... values) {
        try {
            var resultSet = XJdbc.executeQuery(sql, values);
            if (resultSet.next()) {
                return (T) resultSet.getObject(1);
            }
            return null;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    private static PreparedStatement getStmt(String sql, Object... values) throws SQLException {
        var conn = XJdbc.openConnection();
        var stmt = sql.trim().startsWith("{") ? conn.prepareCall(sql) : conn.prepareStatement(sql);
        for (int i = 0; i < values.length; i++) {
            stmt.setObject(i + 1, values[i]);
        }
        return stmt;
    }

    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
    }

   // Demo: Select books with price between 50 and 150
    private static void demo1() {
        String sql = "SELECT * FROM Book WHERE Price BETWEEN ? AND ?";
        try (ResultSet rs = executeQuery(sql, 50.0, 150.0)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getString("Id") +
                        ", Title: " + rs.getString("Title") +
                        ", Price: " + rs.getDouble("Price"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Demo: Get the highest book price
    private static void demo2() {
        String sql = "SELECT MAX(Price) FROM Book WHERE Price > ?";
        Double maxPrice = getValue(sql, 50.0);
        System.out.println("Max Price > 50: " + maxPrice);
    }

    // Demo: Delete books with price < 10
    private static void demo3() {
        String sql = "DELETE FROM Book WHERE Price < ?";
        int rows = executeUpdate(sql, 10.0);
        System.out.println("Deleted rows: " + rows);
    }

}
