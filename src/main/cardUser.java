package main;

import config.config;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableModel;


public class cardUser extends javax.swing.JPanel {

        config con = new config();
        

    public cardUser() {
        initComponents();
        loadUsers();
        initButtons();    
        

      search.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(DocumentEvent e) { searchUser(); }
            public void removeUpdate(DocumentEvent e) { searchUser(); }
            public void changedUpdate(DocumentEvent e) { searchUser(); }
        });
    }

    
 
        private void loadUsers() {
        String sql = "SELECT a_id, username, email, contact, status FROM accounts";
        con.displayData(sql, tbl1);
        tbl1.setEnabled(true); // para ma-select ang rows
        tbl1.setRowHeight(30);
        tbl1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);

        
        
        }
         private void initButtons() {
        btnAdd.addActionListener((ActionEvent e) -> addUser());
        btnUpdate.addActionListener((ActionEvent e) -> updateUser());
        btnDelete.addActionListener((ActionEvent e) -> deleteUser());
        btnRefresh.addActionListener((ActionEvent e) -> refreshUsers());
        btnSearch.addActionListener((ActionEvent e) -> searchUser());
        
         }
         
         private void addUser() {
         
        String fullname = JOptionPane.showInputDialog(this, "Enter Fullname:");
        if(fullname == null || fullname.isEmpty()) return;    
             
        String username = JOptionPane.showInputDialog(this, "Enter Username:");
        if(username == null || username.isEmpty()) return;

        String email = JOptionPane.showInputDialog(this, "Enter Email:");
        if(email == null || email.isEmpty()) return;

        String contact = JOptionPane.showInputDialog(this, "Enter Contact:");
        if(contact == null || contact.isEmpty()) return;

        String status = JOptionPane.showInputDialog(this, "Enter Status:");
        if(status == null || status.isEmpty()) return;

        String sql = "INSERT INTO accounts(fullname, username,email,contact,status) VALUES(?,?,?,?, ?)";
        config con = new config();
        con.addRecord(sql, fullname, username, email, contact, status);

        loadUsers();
    
         }

         
           private void updateUser() {
       int row = tbl1.getSelectedRow();
    if (row == -1) {
        JOptionPane.showMessageDialog(this, "Select a user first!");
        return;
    }
    
    Object idObj = tbl1.getValueAt(row, 0);
    int a_id = Integer.parseInt(idObj.toString());

    String username = JOptionPane.showInputDialog(this, "Edit Username:", tbl1.getValueAt(row, 1));
    String email = JOptionPane.showInputDialog(this, "Edit Email:", tbl1.getValueAt(row, 2));
    String contact = JOptionPane.showInputDialog(this, "Edit Contact:", tbl1.getValueAt(row, 3));
    String status = JOptionPane.showInputDialog(this, "Edit Status:", tbl1.getValueAt(row, 4));

    if (username == null || email == null || contact == null || status == null) return;

    // GI-USAB: Gihimo kining 'a_id' gikan sa 'id'
    String sql = "UPDATE accounts SET username=?, email=?, contact=?, status=? WHERE a_id=?";
    con.addRecord(sql, username, email, contact, status, a_id);

    loadUsers();
    }
           
           private void deleteUser() {
        int row = tbl1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Select a user first!");
            return;
        }
        
         Object idObj = tbl1.getValueAt(row, 0);
        int a_id = Integer.parseInt(idObj.toString());

        int confirm = JOptionPane.showConfirmDialog(this, "Delete this user?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) return;

        String sql = "DELETE FROM accounts WHERE a_id=?";
        con.addRecord(sql, a_id);

        loadUsers();
    }
           
            private void refreshUsers() {
                        search.setText("");

  
    }
        

    // ========================= Search Users =========================
    private void searchUser() {
        String keyword = search.getText();
        if (keyword.isEmpty()) {
            loadUsers();
            return;
        }
        String sql = "SELECT a_id, username, email, contact, status FROM accounts "
                   + "WHERE username LIKE ? OR email LIKE ? OR contact LIKE ?";
        config con = new config();
        con    .displayData(sql, tbl1, "%" + keyword + "%", "%" + keyword + "%", "%" + keyword + "%");
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearch = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(250, 235, 215));
        setPreferredSize(new java.awt.Dimension(790, 510));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSearch.setText("SEARCH");
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 100, 30));

        btnAdd.setBackground(new java.awt.Color(92, 64, 51));
        btnAdd.setText("ADD");
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 30));

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 100, 30));

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 100, 30));

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchKeyTyped(evt);
            }
        });
        add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 180, 30));

        btnRefresh.setText("REFRESH");
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 100, 30));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(770, 470));

        tbl1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbl1.setEnabled(false);
        tbl1.setRowHeight(30);
        jScrollPane2.setViewportView(tbl1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 57, 770, 450));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyTyped
       String keyword = search.getText().trim();
        if (keyword.isEmpty()) {
            loadUsers();
            return;
        }

        String sql = "SELECT a_id, username, email, contact, status FROM accounts "
                   + "WHERE a_id LIKE ? OR username LIKE ? OR email LIKE ? OR contact LIKE ? OR status LIKE ?";
        con.displayData(sql, tbl1,
                        "%" + keyword + "%",
                        "%" + keyword + "%",
                        "%" + keyword + "%",
                        "%" + keyword + "%",
                        "%" + keyword + "%");
    }//GEN-LAST:event_searchKeyTyped

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField search;
    private javax.swing.JTable tbl1;
    // End of variables declaration//GEN-END:variables

            public void insertUpdate(DocumentEvent de) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            public void removeUpdate(DocumentEvent de) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            public void changedUpdate(DocumentEvent de) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }
