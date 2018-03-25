package Triplet_Suns_Hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class my_reservations extends javax.swing.JFrame {

    public my_reservations() {
        initComponents();
        usrnm=login_menu.getUsername();
        model = (DefaultTableModel) jTable1.getModel();
        
        try {
            con=Connection_Manager.getConnection();
            st = con.prepareStatement("select * from Reservation where reservation_id=? ");
            st1 =con.prepareStatement("delete from Reservation where reservation_id=? ");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        check_reservation_number();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sign_up_separator = new javax.swing.JSeparator();
        sign_up_title = new javax.swing.JLabel();
        admin_menu_logo = new javax.swing.JLabel();
        fire_back = new javax.swing.JButton();
        cancel_reserv = new javax.swing.JButton();
        reservations_combo_box = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        notification = new javax.swing.JLabel();
        sign_up_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(750, 650));
        getContentPane().setLayout(null);
        getContentPane().add(sign_up_separator);
        sign_up_separator.setBounds(20, 70, 710, 2);

        sign_up_title.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        sign_up_title.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_title.setText("My Reservations");
        getContentPane().add(sign_up_title);
        sign_up_title.setBounds(20, 30, 310, 30);

        admin_menu_logo.setIcon(new javax.swing.ImageIcon("F:\\TEI\\4th_Semester\\Databases\\Hotel_Managment\\Assets\\triplet_suns_logo.png")); // NOI18N
        getContentPane().add(admin_menu_logo);
        admin_menu_logo.setBounds(10, 500, 170, 100);

        fire_back.setBackground(new java.awt.Color(37, 35, 57));
        fire_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/Export-48.png"))); // NOI18N
        fire_back.setBorder(null);
        fire_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fire_backActionPerformed(evt);
            }
        });
        getContentPane().add(fire_back);
        fire_back.setBounds(640, 530, 50, 50);

        cancel_reserv.setBackground(new java.awt.Color(236, 76, 76));
        cancel_reserv.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        cancel_reserv.setForeground(new java.awt.Color(255, 255, 255));
        cancel_reserv.setText("Cancel Reservation");
        cancel_reserv.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancel_reserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_reservActionPerformed(evt);
            }
        });
        getContentPane().add(cancel_reserv);
        cancel_reserv.setBounds(270, 550, 210, 40);

        reservations_combo_box.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                reservations_combo_boxItemStateChanged(evt);
            }
        });
        getContentPane().add(reservations_combo_box);
        reservations_combo_box.setBounds(260, 90, 190, 40);

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Choose a reservation :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 100, 220, 22);

        jTable1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Reservation ID", null},
                {"Guest ID", null},
                {"Room Number", null},
                {"Check in Date", null},
                {"Check out Date", null},
                {"Reservation Date", null},
                {"Final Cost", null}
            },
            new String [] {
                "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 240, 710, 130);

        notification.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        notification.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(notification);
        notification.setBounds(470, 84, 240, 50);

        sign_up_bg.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        sign_up_bg.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/252339.png"))); // NOI18N
        sign_up_bg.setPreferredSize(new java.awt.Dimension(750, 675));
        getContentPane().add(sign_up_bg);
        sign_up_bg.setBounds(0, 0, 750, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fire_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fire_backActionPerformed
        dispose();
        user_menu emp = new user_menu();
        emp.setVisible(true);
    }//GEN-LAST:event_fire_backActionPerformed

    private void cancel_reservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_reservActionPerformed
        try {
            st1.setString(1,selected_id);
            st1.executeUpdate();
            reservations_combo_box.removeItem(selected_id);
            
            if(reservations_combo_box.getItemCount()==0){
                notification.setText("No reservations found !");
                for(int i=0; i<6; i++)
                    model.setValueAt("",i,1);
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_cancel_reservActionPerformed

    private void reservations_combo_boxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_reservations_combo_boxItemStateChanged
       
       selected_id = String.valueOf(reservations_combo_box.getSelectedItem());
        
        try {
            st.setString(1,selected_id);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                model.setValueAt(rs.getString("reservation_id"),0,1);
                model.setValueAt(rs.getString("guest_id"),1,1);
                model.setValueAt(rs.getInt("room_number"),2,1);
                model.setValueAt(rs.getDate("check_in_date"),3,1);
                model.setValueAt(rs.getDate("check_out_date"),4,1);
                model.setValueAt(rs.getTimestamp("reservation_date"),5,1);
                model.setValueAt(rs.getInt("final_cost"),6,1);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_reservations_combo_boxItemStateChanged
    
    private void fill_list(){
        int i=0;
        try {
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery("select * from Reservation R join Guest G on R.guest_id=G.id where G.username='"+usrnm+"' ");
            while(rs.next()){
                user_list[i]=rs.getString("reservation_id");
                i++;
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        for(int l=0; l<n; l++){
            reservations_combo_box.addItem(String.valueOf(user_list[l])); 
        }
        
    }
    
    private void check_reservation_number(){
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select count(*) as pl from Reservation R join Guest G "+
                                                  "on R.guest_id=G.id where G.username='"+usrnm+"' ");
           
            while(rs.next()){
                n = rs.getInt("pl");
            }
            
            System.out.println(n);
            
            if(n<=0){
                notification.setText("No reservations found !");
            }else{
                user_list = new String[n];
                notification.setText("");
                fill_list();
            }
              
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
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
            java.util.logging.Logger.getLogger(my_reservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(my_reservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(my_reservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(my_reservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new my_reservations().setVisible(true);
            }
        });
    }
    
    static String usrnm;
    String selected_id;
    PreparedStatement st=null;
    PreparedStatement st1=null;
    DefaultTableModel model;
    String user_list[];
    int n=0;
    static Connection con;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin_menu_logo;
    private javax.swing.JButton cancel_reserv;
    private javax.swing.JButton fire_back;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel notification;
    private javax.swing.JComboBox<String> reservations_combo_box;
    private javax.swing.JLabel sign_up_bg;
    private javax.swing.JSeparator sign_up_separator;
    private javax.swing.JLabel sign_up_title;
    // End of variables declaration//GEN-END:variables
}
