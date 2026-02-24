package main;

import config.Session;
import config.config;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class adoptionform extends javax.swing.JPanel {
    config con = new config();
    String currentPetName = "";
   
public adoptionform() {
        initComponents();
    }

    public void prepareForm(String petName) {
        Session sess = Session.getInstance();
        this.currentPetName = petName; // I-save ang pet name sa variable
        
        jLabel18.setText("Pet Name : " + petName);
        jLabel19.setText("Applicant Name : " + sess.getFullname());
        jLabel20.setText("Email : " + sess.getEmail());
        
        // Default text para sa uban fields
        jLabel21.setText("Phone : ");
        jLabel22.setText("Address : ");
        jLabel23.setText("Reason for Adoption : ");
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 235, 215));
        setPreferredSize(new java.awt.Dimension(790, 510));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ADOPTION FORM");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 230, 40));

        jButton6.setText("Submit Request");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 140, 30));

        jButton7.setText("Cancel");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 100, 30));

        jLabel18.setText("Pet Name : ");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel19.setText("Applicant Name :");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel20.setText("Email : ");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel21.setText("Phone : ");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel22.setText("Address : ");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel23.setText("Reason for Adoption : ");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     Session sess = Session.getInstance();
        
        if (currentPetName.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Error: No pet selected.");
        return;
    }

    // SQL insert query
    String sql = "INSERT INTO applications (pet_name, applicant_name, email, status) VALUES (?, ?, ?, 'Pending')";
    
    try {
        // Gamiton nato ang addRecord method kay mao ra ni ang available sa imong config
        con.addRecord(sql, currentPetName, sess.getFullname(), sess.getEmail());
        
        JOptionPane.showMessageDialog(this, "Application Submitted! Status: PENDING");
        
        // Balik sa Browse Pets human og submit
        userdashboard dash = (userdashboard) SwingUtilities.getWindowAncestor(this);
        dash.showCard("browsepets");
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error submitting application: " + e.getMessage());
    }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
userdashboard dash = (userdashboard) SwingUtilities.getWindowAncestor(this);
        dash.showCard("browsepets");
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    // End of variables declaration//GEN-END:variables

 
}
