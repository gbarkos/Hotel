package Triplet_Suns_Hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class fire_employee extends javax.swing.JFrame {

    public fire_employee() {
        initComponents();
        model = (DefaultTableModel) jTable1.getModel();
        
        try {
            con=Connection_Manager.getConnection();
            st = con.prepareStatement("select * from Employee where id=? ");
            st1 =con.prepareStatement("delete from Employee where id=? ");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        check_employee_number();
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
        sign_up_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 650));
        setSize(new java.awt.Dimension(750, 650));
        getContentPane().setLayout(null);
        getContentPane().add(sign_up_separator);
        sign_up_separator.setBounds(20, 70, 710, 2);

        sign_up_title.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        sign_up_title.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_title.setText("Fire Employee");
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
        fire_emp.setText("Fire Employee");
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
        jLabel2.setText("Choose an employee :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 100, 220, 22);

        jTable1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"ID", null},
                {"Name", null},
                {"Surname", null},
                {"Birthdate", null},
                {"Gender", null},
                {"Address", null},
                {"Phone Number", null},
                {"Post", null},
                {"Salary", null},
                {"Years of Service", null}
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
        jScrollPane1.setBounds(20, 240, 710, 180);

        sign_up_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/252339.png"))); // NOI18N
        sign_up_bg.setPreferredSize(new java.awt.Dimension(750, 675));
        getContentPane().add(sign_up_bg);
        sign_up_bg.setBounds(0, 0, 750, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fire_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fire_backActionPerformed
        dispose();
        employee_management emp = new employee_management();
        emp.setVisible(true);
    }//GEN-LAST:event_fire_backActionPerformed

    private void fire_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fire_empActionPerformed
        try {
            st1.setString(1,selected_id);
            st1.executeUpdate();
            employee_combo_box.removeItem(selected_id);
            
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
                model.setValueAt(rs.getString("id"),0,1);
                model.setValueAt(rs.getString("name"),1,1);
                model.setValueAt(rs.getString("surname"),2,1);
                model.setValueAt(rs.getDate("date_of_birth"),3,1);
                model.setValueAt(rs.getString("gender"),4,1);
                model.setValueAt(rs.getString("address"),5,1);
                model.setValueAt(rs.getString("phone_number"),6,1);
                model.setValueAt(rs.getString("post"),7,1);
                model.setValueAt(rs.getDouble("salary"),8,1);
                model.setValueAt(rs.getInt("years_of_service"),9,1);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_employee_combo_boxItemStateChanged
    
    private void fill_list(){
        int i=0;
        String sql_statement="select id from Employee ";
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql_statement);
            while(rs.next()){
                employee_list[i]=rs.getString("id");
                i++;
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        for(int l=0; l<n; l++){
            employee_combo_box.addItem(employee_list[l]);
        }
        
    }
    
    private void check_employee_number(){
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select count(*) as pl from Employee ");
           
            while(rs.next()){
                n = rs.getInt("pl");
            }
            
            employee_list = new String[n];
            
            fill_list();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("dsafsdg");
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
            java.util.logging.Logger.getLogger(fire_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fire_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fire_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fire_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fire_employee().setVisible(true);
            }
        });
    }
    
    String selected_id;
    PreparedStatement st=null;
    PreparedStatement st1=null;
    DefaultTableModel model;
    String employee_list[];
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
    private javax.swing.JLabel sign_up_bg;
    private javax.swing.JSeparator sign_up_separator;
    private javax.swing.JLabel sign_up_title;
    // End of variables declaration//GEN-END:variables
}
