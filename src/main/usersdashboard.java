
package main;


public class usersdashboard extends javax.swing.JFrame {

        private String fullname;
        private String email;
        private String type;
    
    
    public usersdashboard(String fullname, String email, String type) {
        this.fullname = fullname;
        this.email = email;
        this.type = type;
        initComponents();
        loadUserInfo();
    }
    
        public usersdashboard(){
            this.fullname = "pani";
            this.email = "pani";
            this.type = "USER";
            initComponents();
            loadUserInfo();
                   
        }

         private void loadUserInfo() {
         jLabel2.setText("Name: " + fullname);       
         jLabel3.setText("Email: " + email);
         jLabel4.setText("Type: " + type);
}

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        header = new javax.swing.JPanel();
        systemname = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));
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
        jButton4.setText("Profile");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setFocusPainted(false);
        jButton4.setPreferredSize(new java.awt.Dimension(160, 35));
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 160, 35));

        jButton5.setBackground(new java.awt.Color(92, 64, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Pets");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setFocusPainted(false);
        jButton5.setPreferredSize(new java.awt.Dimension(160, 35));
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 160, 35));

        jButton6.setBackground(new java.awt.Color(92, 64, 51));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("My Requests");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setFocusPainted(false);
        jButton6.setPreferredSize(new java.awt.Dimension(160, 35));
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 160, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, 500));

        jPanel2.setBackground(new java.awt.Color(250, 235, 215));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 520));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Name :  ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Email : ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Type : ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

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
        jTable1.setFocusable(true);
        jTable1.setPreferredSize(new java.awt.Dimension(740, 300));
        jTable1.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 690, 370));

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, -1, -1));

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

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 22)); // NOI18N
        jLabel1.setText("WELCOME");
        jLabel1.setPreferredSize(new java.awt.Dimension(160, 50));
        header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 180, 40));

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         this.dispose();
        new landingpage().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(usersdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usersdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usersdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usersdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usersdashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel header;
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
