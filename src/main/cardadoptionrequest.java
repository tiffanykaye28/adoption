package main;

import config.config;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;


public class cardadoptionrequest extends javax.swing.JPanel {

    config con = new config();

    public cardadoptionrequest() {
        initComponents();
        loadRequests(); // I-load ang data sa pagsugod

        // Automatic search samtang nag-type sa jTextField1
        jTextField1.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) { searchRequest(); }
            @Override
            public void removeUpdate(DocumentEvent e) { searchRequest(); }
            @Override
            public void changedUpdate(DocumentEvent e) { searchRequest(); }
        });
    }

    // 1. LOAD ALL DATA
    public void loadRequests() {
       // Siguroha nga 'adoption_requests' ang table name sa imong pets.db
  String sql = "SELECT app_id AS 'ID', pet_name AS 'Pet Name', applicant_name AS 'Applicant Name', email AS 'Email', status AS 'Status' FROM applications";
    
    con.displayData(sql, tbl1);
    
    tbl1.setEnabled(true); 
    tbl1.setRowHeight(30);
    System.out.println("Data loaded from applications table.");
    }

    // 2. SEARCH DATA
    private void searchRequest() {
        String keyword = jTextField1.getText();
        String sql = "SELECT request_id AS 'ID', pet_name AS 'Pet Name', owner_name AS 'Owner Name', "
                   + "request_date AS 'Request Date', status AS 'Status' FROM adoption_requests "
                   + "WHERE pet_name LIKE ? OR owner_name LIKE ?";
        con.displayData(sql, tbl1, "%" + keyword + "%", "%" + keyword + "%");
        formatTable();
    }

    // 3. FILTER BY STATUS
    private void filterByStatus() {
        String selected = status.getSelectedItem().toString().trim();
        
        if (selected.equalsIgnoreCase("All") || selected.isEmpty()) {
            loadRequests();
        } else {
            String sql = "SELECT request_id AS 'ID', pet_name AS 'Pet Name', owner_name AS 'Owner Name', "
                       + "request_date AS 'Request Date', status AS 'Status' FROM adoption_requests "
                       + "WHERE status = ?";
            con.displayData(sql, tbl1, selected);
        }
        formatTable();
    }

    // 4. UPDATE STATUS (APPROVE/REJECT)
    private void updateRequestStatus(String newStatus) {
        int row = tbl1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a request from the table first.");
            return;
        }

        String requestId = tbl1.getValueAt(row, 0).toString();
        String petName = tbl1.getValueAt(row, 1).toString();

        int confirm = JOptionPane.showConfirmDialog(this, 
                "Are you sure you want to " + newStatus.toLowerCase() + " the adoption request for " + petName + "?", 
                "Confirm Action", 
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            String sqlUpdate = "UPDATE applications SET status = ? WHERE app_id = ?";
             con.addRecord(sqlUpdate, newStatus, requestId);
            
            if (newStatus.equals("Approve")) {
                String sqlPet = "UPDATE pets SET status = 'Adopted' WHERE p_name = ?"; 
                con.addRecord(sqlPet, petName);
                JOptionPane.showMessageDialog(this, "Request Approved! " + petName + " is now marked as Adopted.");
            } else {
                JOptionPane.showMessageDialog(this, "Request Rejected.");
            }

            loadRequests(); 
        }
    }

    private void formatTable() {
        tbl1.setEnabled(true); 
        tbl1.setRowHeight(30);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        status = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 235, 215));
        setPreferredSize(new java.awt.Dimension(790, 510));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADOPTION REQUESTS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 220, 50));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 180, 30));

        jButton2.setText("SEARCH");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 100, 30));

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending\t", "Approve", "Rejected", " " }));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        status.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                statusKeyPressed(evt);
            }
        });
        add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 130, 40));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(770, 470));

        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Pet Name", "Owner Name", "Request Date", "Status"
            }
        ));
        tbl1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbl1.setEnabled(false);
        tbl1.setRowHeight(30);
        jScrollPane2.setViewportView(tbl1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 107, 770, 330));

        jButton4.setText("View Details");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 100, 30));

        jButton5.setText("Approve");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 100, 30));

        jButton6.setText("Reject");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 100, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
            filterByStatus();
    }//GEN-LAST:event_statusActionPerformed

    private void statusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_statusKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        updateRequestStatus("Approve");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        updateRequestStatus("Rejected");
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTable tbl1;
    // End of variables declaration//GEN-END:variables
}
