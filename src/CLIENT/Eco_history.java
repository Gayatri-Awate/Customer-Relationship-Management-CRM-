/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CLIENT;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author samiksha.jaiswal
 */
public class Eco_history extends javax.swing.JFrame {

    /**
     * Creates new form Eco_history
     */
    public Eco_history() {
        initComponents();
        this.setTitle("Economic History");
    }
    static int id1;
    static int id2;
    String name1 = null;

    public Eco_history(final int id, final int pd, String nam) {
        id1 = id;
        id2 = pd;
        initComponents();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_project", "root", "root");
            PreparedStatement pr1 = (PreparedStatement) conn.prepareStatement("SELECT name FROM add_emp where username=?");
            pr1.setString(1, nam);
            ResultSet rs = pr1.executeQuery();

            while (rs.next()) {
                name1 = rs.getString(1);
            }

        } catch (Exception e) {
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_project", "root", "root");
            PreparedStatement pst1 = (PreparedStatement) conn.prepareStatement("select proj_name from add_proj where proj_id=?");
            pst1.setInt(1, id2);
            ResultSet rs = pst1.executeQuery();
            while (rs.next()) {
                prnam.setText(rs.getString(1));
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

        jLabel16 = new javax.swing.JLabel();
        paymode = new javax.swing.JComboBox();
        title = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        amnt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        prnam = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel16.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel16.setText("Economic History:");

        paymode.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        paymode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Cash", "Cheque", "Internet" }));

        title.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel13.setText("Mode of Payment:");

        jLabel12.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel12.setText("Date:");

        jLabel14.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel14.setText("Title :");

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel2.setText("Amount :");

        date.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N

        amnt.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel4.setText("Project Name :");

        jButton1.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        prnam.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        prnam.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(date)
                            .addComponent(title)
                            .addComponent(amnt)
                            .addComponent(paymode, 0, 194, Short.MAX_VALUE)
                            .addComponent(prnam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel16)))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel16)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(prnam))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(amnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(paymode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new Acc_view(id1, id2, name1).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double a = 0, b = 0;
        double s = 0;
        Date dNow1 = new Date();
        SimpleDateFormat ft1 = new SimpleDateFormat("hh:mm:ss a ");

        try {
            String date1 = date.getText();
            Double amnt1 = Double.parseDouble(amnt.getText());
            String titl = title.getText();
            String mode = (String) paymode.getSelectedItem();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_project", "root", "root");
            PreparedStatement pst = (PreparedStatement) con.prepareStatement("insert into eco_history"
                    + "(client_id,proj_id,date,amt,mode_pay, title)values(?,?,?,?,?,?)");
            pst.setInt(1, id1);
            pst.setInt(2, id2);
            pst.setString(3, date1);
            pst.setDouble(4, amnt1);
            pst.setString(5, mode);
            pst.setString(6, titl);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saved!");

            PreparedStatement pst1 = (PreparedStatement) con.prepareStatement("select rem_amt from acc_dept where client_id=? and proj_id=?");
            pst1.setInt(1, id1);
            pst1.setInt(2, id2);
            ResultSet rs = pst1.executeQuery();
            while (rs.next()) {
                s = rs.getDouble(1);
            }


            a = Double.parseDouble(amnt.getText());
            b = s - a;
            PreparedStatement pst6 = (PreparedStatement) con.prepareStatement("update acc_dept"
                    + " set rem_amt=? where client_id=? and proj_id=?");
            pst6.setDouble(1, b);
            pst6.setDouble(2, id1);
            pst6.setDouble(3, id2);
            pst6.executeUpdate();
            System.out.println("amount" + b);
            
            this.dispose();
            new Eco_history().setVisible(true);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Eco_history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eco_history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eco_history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eco_history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Eco_history().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amnt;
    private javax.swing.JTextField date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox paymode;
    private javax.swing.JLabel prnam;
    private javax.swing.JTextField title;
    // End of variables declaration//GEN-END:variables
}
