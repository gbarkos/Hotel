package Triplet_Suns_Hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class reservation_management extends javax.swing.JFrame {

    public reservation_management() {
        initComponents();
        model = (DefaultTableModel) jTable2.getModel();
        model2 = (DefaultTableModel) jTable1.getModel();
        try {
            con=Connection_Manager.getConnection();
            st = con.prepareStatement("select * from Reservation where reservation_id=? ");
            st2 = con.prepareStatement("select * from Guest where id=? ");
            st1 =con.prepareStatement("delete from Reservation where reservation_id=? ");
            st4=con.prepareStatement("delete from Guest where id=? ");
            st3 = con.prepareStatement("select count(*) as cnt from Reservation where guest_id=? ");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        check_room_number();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sign_up_separator = new javax.swing.JSeparator();
        sign_up_title = new javax.swing.JLabel();
        admin_menu_logo = new javax.swing.JLabel();
        rsrv_back = new javax.swing.JButton();
        delete_rsrv = new javax.swing.JButton();
        rsrv_combo_box = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
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
        sign_up_title.setText("Reservation Management");
        getContentPane().add(sign_up_title);
        sign_up_title.setBounds(20, 30, 450, 30);

        admin_menu_logo.setIcon(new javax.swing.ImageIcon("F:\\TEI\\4th_Semester\\Databases\\Hotel_Managment\\Assets\\triplet_suns_logo.png")); // NOI18N
        getContentPane().add(admin_menu_logo);
        admin_menu_logo.setBounds(10, 500, 170, 100);

        rsrv_back.setBackground(new java.awt.Color(37, 35, 57));
        rsrv_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/Export-48.png"))); // NOI18N
        rsrv_back.setBorder(null);
        rsrv_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsrv_backActionPerformed(evt);
            }
        });
        getContentPane().add(rsrv_back);
        rsrv_back.setBounds(640, 530, 50, 50);

        delete_rsrv.setBackground(new java.awt.Color(236, 76, 76));
        delete_rsrv.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        delete_rsrv.setForeground(new java.awt.Color(255, 255, 255));
        delete_rsrv.setText("Delete Reservation");
        delete_rsrv.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete_rsrv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_rsrvActionPerformed(evt);
            }
        });
        getContentPane().add(delete_rsrv);
        delete_rsrv.setBounds(270, 550, 220, 40);

        rsrv_combo_box.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rsrv_combo_boxItemStateChanged(evt);
            }
        });
        getContentPane().add(rsrv_combo_box);
        rsrv_combo_box.setBounds(260, 90, 200, 40);

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Choose a reservation :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 100, 220, 22);

        jTable1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Username", null},
                {"Name", null},
                {"Surname", null},
                {"Birthdate", null},
                {"Gender", null},
                {"Address", null},
                {"Phone", null}
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
        jScrollPane1.setBounds(20, 330, 710, 130);

        jTable2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"ID", null},
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
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 160, 710, 130);

        notification.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        notification.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(notification);
        notification.setBounds(480, 84, 260, 50);

        sign_up_bg.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        sign_up_bg.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/252339.png"))); // NOI18N
        sign_up_bg.setPreferredSize(new java.awt.Dimension(750, 675));
        getContentPane().add(sign_up_bg);
        sign_up_bg.setBounds(0, 0, 750, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rsrv_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsrv_backActionPerformed
        dispose();
        administrator_menu emp = new administrator_menu();
        emp.setVisible(true);
    }//GEN-LAST:event_rsrv_backActionPerformed

    private void delete_rsrvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_rsrvActionPerformed
        try {
            st3.setString(1,g_id);
            ResultSet rs = st3.executeQuery();
            while(rs.next()){
                count=rs.getInt("cnt");
            }
            
            if(count==1){
                st4.setString(1,g_id);
                st4.executeUpdate();
            }
            
            st1.setString(1,selected_id);
            st1.executeUpdate();
            rsrv_combo_box.removeItem(selected_id);
            
            if(rsrv_combo_box.getItemCount()==0){
                notification.setText("No reservations found !");
                for(int i=0; i<7; i++){
                    model.setValueAt("",i,1);
                    model2.setValueAt("",i,1);
                }
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_delete_rsrvActionPerformed

    private void rsrv_combo_boxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rsrv_combo_boxItemStateChanged
       
       selected_id=String.valueOf(rsrv_combo_box.getSelectedItem());
       
        try {
            st.setString(1,selected_id);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                
                model.setValueAt(rs.getString("reservation_id"),0,1);
                g_id=rs.getString("guest_id");
                model.setValueAt(g_id,1,1);
                model.setValueAt(rs.getInt("room_number"),2,1);
                model.setValueAt(rs.getDate("check_in_date"),3,1);
                model.setValueAt(rs.getDate("check_out_date"),4,1);
                model.setValueAt(rs.getTimestamp("reservation_date"),5,1);
                model.setValueAt(rs.getDouble("final_cost"),6,1);
            }
            
            st2.setString(1,g_id);
            rs=st2.executeQuery();
            
            while(rs.next()){
                model2.setValueAt(rs.getString("username"),0,1);
                model2.setValueAt(rs.getString("name"),1,1);
                model2.setValueAt(rs.getString("surname"),2,1);
                model2.setValueAt(rs.getDate("date_of_birth"),3,1);
                model2.setValueAt(rs.getString("gender"),4,1);
                model2.setValueAt(rs.getString("address"),5,1);
                model2.setValueAt(rs.getString("phone_number"),6,1);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_rsrv_combo_boxItemStateChanged
    
    private void fill_list(){
        int i=0;
        String sql_statement="select reservation_id from Reservation ";
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql_statement);
            while(rs.next()){
                reservation_list[i]=rs.getString("reservation_id");
                i++;
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        for(int l=0; l<n; l++){
            rsrv_combo_box.addItem(reservation_list[l]);
        } 
    }
        
    
    
    private void check_room_number(){
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select count(*) as pl from Reservation ");
           
            while(rs.next()){
                n = rs.getInt("pl");
            }
            
            System.out.println(n);
            if(n>0){
                reservation_list = new String[n];
                fill_list();
            }else notification.setText("No reservations found !");
            
         
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
            java.util.logging.Logger.getLogger(reservation_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reservation_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reservation_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reservation_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
     
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reservation_management().setVisible(true);
            }
        });
    }
    
    int count=0;
    String g_id="";
    String selected_id;
    PreparedStatement st=null;
    PreparedStatement st1=null;
    PreparedStatement st2=null;
    PreparedStatement st3=null;
    PreparedStatement st4=null;
    DefaultTableModel model;
    DefaultTableModel model2;
    String reservation_list[];
    int n=0;
    static Connection con;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin_menu_logo;
    private javax.swing.JButton delete_rsrv;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel notification;
    private javax.swing.JButton rsrv_back;
    private javax.swing.JComboBox<String> rsrv_combo_box;
    private javax.swing.JLabel sign_up_bg;
    private javax.swing.JSeparator sign_up_separator;
    private javax.swing.JLabel sign_up_title;
    // End of variables declaration//GEN-END:variables
}