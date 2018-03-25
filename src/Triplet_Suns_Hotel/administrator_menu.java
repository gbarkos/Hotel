package Triplet_Suns_Hotel;

public class administrator_menu extends javax.swing.JFrame {
 
    public administrator_menu() {
        initComponents();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        admin_menu_title = new javax.swing.JLabel();
        admin_menu_room_manage = new javax.swing.JButton();
        admin_menu_logo = new javax.swing.JLabel();
        admin_menu_log_out = new javax.swing.JButton();
        admin_menu_user_manage = new javax.swing.JButton();
        admin_menu_reserv_manage = new javax.swing.JButton();
        admin_menu_employee_manage = new javax.swing.JButton();
        admin_menu_bgn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Triplet Suns Hotel");
        setPreferredSize(new java.awt.Dimension(750, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(750, 675));
        getContentPane().setLayout(null);

        admin_menu_title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/banner-welcome.png"))); // NOI18N
        getContentPane().add(admin_menu_title);
        admin_menu_title.setBounds(100, 10, 600, 230);

        admin_menu_room_manage.setBackground(new java.awt.Color(236, 76, 76));
        admin_menu_room_manage.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        admin_menu_room_manage.setForeground(new java.awt.Color(255, 255, 255));
        admin_menu_room_manage.setText("Room Management");
        admin_menu_room_manage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        admin_menu_room_manage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_menu_room_manageActionPerformed(evt);
            }
        });
        getContentPane().add(admin_menu_room_manage);
        admin_menu_room_manage.setBounds(270, 430, 220, 40);

        admin_menu_logo.setIcon(new javax.swing.ImageIcon("F:\\TEI\\4th_Semester\\Databases\\Hotel_Managment\\Assets\\triplet_suns_logo.png")); // NOI18N
        getContentPane().add(admin_menu_logo);
        admin_menu_logo.setBounds(0, 510, 170, 100);

        admin_menu_log_out.setBackground(new java.awt.Color(37, 35, 57));
        admin_menu_log_out.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/Export-48.png"))); // NOI18N
        admin_menu_log_out.setBorder(null);
        admin_menu_log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_menu_log_outActionPerformed(evt);
            }
        });
        getContentPane().add(admin_menu_log_out);
        admin_menu_log_out.setBounds(660, 550, 50, 50);

        admin_menu_user_manage.setBackground(new java.awt.Color(236, 76, 76));
        admin_menu_user_manage.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        admin_menu_user_manage.setForeground(new java.awt.Color(255, 255, 255));
        admin_menu_user_manage.setText("User Management");
        admin_menu_user_manage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        admin_menu_user_manage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_menu_user_manageActionPerformed(evt);
            }
        });
        getContentPane().add(admin_menu_user_manage);
        admin_menu_user_manage.setBounds(270, 360, 220, 40);

        admin_menu_reserv_manage.setBackground(new java.awt.Color(236, 76, 76));
        admin_menu_reserv_manage.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        admin_menu_reserv_manage.setForeground(new java.awt.Color(255, 255, 255));
        admin_menu_reserv_manage.setText("Reservation Management");
        admin_menu_reserv_manage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        admin_menu_reserv_manage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_menu_reserv_manageActionPerformed(evt);
            }
        });
        getContentPane().add(admin_menu_reserv_manage);
        admin_menu_reserv_manage.setBounds(260, 500, 249, 40);

        admin_menu_employee_manage.setBackground(new java.awt.Color(236, 76, 76));
        admin_menu_employee_manage.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        admin_menu_employee_manage.setForeground(new java.awt.Color(255, 255, 255));
        admin_menu_employee_manage.setText("Employee Management");
        admin_menu_employee_manage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        admin_menu_employee_manage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_menu_employee_manageActionPerformed(evt);
            }
        });
        getContentPane().add(admin_menu_employee_manage);
        admin_menu_employee_manage.setBounds(270, 290, 220, 40);

        admin_menu_bgn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/252339.png"))); // NOI18N
        admin_menu_bgn.setMinimumSize(new java.awt.Dimension(750, 650));
        admin_menu_bgn.setPreferredSize(new java.awt.Dimension(750, 650));
        getContentPane().add(admin_menu_bgn);
        admin_menu_bgn.setBounds(0, 0, 750, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void admin_menu_room_manageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_menu_room_manageActionPerformed
        dispose();
        room_management rm = new room_management();
        rm.setVisible(true);
    }//GEN-LAST:event_admin_menu_room_manageActionPerformed

    private void admin_menu_log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_menu_log_outActionPerformed
        dispose();
        login_menu login = new login_menu();
        login.setVisible(true);
    }//GEN-LAST:event_admin_menu_log_outActionPerformed

    private void admin_menu_user_manageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_menu_user_manageActionPerformed
        dispose();
        delete_user deluser = new delete_user();
        deluser.setVisible(true);
    }//GEN-LAST:event_admin_menu_user_manageActionPerformed

    private void admin_menu_reserv_manageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_menu_reserv_manageActionPerformed
        dispose();
        reservation_management rsrv = new reservation_management();
        rsrv.setVisible(true);
    }//GEN-LAST:event_admin_menu_reserv_manageActionPerformed

    private void admin_menu_employee_manageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_menu_employee_manageActionPerformed
        dispose();
        employee_management emp = new employee_management();
        emp.setVisible(true);
    }//GEN-LAST:event_admin_menu_employee_manageActionPerformed

   
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
            java.util.logging.Logger.getLogger(administrator_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(administrator_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(administrator_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(administrator_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new administrator_menu().setVisible(true);
            }
        });
    }
    
    public void setText(String txt){
        //as.setText(txt);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin_menu_bgn;
    private javax.swing.JButton admin_menu_employee_manage;
    private javax.swing.JButton admin_menu_log_out;
    private javax.swing.JLabel admin_menu_logo;
    private javax.swing.JButton admin_menu_reserv_manage;
    private javax.swing.JButton admin_menu_room_manage;
    private javax.swing.JLabel admin_menu_title;
    private javax.swing.JButton admin_menu_user_manage;
    // End of variables declaration//GEN-END:variables
}
