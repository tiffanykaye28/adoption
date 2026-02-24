package main;

import config.config;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class browsepets extends javax.swing.JPanel {
config con = new config();
  
    public browsepets() {
        initComponents();
        displayPets();
    }

    public void displayPets() {
        // Query para sa tanang pets
        String sql = "SELECT pet_id, name, type, age, breed, status FROM pets";
        con.displayData(sql, tbl1);
        tbl1.setEnabled(true);
        tbl1.setRowHeight(30);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code"> ... </editor-fold>


    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        status = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 235, 215));
        setPreferredSize(new java.awt.Dimension(790, 510));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 100, 30));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, 30));

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
                "ID", "Pet Name", "Type", "Age", "Breed", "Status"
            }
        ));
        tbl1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbl1.setEnabled(false);
        tbl1.setRowHeight(30);
        jScrollPane2.setViewportView(tbl1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 770, 410));

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Adopted", " ", " " }));
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
        add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 130, 40));

        jButton6.setText("Sponsor");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 100, 30));

        jButton7.setText("View Details");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 100, 30));

        jButton8.setText("Adopt");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 100, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        int row = tbl1.getSelectedRow();
    
    // 1. Siguroha nga naay gi-select sa table
    if (row == -1) {
        JOptionPane.showMessageDialog(this, "Please select a pet from the table first!");
        return;
    }

    // 2. Kuhaon ang data sa pet (Column 1 = Name, Column 5 = Status)
    String petName = tbl1.getValueAt(row, 1).toString();
    String petStatus = tbl1.getValueAt(row, 5).toString();

    // 3. Check kung adopted na
    if (petStatus.equalsIgnoreCase("Adopted")) {
        JOptionPane.showMessageDialog(this, "Sorry, this pet is already adopted.");
        return;
    }

    // 4. Pagbalhin sa Adoption Form
    try {
        userdashboard dash = (userdashboard) SwingUtilities.getWindowAncestor(this);
        
        // Gamita ang 'af' kay mao na ang imong gi-declare sa dashboard
        dash.af.prepareForm(petName); 
        
        // Gamita ang 'showCard' method nga naa sa imong dashboard
        dash.showCard("adoptionform"); 
        
    } catch (Exception e) {
        System.out.println("Error Navigation: " + e.getMessage());
    }
    }//GEN-LAST:event_statusActionPerformed

    private void statusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_statusKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusKeyPressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      int row = tbl1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a pet from the table!");
            return;
        }

        String petName = tbl1.getValueAt(row, 1).toString();
        String petStatus = tbl1.getValueAt(row, 5).toString();

        if (petStatus.equalsIgnoreCase("Adopted")) {
            JOptionPane.showMessageDialog(this, "Sorry, this pet is already adopted.");
            return;
        }

        userdashboard dash = (userdashboard) SwingUtilities.getWindowAncestor(this);
        if (dash != null) {
            dash.af.prepareForm(petName); 
            dash.showCard("adoptionform");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      String keyword = jTextField1.getText();
        String sql = "SELECT * FROM pets WHERE name LIKE ? OR breed LIKE ?";
        con.displayData(sql, tbl1, "%"+keyword+"%", "%"+keyword+"%");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTable tbl1;
    // End of variables declaration//GEN-END:variables
}
