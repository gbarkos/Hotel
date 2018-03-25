
package Triplet_Suns_Hotel;


public class room_management extends javax.swing.JFrame {


    public room_management() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add_room = new javax.swing.JButton();
        delete_room = new javax.swing.JButton();
        sign_up_separator = new javax.swing.JSeparator();
        sign_up_title = new javax.swing.JLabel();
        admin_menu_log_out = new javax.swing.JButton();
        admin_menu_logo = new javax.swing.JLabel();
        admin_menu_bgn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 650));
        setPreferredSize(new java.awt.Dimension(750, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(750, 650));
        getContentPane().setLayout(null);

        add_room.setBackground(new java.awt.Color(236, 76, 76));
        add_room.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        add_room.setForeground(new java.awt.Color(255, 255, 255));
        add_room.setText("Add Room");
        add_room.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add_room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_roomActionPerformed(evt);
            }
        });
        getContentPane().add(add_room);
        add_room.setBounds(270, 250, 220, 40);

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
        delete_room.setBounds(270, 350, 220, 40);
        getContentPane().add(sign_up_separator);
        sign_up_separator.setBounds(20, 70, 710, 2);

        sign_up_title.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        sign_up_title.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_title.setText("Room Management");
        getContentPane().add(sign_up_title);
        sign_up_title.setBounds(20, 30, 390, 30);

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

        admin_menu_logo.setIcon(new javax.swing.ImageIcon("F:\\TEI\\4th_Semester\\Databases\\Hotel_Managment\\Assets\\triplet_suns_logo.png")); // NOI18N
        getContentPane().add(admin_menu_logo);
        admin_menu_logo.setBounds(10, 500, 170, 100);

        admin_menu_bgn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/252339.png"))); // NOI18N
        admin_menu_bgn.setMinimumSize(new java.awt.Dimension(750, 650));
        admin_menu_bgn.setPreferredSize(new java.awt.Dimension(750, 650));
        getContentPane().add(admin_menu_bgn);
        admin_menu_bgn.setBounds(0, 0, 770, 670);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void add_roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_roomActionPerformed
       dispose();
       add_room addr = new add_room();
       addr.setVisible(true);
    }//GEN-LAST:event_add_roomActionPerformed

    private void delete_roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_roomActionPerformed
        dispose();
        delete_room del = new delete_room();
        del.setVisible(true);
    }//GEN-LAST:event_delete_roomActionPerformed

    private void admin_menu_log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_menu_log_outActionPerformed
        dispose();
        administrator_menu admin = new administrator_menu();
        admin.setVisible(true);
    }//GEN-LAST:event_admin_menu_log_outActionPerformed

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
            java.util.logging.Logger.getLogger(room_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(room_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(room_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(room_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new room_management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_room;
    private javax.swing.JLabel admin_menu_bgn;
    private javax.swing.JButton admin_menu_log_out;
    private javax.swing.JLabel admin_menu_logo;
    private javax.swing.JButton delete_room;
    private javax.swing.JSeparator sign_up_separator;
    private javax.swing.JLabel sign_up_title;
    // End of variables declaration//GEN-END:variables
}
