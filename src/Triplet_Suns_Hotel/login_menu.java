package Triplet_Suns_Hotel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Timer;

public class login_menu extends javax.swing.JFrame {

    public login_menu() {
        initComponents();
    }
    Connection con;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_logo = new javax.swing.JLabel();
        username_logo = new javax.swing.JLabel();
        password_logo = new javax.swing.JLabel();
        user_pass_seperator = new javax.swing.JSeparator();
        errors = new javax.swing.JTextField();
        username_txt = new javax.swing.JTextField();
        password_txt = new javax.swing.JPasswordField();
        create_account_btn = new javax.swing.JButton();
        sign_in_btn = new javax.swing.JButton();
        bg_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Triplet Suns Hotel");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(500, 575));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 575));
        setResizable(false);
        getContentPane().setLayout(null);

        login_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/triplet_suns_logo-lanczos3.png"))); // NOI18N
        getContentPane().add(login_logo);
        login_logo.setBounds(70, 10, 350, 200);

        username_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/user-24.png"))); // NOI18N
        getContentPane().add(username_logo);
        username_logo.setBounds(20, 240, 30, 30);

        password_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/lock-24.png"))); // NOI18N
        getContentPane().add(password_logo);
        password_logo.setBounds(20, 310, 30, 30);
        getContentPane().add(user_pass_seperator);
        user_pass_seperator.setBounds(20, 290, 450, 10);

        errors.setEditable(false);
        errors.setBackground(new java.awt.Color(255, 0, 51));
        errors.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        errors.setForeground(new java.awt.Color(255, 255, 255));
        errors.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        errors.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        errors.setOpaque(false);
        getContentPane().add(errors);
        errors.setBounds(50, 350, 390, 20);

        username_txt.setBackground(new java.awt.Color(37, 35, 57));
        username_txt.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        username_txt.setForeground(new java.awt.Color(255, 255, 255));
        username_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username_txt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        username_txt.setOpaque(false);
        getContentPane().add(username_txt);
        username_txt.setBounds(60, 240, 370, 30);

        password_txt.setBackground(new java.awt.Color(37, 35, 57));
        password_txt.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        password_txt.setForeground(new java.awt.Color(255, 255, 255));
        password_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password_txt.setBorder(null);
        getContentPane().add(password_txt);
        password_txt.setBounds(60, 310, 370, 30);

        create_account_btn.setBackground(new java.awt.Color(236, 76, 76));
        create_account_btn.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        create_account_btn.setForeground(new java.awt.Color(255, 255, 255));
        create_account_btn.setText("Create Account");
        create_account_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        create_account_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_account_btnActionPerformed(evt);
            }
        });
        getContentPane().add(create_account_btn);
        create_account_btn.setBounds(140, 480, 200, 40);

        sign_in_btn.setBackground(new java.awt.Color(236, 76, 76));
        sign_in_btn.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_in_btn.setForeground(new java.awt.Color(255, 255, 255));
        sign_in_btn.setText("Sign in");
        sign_in_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sign_in_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_in_btnActionPerformed(evt);
            }
        });
        getContentPane().add(sign_in_btn);
        sign_in_btn.setBounds(140, 390, 200, 40);

        bg_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/252339.png"))); // NOI18N
        getContentPane().add(bg_label);
        bg_label.setBounds(0, 0, 500, 560);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void create_account_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_account_btnActionPerformed
        dispose();
        account_creation sign_up = new account_creation();
        sign_up.setVisible(true);
    }//GEN-LAST:event_create_account_btnActionPerformed

    private void sign_in_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_in_btnActionPerformed
        try {
            
            con=Connection_Manager.getConnection();
            Statement statement  = con.createStatement();

            usrnm=username_txt.getText();
            pass=password_txt.getText();
            
            ResultSet rs=statement.executeQuery("select username, password, type from Users "+
                                   "where username='"+usrnm+"' and password='"+pass+"' " );
            String sql_usrnm="";
            String sql_pass="";
            String sql_type="";
            
            while(rs.next()){
                sql_usrnm=rs.getString("username");
                sql_pass=rs.getString("password");
                sql_type=rs.getString("type");
            }
            
            if(sql_usrnm.equals("") || sql_pass.equals("")){
                errors.setText("Incorrect Username or Password! Try again.");
                clear_errors.start();
            }else{
                if(sql_type.equals("admin")){
                   dispose();
                   administrator_menu admin_menu = new administrator_menu();
                   admin_menu.setVisible(true);
                }
                else{
                   dispose();
                   user_menu user = new user_menu();
                   user.setVisible(true);
                }
            }
            
            sql_usrnm="";
            sql_pass="";
            sql_type="";
             
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_sign_in_btnActionPerformed
    
    public static String getUsername(){
        return usrnm;
    }
    
    public static void main(String args[]) throws SQLException {
        
        //Connection_Manager.getConnection();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_menu().setVisible(true);
            }
        });
        
    }
    
    Timer clear_errors = new Timer(5000, new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            errors.setText("");
        }
        
    });
    static String usrnm="";
    String pass="";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_label;
    private javax.swing.JButton create_account_btn;
    private javax.swing.JTextField errors;
    private javax.swing.JLabel login_logo;
    private javax.swing.JLabel password_logo;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JButton sign_in_btn;
    private javax.swing.JSeparator user_pass_seperator;
    private javax.swing.JLabel username_logo;
    private javax.swing.JTextField username_txt;
    // End of variables declaration//GEN-END:variables
}
