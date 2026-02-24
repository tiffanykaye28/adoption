package main;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import config.config;
import javax.swing.table.DefaultTableCellRenderer;

public class Udashboard extends javax.swing.JPanel {
     
    config conf = new config();
    
    public Udashboard() {
        initComponents();
        loadStats();
        loadFeaturedPets();
        loadAvailablePets();
        setupTableAction();
     }

    
    
    
    
    
private void centerTableText(JTable table) {
    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    centerRenderer.setHorizontalAlignment(JLabel.CENTER);
    
    // I-apply sa tanang columns
    for (int i = 0; i < table.getColumnCount(); i++) {
        table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
    }
}


    private void loadStats() {
        try (Connection con = conf.connectDB()) {
            String dogSql = "SELECT COUNT(*) FROM pets WHERE type = 'dog' AND status = 'Adopted'";
            String catSql = "SELECT COUNT(*) FROM pets WHERE type = 'cat' AND status = 'Adopted'";
            
            Statement st = con.createStatement();
            ResultSet rs1 = st.executeQuery(dogSql);
            if(rs1.next()) jLabel1.setText("🐶 Dogs Adopted: " + rs1.getInt(1));
            
            ResultSet rs2 = st.executeQuery(catSql);
            if(rs2.next()) jLabel3.setText("🐱 Cats Adopted: " + rs2.getInt(1));
        } catch (SQLException e) { 
            System.out.println("Stats Error: " + e.getMessage()); 
        }
    }

    // 2. I-load ang Featured Pets
    private void loadFeaturedPets() {
   String sql = "SELECT name AS 'Pet Name', age AS 'Age', description AS 'Description', 'Adopt' AS 'Action' " +
                     "FROM pets WHERE is_featured = 1 AND status = 'Available' LIMIT 3";
        conf.displayData(sql, f2);
        centerTableText(f2); // I-center ang text
        
    }

    // 3. I-load ang Available Pets
   private void loadAvailablePets() {
        // Query base sa imong SQLite columns: name, status
        String sql = "SELECT name AS 'Pet Name', status AS 'Status' " +
                     "FROM pets WHERE status = 'Available' LIMIT 2";
        conf.displayData(sql, f1);
        centerTableText(f1); // I-center ang text
    }

    // 4. Action inig pislit sa 'Adopt' sa Table
    private void setupTableAction() {
       f2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = f2.getSelectedRow();
                int col = f2.getSelectedColumn();

                // Column 0: Name, 1: Age, 2: Description, 3: Action (Adopt)
                if (col == 3) { 
                    String petName = f2.getValueAt(row, 0).toString();
                    int confirm = JOptionPane.showConfirmDialog(null, 
                            "Confirm adoption for " + petName + "?", "Adopt", JOptionPane.YES_NO_OPTION);
                    
                    if (confirm == JOptionPane.YES_OPTION) {
                        // I-update ang status sa SQLite
                        String updateSql = "UPDATE pets SET status = 'Pending', is_featured = 0 WHERE name = ?";
                        conf.addRecord(updateSql, "Pending", 0, petName);
                        
                        JOptionPane.showMessageDialog(null, "Request sent for " + petName + "!");
                        
                        // I-refresh tanan
                        loadFeaturedPets();
                        loadAvailablePets();
                        loadStats();
                    }
                }
            }
        });
    }
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        stats = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        featuredpets = new javax.swing.JPanel();
        f = new javax.swing.JLabel();
        s1 = new javax.swing.JScrollPane();
        f1 = new javax.swing.JTable();
        availablepets = new javax.swing.JPanel();
        a = new javax.swing.JLabel();
        s2 = new javax.swing.JScrollPane();
        f2 = new javax.swing.JTable();
        footer = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 235, 215));
        setPreferredSize(new java.awt.Dimension(790, 510));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        header.setBackground(new java.awt.Color(250, 235, 215));
        header.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 235, 215)));
        header.setMaximumSize(new java.awt.Dimension(32767, 80));
        header.setPreferredSize(new java.awt.Dimension(1000, 80));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(92, 64, 51));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 22)); // NOI18N
        jLabel4.setText("\"🐾 WELCOME TO PAW PRINTS 🐾\"");
        jPanel1.add(jLabel4);

        header.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 440, 40));

        add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 70));

        stats.setBackground(new java.awt.Color(250, 235, 215));
        stats.setPreferredSize(new java.awt.Dimension(770, 40));

        jLabel1.setBackground(new java.awt.Color(92, 64, 51));
        jLabel1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dogs Adopted:     ");
        stats.add(jLabel1);

        jLabel3.setBackground(new java.awt.Color(92, 64, 51));
        jLabel3.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel3.setText("Cats Adopted:   ");
        stats.add(jLabel3);

        add(stats, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 770, 40));

        featuredpets.setBackground(new java.awt.Color(255, 245, 230));
        featuredpets.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        f.setText("FEATURED PETS OF THE DAY");
        featuredpets.add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 5, -1, -1));

        s1.setBorder(null);
        s1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        s1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        s1.setPreferredSize(new java.awt.Dimension(750, 135));

        f1.setTableHeader(null);
        f1.setBackground(new java.awt.Color(250, 235, 215));
        f1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        f1.setShowGrid(false);
        f1.setEnabled(false);
        f1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        f1.setMaximumSize(new java.awt.Dimension(2147483647, 135));
        f1.setMinimumSize(new java.awt.Dimension(60, 135));
        f1.setOpaque(false);
        f1.setPreferredSize(new java.awt.Dimension(770, 135));
        f1.setRowHeight(45);
        f1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        f1.setShowHorizontalLines(false);
        f1.setShowVerticalLines(false);
        s1.setViewportView(f1);
        s1.setBorder(null);
        f1.setDefaultEditor(Object.class, null);

        featuredpets.add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 750, 135));

        add(featuredpets, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 770, 175));

        availablepets.setBackground(new java.awt.Color(255, 245, 230));
        availablepets.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        a.setText("AVAILABLE PETS");
        availablepets.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 5, -1, -1));

        s2.setBorder(null);
        s2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        s2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        s2.setPreferredSize(new java.awt.Dimension(450, 135));

        f2.setTableHeader(null);
        f2.setBackground(new java.awt.Color(250, 235, 215));
        f2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", ""
            }
        ));
        f2.setShowGrid(false);
        f2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        f2.setInheritsPopupMenu(true);
        f2.setIntercellSpacing(new java.awt.Dimension(0, 0));
        f2.setOpaque(false);
        f2.setPreferredSize(new java.awt.Dimension(770, 90));
        f2.setRowHeight(45);
        f2.setShowHorizontalLines(false);
        f2.setShowVerticalLines(false);
        s2.setBorder(null);
        f2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                f2MouseClicked(evt);
            }
        });
        s2.setViewportView(f2);
        s2.setBorder(null);
        f2.setDefaultEditor(Object.class, null);

        availablepets.add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 750, 80));

        add(availablepets, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 315, 770, 120));

        footer.setBackground(new java.awt.Color(250, 235, 215));

        jLabel5.setFont(new java.awt.Font("Georgia", 2, 11)); // NOI18N
        jLabel5.setText("\"Every paw matters. Adopt today!\"");
        footer.add(jLabel5);

        add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 790, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void f2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_f2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JPanel availablepets;
    private javax.swing.JLabel f;
    private javax.swing.JTable f1;
    private javax.swing.JTable f2;
    private javax.swing.JPanel featuredpets;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane s1;
    private javax.swing.JScrollPane s2;
    private javax.swing.JPanel stats;
    // End of variables declaration//GEN-END:variables
}
