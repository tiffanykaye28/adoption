/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import config.Session;
import config.config;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;





public class admindashboard extends javax.swing.JFrame {
           
          private cardUser cardUser;
    
            public admindashboard() {
                initComponents();
               
                    
            cardUser = new cardUser();
        // Add cards to the panel
        jPanel2.add(cardPets, "cardPets");
        jPanel2.add(cardUser, "cardUser");
        jPanel2.add(cardadoptionrequest1, "cardAdoption");
                    
                
                    CardLayout cl = (CardLayout) jPanel2.getLayout();
                    cl.show(jPanel2, "cardPets");
                    
                    
                    
                    
                    Session sess = Session.getInstance();

                   if (sess == null || sess.getType() == null) {
            JOptionPane.showMessageDialog(null, "Please log in first!");
            new login().setVisible(true); // redirect to login
            this.dispose();
            return;
        }

        if (!"ADMIN".equalsIgnoreCase(sess.getType())) {
            JOptionPane.showMessageDialog(null, "Access Denied! Admins only.");
            new login().setVisible(true); // redirect to login
            this.dispose();
            return;
                     }
                        systemname.setText("PAW PRINTS - " + sess.getFullname());

            }
            
            public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            Session sess = Session.getInstance();
            if (sess == null || sess.getType() == null) {
                JOptionPane.showMessageDialog(null, "Please log in first!");
                new login().setVisible(true);
            } else if (!"ADMIN".equalsIgnoreCase(sess.getType())) {
                JOptionPane.showMessageDialog(null, "Access Denied! Admins only.");
                new login().setVisible(true);
            } else {
                new admindashboard().setVisible(true);
            }
        });
    }
           
           
           


                    
                    
                    


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        systemname = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        usr = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cardadoptionrequest1 = new main.cardadoptionrequest();
        cardPets = new main.cardPets();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(250, 235, 215));
        header.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 235, 215)));
        header.setMaximumSize(new java.awt.Dimension(32767, 80));
        header.setPreferredSize(new java.awt.Dimension(1000, 80));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        systemname.setFont(new java.awt.Font("Georgia", 1, 22)); // NOI18N
        systemname.setForeground(new java.awt.Color(92, 64, 51));
        systemname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        systemname.setText("PAW PRINTS");
        systemname.setPreferredSize(new java.awt.Dimension(200, 30));
        header.add(systemname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 160, 50));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        header.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 60));

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 88));

        usr.setBackground(new java.awt.Color(250, 235, 215));
        usr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        usr.setPreferredSize(new java.awt.Dimension(200, 520));
        usr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(92, 64, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Account Profile");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.setPreferredSize(new java.awt.Dimension(160, 35));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        usr.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 160, 35));

        jButton3.setBackground(new java.awt.Color(92, 64, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Pets");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setFocusPainted(false);
        jButton3.setPreferredSize(new java.awt.Dimension(160, 35));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        usr.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 160, 35));

        jButton4.setBackground(new java.awt.Color(92, 64, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Users");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setFocusPainted(false);
        jButton4.setPreferredSize(new java.awt.Dimension(160, 35));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        usr.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 160, 35));

        jButton5.setBackground(new java.awt.Color(92, 64, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Adoption Requests");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setFocusPainted(false);
        jButton5.setPreferredSize(new java.awt.Dimension(160, 35));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        usr.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 160, 35));

        jButton6.setBackground(new java.awt.Color(92, 64, 51));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Logout");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setFocusPainted(false);
        jButton6.setPreferredSize(new java.awt.Dimension(160, 35));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        usr.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 160, 35));

        jButton7.setBackground(new java.awt.Color(92, 64, 51));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Reports");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setFocusPainted(false);
        jButton7.setPreferredSize(new java.awt.Dimension(160, 35));
        usr.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 160, 35));

        getContentPane().add(usr, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, 83, 220, 520));

        jPanel2.setBackground(new java.awt.Color(250, 235, 215));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 520));
        jPanel2.setLayout(new java.awt.CardLayout());
        jPanel2.add(cardadoptionrequest1, "cardAdoption");
        jPanel2.add(cardPets, "cardPets");

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 790, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
        this.dispose();
        new landingpage().setVisible(true);
     



// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                CardLayout cl = (CardLayout) jPanel2.getLayout();
                cl.show(jPanel2, "cardPets");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
            CardLayout cl = (CardLayout) jPanel2.getLayout();
                cl.show(jPanel2, "cardUser");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            CardLayout cl = (CardLayout) jPanel2.getLayout();
            cl.show(jPanel2, "cardAdoption");
    }//GEN-LAST:event_jButton5ActionPerformed


   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.cardPets cardPets;
    private main.cardadoptionrequest cardadoptionrequest1;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel systemname;
    private javax.swing.JPanel usr;
    // End of variables declaration//GEN-END:variables

}



