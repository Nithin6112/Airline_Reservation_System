/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ams;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author hhh
 */
public class AIRM extends javax.swing.JFrame {

    /**
     * Creates new form AIRM
     */
    public AIRM() {
        initComponents();
        DisplayAirLines();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jLabel1 = new javax.swing.JLabel();
        AID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        State = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Cno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Cap = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setText("AID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 27, 61, -1));
        getContentPane().add(AID, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 24, 95, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 67, 49, -1));
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 64, 93, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("State");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 112, 49, -1));
        getContentPane().add(State, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 109, 104, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 102));
        jLabel4.setText("ContolmentNo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 152, 87, -1));
        getContentPane().add(Cno, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 149, 104, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("Capacity");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 190, 73, -1));
        getContentPane().add(Cap, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 187, 55, -1));

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 287, -1, -1));

        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 287, -1, -1));

        jButton3.setText("EDIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 287, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 40, -1, 157));

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 6, -1, -1));

        jButton5.setText("NEXT");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 287, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ams/Booking-Flights-through-Travel-Agents.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection Con = DriverManager.getConnection("jdbc:mysql://localhost/ams","root","");
                java.sql.PreparedStatement add=Con.prepareStatement("insert into airline values(?,?,?,?,?)");
                add.setString(1, AID.getText());
                add.setString(2,Name.getText());
                add.setString(3,State.getText());
                
                add.setInt(4,Integer.valueOf(Cno.getText()));
                add.setInt(5,Integer.valueOf(Cap.getText()));
                int row =add.executeUpdate();
                 JOptionPane.showMessageDialog(this,"Airline Saved");
                 DisplayAirLines();
             
               // St = Con.createStatement();
              //  Rs = St.executeQuery("Se")
                
            }catch(Exception e){
                e.printStackTrace();
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();

        // get the selected row index
       int selectedRowIndex =jTable1.getSelectedRow();
        String AID=model.getValueAt(selectedRowIndex, 0).toString();
        
         Class.forName("com.mysql.jdbc.Driver");
         java.sql.Connection Con = DriverManager.getConnection("jdbc:mysql://localhost/ams","root","");
         PreparedStatement add=Con.prepareStatement("delete from  airline where AID=?");
         
         add.setString(1,AID);
         //System.out.print(bid+","+title+","+author+","+cat+","+qty+","+price);
         int row =add.executeUpdate();
          JOptionPane.showMessageDialog(this,"Airline Saved");
          DisplayAirLines();
         
        }
        catch(Exception e){}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();

        // get the selected row index
       int selectedRowIndex =jTable1.getSelectedRow();
        String AID=model.getValueAt(selectedRowIndex, 0).toString();
        String Name=model.getValueAt(selectedRowIndex, 1).toString();
        String State=model.getValueAt(selectedRowIndex, 2).toString();
        
        int Cno=Integer.valueOf(model.getValueAt(selectedRowIndex, 3).toString());
        int Cap=Integer.valueOf(model.getValueAt(selectedRowIndex, 4).toString());
         Class.forName("com.mysql.jdbc.Driver");
         java.sql.Connection Con = DriverManager.getConnection("jdbc:mysql://localhost/ams","root","");
         PreparedStatement add=Con.prepareStatement("update airline set Name=?,State=?,Cno=?,Cap=? where AID=?");
         add.setString(1,Name);
         add.setString(2, State);
         add.setInt(3, Cno);
         add.setInt(4, Cap);
         add.setString(5,AID);
         
         //System.out.print(bid+","+title+","+author+","+cat+","+qty+","+price);
         int row =add.executeUpdate();
          JOptionPane.showMessageDialog(this,"AirLine Saved!");
          DisplayAirLines();
         
        }
        catch(Exception e){}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      dashboard d=new dashboard();
      d.setVisible(true);
      dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        manageflight l=new manageflight();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5MouseClicked

    private void DisplayAirLines()
    {
        try{
   // Class.forName("com.mysql.jdbc.Driver");
   Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection Con=DriverManager.getConnection("jdbc:mysql://localhost/ams", "root", "");
    //Connection Con = DriverManager.getConnection("jdbc:mysql://localhost/EBook","User1","12345");
    java.sql.Statement St=Con.createStatement();
    java.sql.ResultSet RS=St.executeQuery("select * from airline");
    jTable1.setModel(DbUtils.resultSetToTableModel(RS));
}
catch(Exception e){}
    }
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
            java.util.logging.Logger.getLogger(AIRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AIRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AIRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AIRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AIRM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AID;
    private javax.swing.JTextField Cap;
    private javax.swing.JTextField Cno;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField State;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}