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
 * search_home1.java
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
import javax.swing.ButtonGroup;
public class search_home1 extends javax.swing.JFrame {

    /** Creates new form search_home1 */
    public search_home1() {
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
       button_group=new ButtonGroup();
       button_group.add(jRadioButton1);
       button_group.add(jRadioButton2);
       
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
        jButton1_register = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton7_findflight = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1_adult1 = new javax.swing.JComboBox();
        jComboBox2_children1 = new javax.swing.JComboBox();
        jComboBox3_class1 = new javax.swing.JComboBox();
        jComboBox4_source1 = new javax.swing.JComboBox();
        jComboBox5_destination1 = new javax.swing.JComboBox();
        jComboBox6_airline1 = new javax.swing.JComboBox();
        jComboBox1_date = new javax.swing.JComboBox();
        jComboBox2_month = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        User_name = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton1_register1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10_date = new javax.swing.JLabel();
        jLabel9_flight_no = new javax.swing.JLabel();
        jLabel10_arrival_time = new javax.swing.JLabel();
        jLabel11_dept_time = new javax.swing.JLabel();
        jLabel12_fare = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        hai_label = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Status = new javax.swing.JLabel();
        flightno_status = new javax.swing.JLabel();
        cancel_booking = new javax.swing.JButton();
        hai_label1 = new javax.swing.JLabel();
        hai_label2 = new javax.swing.JLabel();
        u_should_login = new javax.swing.JLabel();
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

        jLabel1_email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 1, true));
        jPanel1.add(jLabel1_email);
        jLabel1_email.setBounds(10, 10, 1000, 550);
        jLabel1_email.add(jButton2);

        jButton1_selectionsummery.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_selectionsummery.setText("WELCOME TO BOOK AND FLY ...               Search your Flight  Here...                                                                                                                                                         ");
        jButton1_selectionsummery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_selectionsummeryActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_selectionsummery);
        jButton1_selectionsummery.setBounds(10, 10, 1000, 25);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Payment Details                                                                                                                                                         ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 610, 1000, 25);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
        jButton4_login.setText("Login/Contact Details                                                                                                                                                ");
        jButton4_login.setInheritsPopupMenu(true);
        jButton4_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_loginActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4_login);
        jButton4_login.setBounds(10, 530, 1000, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Flight Search");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 60, 130, 20);

        jButton1_register.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1_register.setText("Cick to pay&Confirm");
        jButton1_register.setActionCommand("Register");
        jButton1_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_registerActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_register);
        jButton1_register.setBounds(770, 340, 210, 50);
        jButton1_register.setVisible(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(214, 242, 242), 5, true));
        jPanel4.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("From");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(10, 10, 70, 17);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("To");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(250, 10, 30, 17);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Adults");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(460, 10, 50, 17);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Childrens");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(520, 10, 53, 17);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Class");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(300, 80, 50, 17);

        jButton7_findflight.setBackground(new java.awt.Color(255, 153, 51));
        jButton7_findflight.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton7_findflight.setText("Find Flights");
        jButton7_findflight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7_findflightActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7_findflight);
        jButton7_findflight.setBounds(700, 70, 120, 40);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Select Airline");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(10, 80, 80, 17);

        jComboBox1_adult1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox1_adult1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" }));
        jPanel4.add(jComboBox1_adult1);
        jComboBox1_adult1.setBounds(460, 30, 50, 23);

        jComboBox2_children1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox2_children1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));
        jPanel4.add(jComboBox2_children1);
        jComboBox2_children1.setBounds(520, 30, 50, 23);

        jComboBox3_class1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox3_class1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Economy", "business" }));
        jPanel4.add(jComboBox3_class1);
        jComboBox3_class1.setBounds(350, 80, 120, 23);

        jComboBox4_source1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox4_source1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----Select your Departure city---", "kochi", "Trivandrum" }));
        jPanel4.add(jComboBox4_source1);
        jComboBox4_source1.setBounds(10, 30, 220, 23);

        jComboBox5_destination1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox5_destination1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select your destination City--", "Dubai", "Kochi", "Trivandrum", "Kuwait" }));
        jPanel4.add(jComboBox5_destination1);
        jComboBox5_destination1.setBounds(240, 30, 200, 23);

        jComboBox6_airline1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox6_airline1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select Airline--", "Indian airlines", "Air India", "SpiceJet", "Ethihad", "Emirates", "Air Arabia" }));
        jComboBox6_airline1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6_airline1ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox6_airline1);
        jComboBox6_airline1.setBounds(100, 80, 180, 23);

        jComboBox1_date.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel4.add(jComboBox1_date);
        jComboBox1_date.setBounds(550, 80, 56, 20);

        jComboBox2_month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "2", "3", "4", "5", "", "7", "8", "9", "10", "11", "12" }));
        jPanel4.add(jComboBox2_month);
        jComboBox2_month.setBounds(610, 80, 56, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Date");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(490, 80, 34, 14);

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton1.setText("One way");
        jPanel4.add(jRadioButton1);
        jRadioButton1.setBounds(600, 30, 77, 25);
        button_group.add(jRadioButton1);

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton2.setText("Round the trip");
        jPanel4.add(jRadioButton2);
        jRadioButton2.setBounds(700, 30, 120, 25);
        button_group.add(jRadioButton2);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(130, 50, 850, 130);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Flight No");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(190, 230, 120, 14);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/or_long - Copy.png"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(290, 230, 32, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Arrival Time");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(490, 230, 120, 14);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Departure Time");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(670, 230, 120, 14);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/or_long - Copy.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(440, 230, 32, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/or_long - Copy.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(760, 230, 32, 20);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel15.setText("Fare");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(860, 230, 120, 14);

        User_name.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        User_name.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(User_name);
        User_name.setBounds(330, 360, 220, 20);
        User_name.setVisible(false);
        try{

            Connection con = NewCon.connect();
            Statement st= con.createStatement();
            String sql ="select name from login";
            ResultSet rs =	st.executeQuery(sql);

            while(rs.next() ){

                User_name.setText(rs.getString(1));
            }
        }catch(Exception ex){
            System.out.println(ex);
        }

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/or_long - Copy.png"))); // NOI18N
        jPanel1.add(jLabel17);
        jLabel17.setBounds(610, 230, 32, 20);

        jButton1_register1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1_register1.setText("Register/Login");
        jButton1_register1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_register1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_register1);
        jButton1_register1.setBounds(770, 410, 210, 50);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoorignl.jpg"))); // NOI18N
        jPanel1.add(jLabel18);
        jLabel18.setBounds(30, 360, 240, 60);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(214, 242, 242), 5, true));
        jPanel5.setLayout(null);

        jLabel10_date.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10_date.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(jLabel10_date);
        jLabel10_date.setBounds(190, 10, 130, 30);

        jLabel9_flight_no.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9_flight_no.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(jLabel9_flight_no);
        jLabel9_flight_no.setBounds(30, 10, 110, 30);

        jLabel10_arrival_time.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10_arrival_time.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(jLabel10_arrival_time);
        jLabel10_arrival_time.setBounds(340, 10, 130, 30);

        jLabel11_dept_time.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11_dept_time.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(jLabel11_dept_time);
        jLabel11_dept_time.setBounds(490, 10, 150, 30);

        jLabel12_fare.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12_fare.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(jLabel12_fare);
        jLabel12_fare.setBounds(700, 10, 100, 30);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(130, 260, 850, 50);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel19.setText("Date");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(340, 230, 120, 14);

        hai_label.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        hai_label.setText("login as");
        jPanel1.add(hai_label);
        hai_label.setBounds(270, 360, 50, 20);
        hai_label.setVisible(false);

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(580, 360, 90, 20);
        jButton1.setVisible(false);

        Status.setBackground(new java.awt.Color(226, 237, 247));
        Status.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Status.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(Status);
        Status.setBounds(420, 460, 110, 20);

        flightno_status.setBackground(new java.awt.Color(226, 237, 247));
        flightno_status.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        flightno_status.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(flightno_status);
        flightno_status.setBounds(300, 460, 110, 20);

        cancel_booking.setText("Cancel booking");
        cancel_booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_bookingActionPerformed(evt);
            }
        });
        jPanel1.add(cancel_booking);
        cancel_booking.setBounds(550, 400, 150, 20);
        cancel_booking.setVisible(false);

        hai_label1.setBackground(new java.awt.Color(226, 237, 247));
        hai_label1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        hai_label1.setText("Flight number");
        jPanel1.add(hai_label1);
        hai_label1.setBounds(300, 430, 80, 20);
        hai_label1.setVisible(false);

        hai_label2.setBackground(new java.awt.Color(226, 237, 247));
        hai_label2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        hai_label2.setText("Status");
        jPanel1.add(hai_label2);
        hai_label2.setBounds(430, 430, 60, 20);
        hai_label2.setVisible(false);

        u_should_login.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        u_should_login.setText("you should login to continue");
        jPanel1.add(u_should_login);
        u_should_login.setBounds(790, 390, 190, 14);
        u_should_login.setVisible(false);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1020, 680);

        menu_file.setBackground(new java.awt.Color(204, 51, 0));
        menu_file.setText("File      ");
        menu_file.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jMenuItem1_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, 0));
        jMenuItem1_exit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem1_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.png"))); // NOI18N
        jMenuItem1_exit.setText("Exit");
        jMenuItem1_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1_exitActionPerformed(evt);
            }
        });
        menu_file.add(jMenuItem1_exit);

        jMenuBar1.add(menu_file);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
