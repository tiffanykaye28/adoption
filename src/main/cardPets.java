package main;

import config.config;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;

public class cardPets extends javax.swing.JPanel {

  config conf = new config();
    
    public cardPets() {
        initComponents();
        loadPets();
        initButtons();
        
        searchField.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(DocumentEvent e) { searchPet(); }
            public void removeUpdate(DocumentEvent e) { searchPet(); }
            public void changedUpdate(DocumentEvent e) { searchPet(); }
        });
    }

    private void loadPets() {
        // Query base sa imong SQLiteStudio screenshot
        String sql = "SELECT pet_id, name, type, age, status FROM pets";
        conf.displayData(sql, tbl1);
        tbl1.setEnabled(true); 
        tbl1.setRowHeight(30);
    }
    
    private void initButtons() {
        btnAdd.addActionListener((ActionEvent e) -> addPet());
        btnUpdate.addActionListener((ActionEvent e) -> updatePet());
        btnDelete.addActionListener((ActionEvent e) -> deletePet());
        btnRefresh.addActionListener((ActionEvent e) -> loadPets());
    }
    
    private void addPet() {
        String name = JOptionPane.showInputDialog(this, "Enter Pet Name:");
        if (name == null || name.isEmpty()) return;

        String type = JOptionPane.showInputDialog(this, "Enter Type (Dog/Cat/etc):");
        if (type == null || type.isEmpty()) return;

        String ageStr = JOptionPane.showInputDialog(this, "Enter Age:");
        if (ageStr == null || ageStr.isEmpty()) return;

        String status = JOptionPane.showInputDialog(this, "Enter Status (Available/Adopted):");
        if (status == null || status.isEmpty()) return;

        String sql = "INSERT INTO pets (name, type, age, status) VALUES (?, ?, ?, ?)";
        conf.addRecord(sql, name, type, Integer.parseInt(ageStr), status);

        loadPets();
    }
private void updatePet() {
        int row = tbl1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a pet first!");
            return;
        }

        int pet_id = Integer.parseInt(tbl1.getValueAt(row, 0).toString());

        String name = JOptionPane.showInputDialog(this, "Edit Name:", tbl1.getValueAt(row, 1));
        String type = JOptionPane.showInputDialog(this, "Edit Type:", tbl1.getValueAt(row, 2));
        String age = JOptionPane.showInputDialog(this, "Edit Age:", tbl1.getValueAt(row, 3));
        String status = JOptionPane.showInputDialog(this, "Edit Status:", tbl1.getValueAt(row, 4));

        if (name == null || type == null || age == null || status == null) return;

        String sql = "UPDATE pets SET name=?, type=?, age=?, status=? WHERE pet_id=?";
        conf.addRecord(sql, name, type, Integer.parseInt(age), status, pet_id);

        loadPets();
    }
    private void deletePet() {
        int row = tbl1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Select a pet first!");
            return;
        }

        int pet_id = Integer.parseInt(tbl1.getValueAt(row, 0).toString());
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure to delete?", "Confirm", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM pets WHERE pet_id=?";
            conf.addRecord(sql, pet_id);
            loadPets();
        }
    }

    private void searchPet() {
        String keyword = searchField.getText();
        String sql = "SELECT pet_id, name, type, age, status FROM pets "
                   + "WHERE name LIKE ? OR type LIKE ? OR status LIKE ?";
        conf.displayData(sql, tbl1, "%" + keyword + "%", "%" + keyword + "%", "%" + keyword + "%");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(250, 235, 215));
        setPreferredSize(new java.awt.Dimension(790, 510));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 100, 30));

        btnAdd.setBackground(new java.awt.Color(92, 64, 51));
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
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

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 180, 30));

        btnRefresh.setText("REFRESH");
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 100, 30));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(770, 470));

        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Pet Name", "Type", "Age", "Gender", "Status"
            }
        ));
        tbl1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbl1.setEnabled(false);
        tbl1.setRowHeight(30);
        jScrollPane2.setViewportView(tbl1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 57, 770, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
deletePet();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        searchField.setText("");
        loadPets();
    }//GEN-LAST:event_searchFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
addPet();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
updatePet();
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField searchField;
    private javax.swing.JTable tbl1;
    // End of variables declaration//GEN-END:variables
}
