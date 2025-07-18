/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package poly.book.ui.manager;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import poly.book.dao.CategoryController;
import poly.book.dao.CategoryDAO;
import poly.book.dao.impl.CategoryDAOImpl;
import poly.book.entity.Category;
import poly.book.util.XDialog;

/**
 *
 * @author Dell
 */
public class CategoryManagerJDialog extends javax.swing.JDialog implements CategoryController {

    /**
     * Creates new form CategoryManagerJDialog
     */
    public CategoryManagerJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Quản lý loại sách");
}    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCategoryId = new javax.swing.JTextField();
        txtCategoryName = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategory = new javax.swing.JTable();
        btnCheckAll = new javax.swing.JButton();
        btnUncheckAll = new javax.swing.JButton();
        btnDeleteCheckedItems = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ LOẠI SÁCH");

        jLabel2.setText("Mã loại sách");

        jLabel3.setText("Tên loại sách");

        txtCategoryId.setBackground(new java.awt.Color(209, 231, 253));
        txtCategoryId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoryIdActionPerformed(evt);
            }
        });

        txtCategoryName.setBackground(new java.awt.Color(209, 231, 253));

        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/book/icons/Icon Application/Icon Application/Add.png"))); // NOI18N
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/book/icons/Icon Application/Icon Application/Edit.png"))); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/book/icons/Icon Application/Icon Application/Delete.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/book/icons/Icon Application/Icon Application/Refresh.png"))); // NOI18N
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(242, 242, 242));
        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tblCategory.setBackground(new java.awt.Color(242, 242, 242));
        tblCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã loại sách", "Tên loại sách", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCategory);

        btnCheckAll.setText("Chọn tất cả");
        btnCheckAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckAllActionPerformed(evt);
            }
        });

        btnUncheckAll.setText("Bỏ chọn tất cả");
        btnUncheckAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUncheckAllActionPerformed(evt);
            }
        });

        btnDeleteCheckedItems.setText("Xóa các mục đã chọn");
        btnDeleteCheckedItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCheckedItemsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCategoryId, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(btnCheckAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUncheckAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeleteCheckedItems)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCategoryId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreate))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheckAll)
                    .addComponent(btnDeleteCheckedItems)
                    .addComponent(btnUncheckAll))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        this.create();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        this.update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        this.delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        this.clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtCategoryIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoryIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoryIdActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.open();
    }//GEN-LAST:event_formWindowOpened

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void tblCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoryMouseClicked
        // TODO add your handling code here:
       if (evt.getClickCount() == 1) {
            this.edit();
        }
    }//GEN-LAST:event_tblCategoryMouseClicked

    private void btnCheckAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckAllActionPerformed
        // TODO add your handling code here:
        this.checkAll();
    }//GEN-LAST:event_btnCheckAllActionPerformed

    private void btnUncheckAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUncheckAllActionPerformed
        // TODO add your handling code here:
        this.uncheckAll();
    }//GEN-LAST:event_btnUncheckAllActionPerformed

    private void btnDeleteCheckedItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCheckedItemsActionPerformed
        // TODO add your handling code here:
        this.deleteCheckedItems();
    }//GEN-LAST:event_btnDeleteCheckedItemsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CategoryManagerJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoryManagerJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoryManagerJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoryManagerJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CategoryManagerJDialog dialog = new CategoryManagerJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
// Khai báo DAO và danh sách
    CategoryDAO dao = new CategoryDAOImpl();
    List<Category> items = new ArrayList<>();

// Mở dialog
    @Override
    public void open() {
        this.setLocationRelativeTo(null);
        this.fillToTable();
        this.clear();
    }

// Đổ dữ liệu vào bảng
    @Override
    public void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) tblCategory.getModel();
        model.setRowCount(0);
        items = dao.findAll();

        for (Category item : items) {
            Object[] rowData = {
                item.getCategoryID(),
                item.getCategoryName()
            };
            model.addRow(rowData);
        }
    }