new search_home1().setVisible(true);
dispose();      ///  new UserRegistration().setVisible(true);        // TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      new payment().setVisible(true);
      dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1_selectionsummeryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_selectionsummeryActionPerformed
        new search_Result().setVisible(true);
      dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1_selectionsummeryActionPerformed

    private void jComboBox6_airline1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6_airline1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jComboBox6_airline1ActionPerformed

    private void jButton7_findflightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7_findflightActionPerformed

       
        
        u_should_login.setVisible(true);
        hai_label.setVisible(true);
        
        
        int childcount=0; 
String source=(String)jComboBox4_source1.getSelectedItem();        // TODO add your handling code here:
String destination=(String)jComboBox5_destination1.getSelectedItem();
String adult=(String)jComboBox1_adult1.getSelectedItem();
int child=Integer.parseInt((String)jComboBox2_children1.getSelectedItem());
if(child==1)
{
    childcount=1;
}
else if(child==2)
{
    childcount=2;
}
String day=(String)jComboBox1_date.getSelectedItem();
String month=(String)jComboBox2_month.getSelectedItem();
String flightname=(String)jComboBox6_airline1.getSelectedItem();
String date=day+"-"+month+"-2012";
String airclass=(String)jComboBox3_class1.getSelectedItem();
int airclass1=0;
if(airclass=="Economy")
{
airclass1=1;        
    }
