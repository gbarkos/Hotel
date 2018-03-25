package Triplet_Suns_Hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class delete_room extends javax.swing.JFrame {

    public delete_room() {
        initComponents();
        model = (DefaultTableModel) jTable1.getModel();
        
        try {
            con=Connection_Manager.getConnection();
            st = con.prepareStatement("select * from Room where number=? ");
            st1 =con.prepareStatement("delete from Room where number=? ");
            
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
        fire_back = new javax.swing.JButton();
        delete_room = new javax.swing.JButton();
        room_combo_box = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        notification = new javax.swing.JLabel();
        sign_up_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 650));
        setPreferredSize(new java.awt.Dimension(750, 650));
        setSize(new java.awt.Dimension(750, 650));
        getContentPane().setLayout(null);
        getContentPane().add(sign_up_separator);
        sign_up_separator.setBounds(20, 70, 710, 2);

        sign_up_title.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        sign_up_title.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_title.setText("Delete Room");
        getContentPane().add(sign_up_title);
        sign_up_title.setBounds(20, 30, 270, 30);

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

        delete_room.setBackground(new java.awt.Color(236, 76, 76));
        delete_room.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        delete_room.setForeground(new java.awt.Color(255, 255, 255));
        delete_room.setText("Delete Room");
        delete_room.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete_room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_roomActionPerformed(evt);
            }
        });
        getContentPane().add(delete_room);
        delete_room.setBounds(270, 550, 200, 40);

        room_combo_box.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                room_combo_boxItemStateChanged(evt);
            }
        });
        getContentPane().add(room_combo_box);
        room_combo_box.setBounds(260, 90, 150, 40);

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Choose a room :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 100, 220, 22);

        jTable1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Number", null},
                {"Type", null},
                {"Theme", null},
                {"Number of Beds", null},
                {"Overnight Stay Cost", null}
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
        jScrollPane1.setBounds(20, 240, 710, 100);

        notification.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        notification.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(notification);
        notification.setBounds(490, 84, 180, 50);

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
        room_management emp = new room_management();
        emp.setVisible(true);
    }//GEN-LAST:event_fire_backActionPerformed

    private void delete_roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_roomActionPerformed
        try {
            st1.setString(1,selected_id);
            st1.executeUpdate();
            room_combo_box.removeItem(selected_id);
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_delete_roomActionPerformed

    private void room_combo_boxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_room_combo_boxItemStateChanged
       
       selected_id = String.valueOf(room_combo_box.getSelectedItem());
        
        try {
            st.setString(1,selected_id);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                model.setValueAt(rs.getInt("number"),0,1);
                model.setValueAt(rs.getString("type"),1,1);
                model.setValueAt(rs.getString("theme"),2,1);
                model.setValueAt(rs.getInt("no_of_beds"),3,1);
                model.setValueAt(rs.getInt("overnight_stay_cost"),4,1);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_room_combo_boxItemStateChanged
    
    private void fill_list(){
        int i=0;
        String sql_statement="select number from Room ";
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql_statement);
            while(rs.next()){
                room_list[i]=rs.getString("number");
                i++;
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        for(int l=0; l<n; l++){
            room_combo_box.addItem(room_list[l]); 
        }
        
    }
    
    private void check_room_number(){
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select count(*) as pl from Room ");
           
            while(rs.next()){
                n = rs.getInt("pl");
            }
            
            System.out.println(n);
            room_list = new String[n];
            fill_list();
         
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
            java.util.logging.Logger.getLogger(delete_room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delete_room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delete_room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delete_room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delete_room().setVisible(true);
            }
        });
    }
    
    String selected_id;
    PreparedStatement st=null;
    PreparedStatement st1=null;
    DefaultTableModel model;
    String room_list[];
    int n=0;
    static Connection con;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin_menu_logo;
    private javax.swing.JButton delete_room;
    private javax.swing.JButton fire_back;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel notification;
    private javax.swing.JComboBox<String> room_combo_box;
    private javax.swing.JLabel sign_up_bg;
    private javax.swing.JSeparator sign_up_separator;
    private javax.swing.JLabel sign_up_title;
    // End of variables declaration//GEN-END:variables
}