// Hiển thị dữ liệu từ dòng được chọn lên form
    @Override
    public void edit() {
        int selectedRow = tblCategory.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dòng cần sửa!");
            return;
        }

        Category entity = items.get(selectedRow);
        this.setForm(entity);
        this.setEditable(true);
    }
@Override
    public void checkAll() {
        this.setCheckedAll(true);
    }

    @Override
    public void uncheckAll() {
        this.setCheckedAll(false);
    }

    private void setCheckedAll(boolean checked) {
        for (int i = 0; i < tblCategory.getRowCount(); i++) {
            tblCategory.setValueAt(checked, i, 2);
        }
    }

    @Override
    public void deleteCheckedItems() {
        if (XDialog.confirm("Bạn thực sự muốn xóa các mục chọn?")) {
            for (int i = 0; i < tblCategory.getRowCount(); i++) {
                if ((Boolean) tblCategory.getValueAt(i, 2)) {
                    dao.deleteById(items.get(i).getCategoryID());
                }
            }
            this.fillToTable();
        }
    }

// Đặt dữ liệu vào form
    @Override
    public void setForm(Category entity) {
        txtCategoryId.setText(entity.getCategoryID());
        txtCategoryName.setText(entity.getCategoryName());
    }

// Lấy dữ liệu từ form
    @Override
    public Category getForm() {
        Category entity = new Category();
        entity.setCategoryID(txtCategoryId.getText().trim());
        entity.setCategoryName(txtCategoryName.getText().trim());
        return entity;
    }

// Tạo mới
    @Override
    public void create() {
        Category entity = this.getForm();
        String id = entity.getCategoryID();
        String name = entity.getCategoryName();

        if (id.isEmpty() || name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!");
            return;
        }

        if (!id.matches("^S\\d+$")) {
            JOptionPane.showMessageDialog(this, "Mã loại không hợp lệ! Phải có dạng: S + số (VD: S01, S5...)");
            return;
        }

        if (dao.findById(id) != null) {
            JOptionPane.showMessageDialog(this, "ID này đã tồn tại! Vui lòng nhập ID khác.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            dao.create(entity);
            this.fillToTable();
            this.clear();
            JOptionPane.showMessageDialog(this, "Tạo thành công!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Tạo thất bại: " + e.getMessage());
        }
    }

// Cập nhật
    @Override
    public void update() {
        Category entity = this.getForm();
        if (entity.getCategoryID().isEmpty() || entity.getCategoryName().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!");
            return;
        }

        try {
            dao.update(entity);
            this.fillToTable();
            JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Cập nhật thất bại: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

// Xóa
  @Override
    public void delete() {
        if (XDialog.confirm("Bạn thực sự muốn xóa?")) {
            try {
                String id = txtCategoryId.getText();
                dao.deleteById(id);
                this.fillToTable();
                this.clear();
                JOptionPane.showMessageDialog(this, "Xóa thành công!");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Xóa thất bại: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

// Xóa trắng form
    @Override
    public void clear() {
        this.setForm(new Category());
        this.setEditable(false);
        tblCategory.clearSelection();
    }

// Thiết lập chế độ chỉnh sửa
    @Override
    public void setEditable(boolean editable) {
        txtCategoryId.setEnabled(!editable);   // Không cho sửa mã khi cập nhật
        btnCreate.setEnabled(!editable);
        btnUpdate.setEnabled(editable);
        btnDelete.setEnabled(editable);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckAll;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteCheckedItems;
    private javax.swing.JButton btnUncheckAll;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCategory;
    private javax.swing.JTextField txtCategoryId;
    private javax.swing.JTextField txtCategoryName;
    // End of variables declaration//GEN-END:variables

   

    @Override
    public void moveFirst() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void movePrevious() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveNext() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveLast() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveTo(int rowIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
}