else
{
    airclass1=2; 
}

String adult_2=(String)jComboBox1_adult1.getSelectedItem();
int adult2=Integer.parseInt(adult_2);

int trip=0;

if(jRadioButton1.isSelected())
{
    trip=1;
}
else if(jRadioButton2.isSelected())
{
    trip=2;
}

String flight_number="";
String arrival="";
String departure="";
int fare=0;
int price1=0;
boolean flag=false;




try{
					
						 Connection con = NewCon.connect();
						 Statement st= con.createStatement();
						 String sql ="select * from flight_details where source='"+source+"' and destination='"+destination+"' and flight_name='"+flightname+"'";
						 ResultSet rs =	st.executeQuery(sql);
					
						 while(rs.next() ){
						 

                                                     flight_number = 	rs.getString("flight_number");
							 fare =	rs.getInt("fare");
                                                         arrival=rs.getString("arrival_time") ;
                                                         departure=rs.getString("departure_time") ;
                                                        //System.out.println(flight_number);
							flag =true;
						 }
						}catch(Exception ex){
							System.out.println(ex);
						}
					//personal details
					if(flag){
                                            price1=((((fare*trip)*airclass1)*adult2)+((((fare-1000)*trip)*airclass1))*childcount);
                                            String s = new Integer(price1).toString();
                                           jLabel9_flight_no.setText(flight_number);
                                           //flightno_status.setText(flight_number);
                                           jLabel12_fare.setText("RS. "+s);
                                           jLabel10_date.setText(date);
                                           jLabel10_arrival_time.setText(arrival);
                                           jLabel11_dept_time.setText(departure);
                                          
                                           
                                           
                                           
                                            try{
					
						 Connection con = NewCon.connect();
						 Statement st= con.createStatement();
						 String sql ="select status from login";
						 ResultSet rs =	st.executeQuery(sql);
					
						 while(rs.next() ){
						 

                                                   Status.setText(rs.getString(1));
                                                  // if(rs.getString(1)=="")
                                                   //{
                                                     //  Status.setText("not booked");
                                                  // }
						 }
						}catch(Exception ex){
							System.out.println(ex);
						}

        
        
        
        
        try{
					
						 Connection con = NewCon.connect();
						 Statement st= con.createStatement();
						 String sql ="select name from login";
						 ResultSet rs =	st.executeQuery(sql);
					
						 while(rs.next() ){
						 
jButton1.setVisible(true);

hai_label1.setVisible(true);
hai_label2.setVisible(true);

User_name.setVisible(true);
jButton1_register.setVisible(true);
u_should_login.setVisible(false);
                                                   User_name.setText(rs.getString(1));
						 }
						}catch(Exception ex){
							System.out.println(ex);
						}

                                           
                                            
                                            
				
				}
					else{
						JOptionPane.showMessageDialog(null,   "Sorry, Please search with another flight !");	
					}





















    }//GEN-LAST:event_jButton7_findflightActionPerformed

    private void jButton1_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_registerActionPerformed
