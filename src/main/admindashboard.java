/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import config.config;


public class admindashboard extends javax.swing.JFrame {

      public admindashboard() {
      initComponents();
      loadUsers();
    }
                public admindashboard(String fullname, String email, String type) {
                    initComponents();
                    jLabel2.setText("Name: " + fullname);
                    jLabel3.setText("Email: " + email);
                    jLabel4.setText("Type: " + type);
                    
                    loadUsers();
                }
                    public void loadUsers(){
                    String sql = "SELECT fullname, email, type status FROM accounts";
                   
                    config con = new config();
                    con.displayData(sql, jTable1);
                    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        systemname = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

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

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 22)); // NOI18N
        jLabel1.setText("WELCOME");
        jLabel1.setPreferredSize(new java.awt.Dimension(160, 50));
        header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 180, 40));

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, -1, 88));

        jPanel1.setBackground(new java.awt.Color(250, 235, 215));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 520));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(92, 64, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reports");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.setPreferredSize(new java.awt.Dimension(160, 35));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 160, 35));

        jButton3.setBackground(new java.awt.Color(92, 64, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Pets");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setFocusPainted(false);
        jButton3.setPreferredSize(new java.awt.Dimension(160, 35));
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 160, 35));

        jButton4.setBackground(new java.awt.Color(92, 64, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Users");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setFocusPainted(false);
        jButton4.setPreferredSize(new java.awt.Dimension(160, 35));
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 160, 35));

        jButton5.setBackground(new java.awt.Color(92, 64, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Adoption Requests");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setFocusPainted(false);
        jButton5.setPreferredSize(new java.awt.Dimension(160, 35));
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 160, 35));

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
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 160, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, 83, 220, 500));

        jPanel2.setBackground(new java.awt.Color(250, 235, 215));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 520));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Name :  ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Email : ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Type : ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, -1, -1));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Full Name", "Email", "Type", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        jTable1.setDefaultEditor(Object.class, null);
        jTable1.setFocusable(true);
        jTable1.requestFocusInWindow();
        jTable1.setPreferredSize(new java.awt.Dimension(740, 300));
        jTable1.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 720, 370));

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 790, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            loadUsers();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
        this.dispose();
        new landingpage().setVisible(true);
     



// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed


    public static void main(String args[]) {
     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                        String fullname = "adminkaye";
                        String email = "admin";
                        String type = "ADMIN";
                new admindashboard(fullname, email, type).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel systemname;
    // End of variables declaration//GEN-END:variables
}
