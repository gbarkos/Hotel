package Triplet_Suns_Hotel;

public class user_menu extends javax.swing.JFrame {
 
    public user_menu() {
        initComponents();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        admin_menu_title = new javax.swing.JLabel();
        user_menu_make_reserv = new javax.swing.JButton();
        admin_menu_logo = new javax.swing.JLabel();
        admin_menu_log_out = new javax.swing.JButton();
        user_menu_my_reserv = new javax.swing.JButton();
        user_menu_profile = new javax.swing.JButton();
        admin_menu_bgn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Triplet Suns Hotel");
        setMinimumSize(new java.awt.Dimension(750, 650));
        setPreferredSize(new java.awt.Dimension(750, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(750, 650));
        getContentPane().setLayout(null);

        admin_menu_title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/banner-welcome.png"))); // NOI18N
        getContentPane().add(admin_menu_title);
        admin_menu_title.setBounds(100, 10, 600, 230);

        user_menu_make_reserv.setBackground(new java.awt.Color(236, 76, 76));
        user_menu_make_reserv.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        user_menu_make_reserv.setForeground(new java.awt.Color(255, 255, 255));
        user_menu_make_reserv.setText("Make a Reservation");
        user_menu_make_reserv.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        user_menu_make_reserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_menu_make_reservActionPerformed(evt);
            }
        });
        getContentPane().add(user_menu_make_reserv);
        user_menu_make_reserv.setBounds(270, 430, 220, 40);

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

        user_menu_my_reserv.setBackground(new java.awt.Color(236, 76, 76));
        user_menu_my_reserv.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        user_menu_my_reserv.setForeground(new java.awt.Color(255, 255, 255));
        user_menu_my_reserv.setText("My Reservations");
        user_menu_my_reserv.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        user_menu_my_reserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_menu_my_reservActionPerformed(evt);
            }
        });
        getContentPane().add(user_menu_my_reserv);
        user_menu_my_reserv.setBounds(270, 360, 220, 40);

        user_menu_profile.setBackground(new java.awt.Color(236, 76, 76));
        user_menu_profile.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        user_menu_profile.setForeground(new java.awt.Color(255, 255, 255));
        user_menu_profile.setText("My Profile");
        user_menu_profile.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        user_menu_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_menu_profileActionPerformed(evt);
            }
        });
        getContentPane().add(user_menu_profile);
        user_menu_profile.setBounds(270, 290, 220, 40);

        admin_menu_bgn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/252339.png"))); // NOI18N
        admin_menu_bgn.setMinimumSize(new java.awt.Dimension(750, 650));
        admin_menu_bgn.setPreferredSize(new java.awt.Dimension(750, 650));
        getContentPane().add(admin_menu_bgn);
        admin_menu_bgn.setBounds(0, 0, 750, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void user_menu_make_reservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_menu_make_reservActionPerformed
        dispose();
        make_reservation rm = new make_reservation();
        rm.setVisible(true);
    }//GEN-LAST:event_user_menu_make_reservActionPerformed

    private void admin_menu_log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_menu_log_outActionPerformed
        dispose();
        login_menu login = new login_menu();
        login.setVisible(true);
    }//GEN-LAST:event_admin_menu_log_outActionPerformed

    private void user_menu_my_reservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_menu_my_reservActionPerformed
        dispose();
        my_reservations myrsrv = new my_reservations();
        myrsrv.setVisible(true);
    }//GEN-LAST:event_user_menu_my_reservActionPerformed

    private void user_menu_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_menu_profileActionPerformed
        dispose();
        show_profile profile = new show_profile();
        profile.setVisible(true);
    }//GEN-LAST:event_user_menu_profileActionPerformed

   
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
            java.util.logging.Logger.getLogger(user_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_menu().setVisible(true);
            }
        });
    }
    
    public void setText(String txt){
        //as.setText(txt);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin_menu_bgn;
    private javax.swing.JButton admin_menu_log_out;
    private javax.swing.JLabel admin_menu_logo;
    private javax.swing.JLabel admin_menu_title;
    private javax.swing.JButton user_menu_make_reserv;
    private javax.swing.JButton user_menu_my_reserv;
    private javax.swing.JButton user_menu_profile;
    // End of variables declaration//GEN-END:variables
}
