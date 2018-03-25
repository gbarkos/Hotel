package Triplet_Suns_Hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class delete_user extends javax.swing.JFrame {

    public delete_user() {
        initComponents();
        model = (DefaultTableModel) jTable1.getModel();
        
        try {
            con=Connection_Manager.getConnection();
            st = con.prepareStatement("select * from Users where username=? ");
            st1 =con.prepareStatement("delete from Users where username=? ");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        check_user_number();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sign_up_separator = new javax.swing.JSeparator();
        sign_up_title = new javax.swing.JLabel();
        admin_menu_logo = new javax.swing.JLabel();
        fire_back = new javax.swing.JButton();
        fire_emp = new javax.swing.JButton();
        employee_combo_box = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        notification = new javax.swing.JLabel();
        sign_up_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 650));
        setPreferredSize(new java.awt.Dimension(750, 650));
        setSize(new java.awt.Dimension(750, 650));
        getContentPane().setLayout(null);
        getContentPane().add(sign_up_separator);
        sign_up_separator.setBounds(20, 70, 710, 2);

        sign_up_title.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        sign_up_title.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_title.setText("Delete User");
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

        fire_emp.setBackground(new java.awt.Color(236, 76, 76));
        fire_emp.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        fire_emp.setForeground(new java.awt.Color(255, 255, 255));
        fire_emp.setText("Delete User");
        fire_emp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fire_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fire_empActionPerformed(evt);
            }
        });
        getContentPane().add(fire_emp);
        fire_emp.setBounds(270, 550, 200, 40);

        employee_combo_box.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                employee_combo_boxItemStateChanged(evt);
            }
        });
        getContentPane().add(employee_combo_box);
        employee_combo_box.setBounds(260, 90, 150, 40);

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Choose a user :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 100, 220, 22);

        jTable1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Username", null},
                {"Password", null},
                {"Name", null},
                {"Surname", null},
                {"Birthdate", null},
                {"Gender", null},
                {"Address", null},
                {"Phone", null},
                {"Type", null}
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
        jScrollPane1.setBounds(20, 240, 710, 160);

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
        administrator_menu emp = new administrator_menu();
        emp.setVisible(true);
    }//GEN-LAST:event_fire_backActionPerformed

    private void fire_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fire_empActionPerformed
        try {
            st1.setString(1,selected_id);
            st1.executeUpdate();
            employee_combo_box.removeItem(selected_id);
            if(employee_combo_box.getSelectedItem()==null){
                clear_table();
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_fire_empActionPerformed

    private void employee_combo_boxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_employee_combo_boxItemStateChanged
       
       selected_id = String.valueOf(employee_combo_box.getSelectedItem());
        
        try {
            st.setString(1,selected_id);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                model.setValueAt(rs.getString("username"),0,1);
                model.setValueAt(rs.getString("password"),1,1);
                model.setValueAt(rs.getString("name"),2,1);
                model.setValueAt(rs.getString("surname"),3,1);
                model.setValueAt(rs.getDate("date_of_birth"),4,1);
                model.setValueAt(rs.getString("gender"),5,1);
                model.setValueAt(rs.getString("address"),6,1);
                model.setValueAt(rs.getString("phone_number"),7,1);
                model.setValueAt(rs.getString("type"),8,1);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_employee_combo_boxItemStateChanged
    
    private void fill_list(){
        int i=0;
        String sql_statement="select username from Users where type='user' ";
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql_statement);
            while(rs.next()){
                user_list[i]=rs.getString("username");
                i++;
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        for(int l=0; l<n; l++){
            employee_combo_box.addItem(user_list[l]); 
        }
        
    }
    
    private void check_user_number(){
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select count(*) as pl from Users where type='user' ");
           
            while(rs.next()){
                n = rs.getInt("pl");
            }
            
            System.out.println(n);
            
            if(n<=0){
                notification.setText("No users found !");
            }else{
                user_list = new String[n];
                notification.setText("");
                fill_list();
            }
              
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void clear_table(){
        for(int i=0; i<9; i++){
            model.setValueAt("",i,1);
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
            java.util.logging.Logger.getLogger(delete_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delete_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delete_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delete_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delete_user().setVisible(true);
            }
        });
    }
    
    String selected_id;
    PreparedStatement st=null;
    PreparedStatement st1=null;
    DefaultTableModel model;
    String user_list[];
    int n=0;
    static Connection con;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin_menu_logo;
    private javax.swing.JComboBox<String> employee_combo_box;
    private javax.swing.JButton fire_back;
    private javax.swing.JButton fire_emp;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel notification;
    private javax.swing.JLabel sign_up_bg;
    private javax.swing.JSeparator sign_up_separator;
    private javax.swing.JLabel sign_up_title;
    // End of variables declaration//GEN-END:variables
}
