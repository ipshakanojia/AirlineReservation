/*
 * To change this t

            @Override
            public int getWidth(ImageObserver observer) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public int getHeight(ImageObserver observer) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public ImageProducer getSource() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public Graphics getGraphics() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public Object getProperty(String name, ImageObserver observer) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        }mplate, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * search_Result.java
 *
 * Created on Jan 8, 2012, 5:49:15 PM
 */
/**
 *
 * @author jobin
 */
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;
public class search_Result extends javax.swing.JFrame {

    /** Creates new form search_Result */
    public search_Result() {
        jobin();
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void jobin()
    {
        setIconImage(new ImageIcon("images/Flights.gif").getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1_email = new javax.swing.JLabel();
        jButton1_selectionsummery = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4_login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9_flight_no = new javax.swing.JLabel();
        jLabel10_arrival_time = new javax.swing.JLabel();
        jLabel11_dept_time = new javax.swing.JLabel();
        jLabel12_fare = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9_flight_no1 = new javax.swing.JLabel();
        jLabel10_arrival_time1 = new javax.swing.JLabel();
        jLabel11_dept_time1 = new javax.swing.JLabel();
        jLabel12_fare1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_file = new javax.swing.JMenu();
        jMenuItem1_exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Book n Fly");
        setBounds(new java.awt.Rectangle(0, 0, 1024, 700));
        setMinimumSize(new java.awt.Dimension(1024, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1_email.setText("                                                    ");
        jLabel1_email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 1, true));
        jPanel1.add(jLabel1_email);
        jLabel1_email.setBounds(10, 10, 1000, 30);
        jLabel1_email.add(jButton2);

        jButton1_selectionsummery.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton1_selectionsummery.setText("Selection Summery                                                                                                                                                                                                ");
        jButton1_selectionsummery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_selectionsummeryActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_selectionsummery);
        jButton1_selectionsummery.setBounds(10, 10, 1000, 25);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton2.setText("Payment Details                                                                                                                                                         ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 610, 1000, 25);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton3.setText("Passenger Details                                                                                                                                                       ");
        jButton3.setMaximumSize(new java.awt.Dimension(750, 25));
        jButton3.setMinimumSize(new java.awt.Dimension(750, 25));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(10, 570, 1000, 25);

        jButton4_login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4_login.setText("Search home                                                                                                                                                                                                         ");
        jButton4_login.setInheritsPopupMenu(true);
        jButton4_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_loginActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4_login);
        jButton4_login.setBounds(10, 40, 1000, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("Search Result");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 70, 130, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel2.setText("Flight No");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 150, 120, 14);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Arrival Time");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(260, 150, 120, 14);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Departure Time");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(440, 150, 120, 14);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Fare");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(740, 150, 120, 14);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/or_long - Copy.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(640, 150, 32, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/or_long - Copy.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(380, 150, 32, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/or_long - Copy.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(170, 150, 32, 20);

        jLabel9_flight_no.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9_flight_no.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel9_flight_no);
        jLabel9_flight_no.setBounds(70, 230, 110, 50);

        jLabel10_arrival_time.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10_arrival_time.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel10_arrival_time);
        jLabel10_arrival_time.setBounds(210, 230, 170, 50);

        jLabel11_dept_time.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11_dept_time.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel11_dept_time);
        jLabel11_dept_time.setBounds(420, 230, 210, 50);

        jLabel12_fare.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12_fare.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel12_fare);
        jLabel12_fare.setBounds(740, 230, 100, 50);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Rs.");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(720, 230, 19, 50);

        jLabel9_flight_no1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9_flight_no1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel9_flight_no1);
        jLabel9_flight_no1.setBounds(70, 330, 110, 50);

        jLabel10_arrival_time1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10_arrival_time1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel10_arrival_time1);
        jLabel10_arrival_time1.setBounds(210, 330, 170, 50);

        jLabel11_dept_time1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11_dept_time1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel11_dept_time1);
        jLabel11_dept_time1.setBounds(420, 330, 210, 50);

        jLabel12_fare1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12_fare1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel12_fare1);
        jLabel12_fare1.setBounds(740, 330, 100, 50);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Rs.");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(720, 330, 19, 50);

        jButton1.setBackground(new java.awt.Color(255, 153, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrow_red.png"))); // NOI18N
        jButton1.setText("Continue to pay..");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jButton1);
        jButton1.setBounds(670, 470, 240, 30);

        jButton4.setBackground(new java.awt.Color(255, 153, 51));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton4.setText("Search another Flight");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(70, 470, 240, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1020, 680);

        menu_file.setBackground(new java.awt.Color(204, 51, 0));
        menu_file.setText("File      ");
        menu_file.setFont(new java.awt.Font("Times New Roman", 1, 14));

        jMenuItem1_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, 0));
        jMenuItem1_exit.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jMenuItem1_exit.setText("Exit");
        menu_file.add(jMenuItem1_exit);

        jMenuBar1.add(menu_file);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      ///  new UserRegistration().setVisible(true);        // TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1_selectionsummeryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_selectionsummeryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_selectionsummeryActionPerformed

    private void jButton4_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_loginActionPerformed
new search_home().setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton4_loginActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
new search_home().setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

       /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new search_Result().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1_selectionsummery;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton4_login;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10_arrival_time;
    public javax.swing.JLabel jLabel10_arrival_time1;
    public javax.swing.JLabel jLabel11_dept_time;
    public javax.swing.JLabel jLabel11_dept_time1;
    public javax.swing.JLabel jLabel12_fare;
    public javax.swing.JLabel jLabel12_fare1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel1_email;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9_flight_no;
    public javax.swing.JLabel jLabel9_flight_no1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1_exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menu_file;
    // End of variables declaration//GEN-END:variables
}
