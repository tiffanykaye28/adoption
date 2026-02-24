
package main;

import config.Session;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;


public class userdashboard extends javax.swing.JFrame {  
 
 
    public browsepets bp = new browsepets();
    public adoptionform af = new adoptionform();
    
     public userdashboard() {
        initComponents();
        
  // 1. Check Session Security - Mao ni ang moprotekta sa imong dashboard
Session sess = Session.getInstance();
        if (sess == null || sess.getType() == null) {
            JOptionPane.showMessageDialog(null, "Please log in first!");
            new login().setVisible(true);
            this.dispose();
            return;
        }
        
        systemname.setText("PAW PRINTS - " + sess.getFullname());

        // I-add ang tanang panels sa imong CardLayout container (jPanel2)
        jPanel2.add(new Udashboard(), "dashboard");
        jPanel2.add(bp, "browsepets"); // I-add ang browsepets panel
        jPanel2.add(af, "adoptionform"); // I-add ang adoptionform panel

        // Default view: Dashboard
        showCard("dashboard");
        resetNavColors();
        jButton7.setBackground(new java.awt.Color(120, 80, 60));
    }

    // Helper method para dali ra ang pagbalhin-balhin og panel
    public void showCard(String cardName) {
        CardLayout cl = (CardLayout) jPanel2.getLayout();
        cl.show(jPanel2, cardName);
    }

    private void resetNavColors() {
        Color defaultColor = new java.awt.Color(92, 64, 51);
        jButton7.setBackground(defaultColor); // Dashboard
        jButton4.setBackground(defaultColor); // Account Profile
        jButton10.setBackground(defaultColor); // Browse Pets
    }    


    
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        accountprofileu11 = new main.accountprofileu1();
        editprofileuser1 = new main.editprofileuser();
        header = new javax.swing.JPanel();
        systemname = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 235, 215));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 520));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(92, 64, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Logout");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setFocusPainted(false);
        jButton3.setPreferredSize(new java.awt.Dimension(160, 35));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 160, 35));

        jButton4.setBackground(new java.awt.Color(92, 64, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Account Profile ");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setFocusPainted(false);
        jButton4.setPreferredSize(new java.awt.Dimension(160, 35));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 160, 35));

        jButton5.setBackground(new java.awt.Color(92, 64, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Sponsor a Pet ");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setFocusPainted(false);
        jButton5.setPreferredSize(new java.awt.Dimension(160, 35));
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 160, 35));

        jButton6.setBackground(new java.awt.Color(92, 64, 51));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Adoption Requests ");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setFocusPainted(false);
        jButton6.setPreferredSize(new java.awt.Dimension(160, 35));
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 160, 35));

        jButton7.setBackground(new java.awt.Color(92, 64, 51));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Dashboard");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setFocusPainted(false);
        jButton7.setPreferredSize(new java.awt.Dimension(160, 35));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 160, 35));

        jButton8.setBackground(new java.awt.Color(92, 64, 51));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Tips & Advice");
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setFocusPainted(false);
        jButton8.setPreferredSize(new java.awt.Dimension(160, 35));
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 160, 35));

        jButton9.setBackground(new java.awt.Color(92, 64, 51));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("About Us");
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setFocusPainted(false);
        jButton9.setPreferredSize(new java.awt.Dimension(160, 35));
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, 35));

        jButton10.setBackground(new java.awt.Color(92, 64, 51));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Browse Pets");
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setFocusPainted(false);
        jButton10.setPreferredSize(new java.awt.Dimension(160, 35));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 160, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, 500));

        jPanel2.setBackground(new java.awt.Color(250, 235, 215));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 520));
        jPanel2.setLayout(new java.awt.CardLayout());
        jPanel2.add(accountprofileu11, "card2");
        jPanel2.add(editprofileuser1, "card3");

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 800, 500));

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

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        this.dispose();
        new login().setVisible(true);
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    resetNavColors();
    jButton7.setBackground(new java.awt.Color(120, 80, 60));

    // Reload Udashboard to refresh data
    Udashboard ud = new Udashboard(); 
    jPanel2.add(ud, "dashboard"); 
    CardLayout cl = (CardLayout) jPanel2.getLayout();
    cl.show(jPanel2, "dashboard");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    resetNavColors();
    jButton4.setBackground(new java.awt.Color(120, 80, 60));

    accountprofileu11.setUserData();
    
    CardLayout cl = (CardLayout) jPanel2.getLayout();
    cl.show(jPanel2, "card2");
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
resetNavColors();
        jButton10.setBackground(new java.awt.Color(120, 80, 60));
        bp.displayPets(); // I-refresh ang table list
        showCard("browsepets");    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * @param args the command line arguments
     */
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public main.accountprofileu1 accountprofileu11;
    public main.editprofileuser editprofileuser1;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel systemname;
    // End of variables declaration//GEN-END:variables
}
