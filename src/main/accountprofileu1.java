package main;


import config.Session;
import java.awt.CardLayout;
import java.awt.Container;
import javax.swing.SwingUtilities;


public class accountprofileu1 extends javax.swing.JPanel {
   
    public accountprofileu1() {
        initComponents();
    }
    
   public void setUserData() {
       Session sess = Session.getInstance();
        if (sess != null) {
            // Siguroha nga i-reset ang checkbox inig load sa data
            jCheckBox1.setSelected(false); 
            
            jLabel5.setText("Full Name : " + (sess.getFullname() != null ? sess.getFullname() : ""));
            jLabel6.setText("Username  : " + (sess.getUsername() != null ? sess.getUsername() : ""));
            jLabel7.setText("Email     : " + (sess.getEmail() != null ? sess.getEmail() : ""));
            jLabel9.setText("Contact   : " + (sess.getContact() != null ? sess.getContact() : ""));
            
            // Tawgon ang maskPassword aron asterisk ang makita sa sugod
            maskPassword();
        }

    }
    
   private void maskPassword() {
          Session sess = Session.getInstance();
        String pass = (sess.getPassword() != null) ? sess.getPassword().toString() : "";
        
        if (!pass.isEmpty()) {
            // Gi-mask ang password (asterisks)
            jLabel4.setText("Password  : " + pass.replaceAll(".", "*"));
        } else {
            // Default kung walay sulod
            jLabel4.setText("Password  : ********");
    }    
   }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(250, 235, 215));
        setPreferredSize(new java.awt.Dimension(790, 510));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ACCOUNT PROFILE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 230, 40));

        jLabel8.setText("Personal Information");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 220, 30));
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jLabel2.setText("Account Type : USER ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 210, 30));

        jButton1.setText("EDIT PROFILE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 150, 30));

        jLabel4.setText("Password : ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 190, 20));

        jLabel5.setText("Full Name : ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 190, 20));

        jLabel6.setText("Username :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 190, 20));

        jLabel7.setText("Email : ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 190, 20));

        jLabel9.setText("Contact : ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 190, 20));

        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Container parent = this.getParent();
        if (parent != null && parent.getLayout() instanceof CardLayout) {
            userdashboard ds = (userdashboard) SwingUtilities.getWindowAncestor(this);
            // Load data to edit fields and show the edit panel
            ds.editprofileuser1.loadUserData(); 
            CardLayout cl = (CardLayout) parent.getLayout();
            cl.show(parent, "card3"); // Card3 = Edit Profile
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
   Session sess = Session.getInstance();
        if (jCheckBox1.isSelected()) {
            // Ipakita ang tinuod nga password
            jLabel4.setText("Password : " + (sess.getPassword() != null ? sess.getPassword() : ""));
        } else {
            // Itago pag-usab
            maskPassword();
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    

}