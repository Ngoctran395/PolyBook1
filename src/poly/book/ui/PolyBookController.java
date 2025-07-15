/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poly.book.ui;

import poly.book.ui.manager.CategoryManagerJDialog;
import javax.swing.JDialog;
import javax.swing.JFrame;
import poly.book.ui.manager.BillManagerJDialog;
import poly.book.ui.manager.BookManagerJDialog;
import poly.book.ui.manager.CustomerManagerJDialog;
import poly.book.ui.manager.RevenueManagerJDialog;
import poly.book.ui.manager.UserManagerJDialog;
import poly.book.util.XDialog;


/**
 *
 * @author Dell
 */
public interface PolyBookController {

    void init();

     default void exit() {
        if (XDialog.confirm("Bạn muốn kết thúc?")) {
            System.exit(0);
        }
    }

    default void showJDialog(JDialog dialog) {
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

    default void showWelcomeJDialog(JFrame frame) {
        this.showJDialog(new WelcomeJDialog(frame, true));
    }

    default void showLoginJDialog(JFrame frame) {
        this.showJDialog(new LoginJDialog(frame, true));
    }

    default void showChangePasswordJDialog(JFrame frame) {
        this.showJDialog(new ChangePasswordJDialog(frame, true));
    }

    default void showBillJDialog(JFrame frame) {
        this.showJDialog(new BillJDialog(frame, true));
    }

    default void showHistoryJDialog(JFrame frame) {
        this.showJDialog(new HistoryJDialog(frame, true));
    }

    default void showBookManagerJDialog(JFrame frame) {
        this.showJDialog(new BookManagerJDialog(frame, true));

    }

    default void showCategoryManagerJDialog(JFrame frame) {
        this.showJDialog(new CategoryManagerJDialog(frame, true));
    }

    default void showBillManagerJDialog(JFrame frame) {
        this.showJDialog(new BillManagerJDialog(frame, true));
    }

    default void showUserManagerJDialog(JFrame frame) {
        this.showJDialog(new UserManagerJDialog(frame, true));
    }

    default void showCustomerManagerJDialog(JFrame frame) {
        this.showJDialog(new CustomerManagerJDialog(frame, true));
    }

    default void showRevenueManagerJDialog(JFrame frame) {
        this.showJDialog(new RevenueManagerJDialog(frame, true));
    }
}