boolean flag=false;
        






        String name=User_name.getText();
        if("".equals(name))
        {
            flag=false;
        }
        else
        {
            flag=true;
        }
        String status="booked";
   String flight_no=jLabel9_flight_no.getText();
        try{
					
						 Connection con = NewCon.connect();
						 Statement st= con.createStatement();
						 String sql ="update login set status='"+status+"',flight_number='"+flight_no+"' where name='"+name+"'";
						flightno_status.setText(flight_no);
                                                 st.executeUpdate(sql);
                                              
                                               
					
						
						}catch(Exception ex){
							System.out.println(ex);
                                                       flag=false; 
						}

        
        
        if(flag)
        {
              Status.setText(status);
              cancel_booking.setVisible(true);
              
        }
        else
        {
            JOptionPane.showMessageDialog(null, "LOGIN REQUIRED");
        new Login().setVisible(true);            
        dispose();
            
        }
        
        
        
        
        
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_registerActionPerformed

    private void jButton4_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_loginActionPerformed
new Login().setVisible(true);
dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4_loginActionPerformed

    private void jButton1_register1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_register1ActionPerformed
new Login().setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1_register1ActionPerformed

    private void jMenuItem1_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1_exitActionPerformed
int reply=JOptionPane.showConfirmDialog(null,"sure");  
if(reply==JOptionPane.OK_OPTION)
{
    System.exit(0);
}        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1_exitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
					
						 Connection con = NewCon.connect();
						 Statement st= con.createStatement();
						 String sql ="truncate table login";
						 ResultSet rs =	st.executeQuery(sql);
					st.executeUpdate(sql);
                                        new Login().setVisible(true);
                                        dispose();
						}catch(Exception ex){
							System.out.println(ex);
						}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cancel_bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_bookingActionPerformed
String name=User_name.getText();
String flight_no="";
        try{
					
						 Connection con = NewCon.connect();
						 Statement st= con.createStatement();
						 String sql ="update login set status='Not booked',flight_number='"+flight_no+"' where name='"+name+"'";
						  st.executeUpdate(sql);
					Status.setText("Not Booked");
						 cancel_booking.setVisible(false);
						}catch(Exception ex){
							System.out.println(ex);
						}
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel_bookingActionPerformed

       /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new search_home1().setVisible(true);
            }
        });
    }
    private javax.swing.ButtonGroup button_group;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Status;
    private javax.swing.JLabel User_name;
    private javax.swing.JButton cancel_booking;
    private javax.swing.JLabel flightno_status;
    private javax.swing.JLabel hai_label;
    private javax.swing.JLabel hai_label1;
    private javax.swing.JLabel hai_label2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1_register;
    private javax.swing.JButton jButton1_register1;
    private javax.swing.JButton jButton1_selectionsummery;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4_login;
    private javax.swing.JButton jButton7_findflight;
    private javax.swing.JComboBox jComboBox1_adult1;
    private javax.swing.JComboBox jComboBox1_date;
    private javax.swing.JComboBox jComboBox2_children1;
    private javax.swing.JComboBox jComboBox2_month;
    private javax.swing.JComboBox jComboBox3_class1;
    private javax.swing.JComboBox jComboBox4_source1;
    private javax.swing.JComboBox jComboBox5_destination1;
    private javax.swing.JComboBox jComboBox6_airline1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel10_arrival_time;
    public javax.swing.JLabel jLabel10_date;
    private javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel11_dept_time;
    private javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel12_fare;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel1_email;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel jLabel9_flight_no;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1_exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JMenu menu_file;
    private javax.swing.JLabel u_should_login;
    // End of variables declaration//GEN-END:variables
}
