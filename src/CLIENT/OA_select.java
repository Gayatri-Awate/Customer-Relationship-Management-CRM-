/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CLIENT;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author sayali.shitole
 */
public class OA_select extends javax.swing.JFrame {

    /**
     * Creates new form OA_select
     */
    static String dept;
    String n1 = "";
    int id;
    int idOfSelectedProject;
    int idOfSelectedClient;

    //private final DateFormatSymbols dd;
    public OA_select() {
    }

    public OA_select(String dept, String nam) {
        this.dept = dept;
        n1 = nam;
        initComponents();
        this.setTitle("Select client");
        apro.setVisible(false);
        ename.setText(n1);
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_project", "root", "root");
            PreparedStatement pr1 = (PreparedStatement) conn.prepareStatement("SELECT name FROM add_client");
            ResultSet rs = pr1.executeQuery();
            cname.removeAllItems();
            while (rs.next()) {
                cname.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.dept.equals("Operation")) {
            apro.setVisible(true);
        }

        Date dNow = new Date();
        SimpleDateFormat ft =
                new SimpleDateFormat("E dd.MM.yyyy");
        dte.setText(ft.format(dNow));
        Date dNow1 = new Date();
        SimpleDateFormat ft1 = new SimpleDateFormat("hh:mm:ss a ");
        time.setText(ft1.format(dNow1));

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_project", "root", "root");
            PreparedStatement pr = (PreparedStatement) con.prepareStatement("SELECT name FROM add_client");
            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                cname.addItem(rs.getInt(1));
            }

        } catch (Exception e) {
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cname = new javax.swing.JComboBox();
        proj = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        apro = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        dte = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ename = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel1.setText("Select Client Name:");

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel3.setText("Select Project:");

        cname.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        cname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnameActionPerformed(evt);
            }
        });

        proj.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        proj.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        jButton1.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        apro.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        apro.setText("Add Project");
        apro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aproActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel4.setText("Date:");

        dte.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        dte.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel6.setText("Time:");

        time.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        time.setText("jLabel7");

        jButton3.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jButton3.setText("LogOut");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        jLabel5.setText("WELCOME");

        ename.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        ename.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        jLabel8.setText("!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 381, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(27, 27, 27)
                .addComponent(time)
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(ename)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(proj, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(apro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton3))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dte)
                    .addComponent(jLabel6)
                    .addComponent(time))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ename)
                    .addComponent(jLabel8))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(proj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(apro))
                .addContainerGap(163, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aproActionPerformed
        try {
            this.setVisible(false);
            
            new Add_project(dept, idOfSelectedClient, n1).setVisible(true);
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(null, "Please select required FIELDS");
            this.setVisible(true);
            ne.printStackTrace();
        }
    }//GEN-LAST:event_aproActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_project", "root", "root");
            PreparedStatement pt = (PreparedStatement) con.prepareStatement("SELECT proj_id FROM add_proj where proj_name = ?");
            pt.setString(1, proj.getSelectedItem().toString());
            ResultSet rs = pt.executeQuery();
            rs.next();
            idOfSelectedProject = rs.getInt(1);
            
            if (dept.equals("Operation")) {
                this.setVisible(false);
                new Oper_view(idOfSelectedClient, idOfSelectedProject, n1).setVisible(true);
            } else if (dept.equals("Accounts")) {
                this.setVisible(false);
                new Acc_view(idOfSelectedClient, idOfSelectedProject, n1).setVisible(true);
            } else if (dept.equals("Technical")) {
                this.setVisible(false);
                new tect_view(idOfSelectedClient, idOfSelectedProject, n1).setVisible(true);

            }
        } catch (Exception ne) {
            JOptionPane.showMessageDialog(null, "Please select all fields");
            this.setVisible(true);
            ne.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        new homepage().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnameActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_project", "root", "root");
            PreparedStatement pt = (PreparedStatement) con.prepareStatement("SELECT client_id FROM add_client where name = ?");
            pt.setString(1, cname.getSelectedItem().toString());
            ResultSet rs = pt.executeQuery();
            rs.next();
            
            idOfSelectedClient = rs.getInt(1);
                    
            pt = (PreparedStatement) con.prepareStatement("SELECT proj_name FROM add_proj where client_id = ?");
            pt.setInt(1, idOfSelectedClient);
            rs = pt.executeQuery();
            
            proj.removeAllItems();
            while (rs.next()) {
                proj.addItem(rs.getString(1));
            }
            
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }//GEN-LAST:event_cnameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OA_select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OA_select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OA_select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OA_select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new OA_select().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apro;
    private javax.swing.JComboBox cname;
    private javax.swing.JLabel dte;
    private javax.swing.JLabel ename;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox proj;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
