package Triplet_Suns_Hotel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTextField;

public class account_creation extends javax.swing.JFrame {

    public account_creation() {
        initComponents();
        add_to_list();
        
        try {
            con=Connection_Manager.getConnection();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        no_match_pass = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        no_match_pass_ok = new javax.swing.JButton();
        sign_up_bg1 = new javax.swing.JLabel();
        empty_fields = new javax.swing.JDialog();
        sign_up_create_account_ok = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sign_up_bg2 = new javax.swing.JLabel();
        confirmation = new javax.swing.JDialog();
        sign_up_create_account_yes = new javax.swing.JButton();
        sign_up_create_account_no = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        sign_up_bg3 = new javax.swing.JLabel();
        username_exists = new javax.swing.JDialog();
        username_exists_ok = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        sign_up_bg4 = new javax.swing.JLabel();
        sign_up_title = new javax.swing.JLabel();
        sign_up_separator = new javax.swing.JSeparator();
        sign_up_usrnm = new javax.swing.JTextField();
        sign_up_usrnm_label = new javax.swing.JLabel();
        sign_up_name_label = new javax.swing.JLabel();
        sign_up_name = new javax.swing.JTextField();
        sign_up_surname_label = new javax.swing.JLabel();
        sign_up_surname = new javax.swing.JTextField();
        sign_up_phone_label = new javax.swing.JLabel();
        sign_up_phone = new javax.swing.JTextField();
        sign_up_address_label = new javax.swing.JLabel();
        sign_up_address = new javax.swing.JTextField();
        sign_up_gender_label = new javax.swing.JLabel();
        sign_up_gender = new javax.swing.JComboBox<>();
        sign_up_birthdate_label = new javax.swing.JLabel();
        sign_up_day = new javax.swing.JComboBox<>();
        sign_up_month = new javax.swing.JComboBox<>();
        sign_up_year = new javax.swing.JComboBox<>();
        sign_up_pass_label = new javax.swing.JLabel();
        sign_up_password = new javax.swing.JTextField();
        sign_up_re_pass_label = new javax.swing.JLabel();
        sign_up_re_pass = new javax.swing.JTextField();
        sign_up_log_out = new javax.swing.JButton();
        admin_menu_logo = new javax.swing.JLabel();
        sign_up_create_account_btn = new javax.swing.JButton();
        sign_up_bg = new javax.swing.JLabel();

        no_match_pass.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        no_match_pass.setResizable(false);
        no_match_pass.setSize(new java.awt.Dimension(250, 150));
        no_match_pass.getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Passwords do not match !");
        no_match_pass.getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 30, 240, 22);

        no_match_pass_ok.setBackground(new java.awt.Color(236, 76, 76));
        no_match_pass_ok.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        no_match_pass_ok.setForeground(new java.awt.Color(255, 255, 255));
        no_match_pass_ok.setText("OK");
        no_match_pass_ok.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        no_match_pass_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_match_pass_okActionPerformed(evt);
            }
        });
        no_match_pass.getContentPane().add(no_match_pass_ok);
        no_match_pass_ok.setBounds(130, 80, 100, 40);

        sign_up_bg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/252339.png"))); // NOI18N
        sign_up_bg1.setPreferredSize(new java.awt.Dimension(750, 675));
        no_match_pass.getContentPane().add(sign_up_bg1);
        sign_up_bg1.setBounds(0, 0, 400, 150);

        empty_fields.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        empty_fields.setResizable(false);
        empty_fields.setSize(new java.awt.Dimension(250, 150));
        empty_fields.getContentPane().setLayout(null);

        sign_up_create_account_ok.setBackground(new java.awt.Color(236, 76, 76));
        sign_up_create_account_ok.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_create_account_ok.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_create_account_ok.setText("OK");
        sign_up_create_account_ok.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sign_up_create_account_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_up_create_account_okActionPerformed(evt);
            }
        });
        empty_fields.getContentPane().add(sign_up_create_account_ok);
        sign_up_create_account_ok.setBounds(130, 80, 100, 40);

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fill in all of the fields !");
        empty_fields.getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 30, 270, 22);

        sign_up_bg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/252339.png"))); // NOI18N
        sign_up_bg2.setPreferredSize(new java.awt.Dimension(750, 675));
        empty_fields.getContentPane().add(sign_up_bg2);
        sign_up_bg2.setBounds(0, 0, 400, 150);

        confirmation.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        confirmation.setResizable(false);
        confirmation.getContentPane().setLayout(null);

        sign_up_create_account_yes.setBackground(new java.awt.Color(102, 255, 102));
        sign_up_create_account_yes.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_create_account_yes.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_create_account_yes.setText("Yes");
        sign_up_create_account_yes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sign_up_create_account_yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_up_create_account_yesActionPerformed(evt);
            }
        });
        confirmation.getContentPane().add(sign_up_create_account_yes);
        sign_up_create_account_yes.setBounds(50, 80, 100, 40);

        sign_up_create_account_no.setBackground(new java.awt.Color(236, 76, 76));
        sign_up_create_account_no.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_create_account_no.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_create_account_no.setText("No");
        sign_up_create_account_no.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sign_up_create_account_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_up_create_account_noActionPerformed(evt);
            }
        });
        confirmation.getContentPane().add(sign_up_create_account_no);
        sign_up_create_account_no.setBounds(210, 80, 100, 40);

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Create account ?");
        confirmation.getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 30, 160, 22);

        sign_up_bg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/252339.png"))); // NOI18N
        sign_up_bg3.setPreferredSize(new java.awt.Dimension(750, 675));
        confirmation.getContentPane().add(sign_up_bg3);
        sign_up_bg3.setBounds(0, 0, 400, 150);

        username_exists.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        username_exists.setResizable(false);
        username_exists.getContentPane().setLayout(null);

        username_exists_ok.setBackground(new java.awt.Color(236, 76, 76));
        username_exists_ok.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        username_exists_ok.setForeground(new java.awt.Color(255, 255, 255));
        username_exists_ok.setText("OK");
        username_exists_ok.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        username_exists_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_exists_okActionPerformed(evt);
            }
        });
        username_exists.getContentPane().add(username_exists_ok);
        username_exists_ok.setBounds(130, 80, 100, 40);

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username already exists!");
        username_exists.getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 30, 240, 22);

        sign_up_bg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/252339.png"))); // NOI18N
        sign_up_bg4.setPreferredSize(new java.awt.Dimension(750, 675));
        username_exists.getContentPane().add(sign_up_bg4);
        sign_up_bg4.setBounds(0, 0, 400, 150);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Triplet Suns Hotel");
        setPreferredSize(new java.awt.Dimension(750, 650));
        setSize(new java.awt.Dimension(750, 675));
        getContentPane().setLayout(null);

        sign_up_title.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        sign_up_title.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_title.setText("Sign Up");
        getContentPane().add(sign_up_title);
        sign_up_title.setBounds(20, 30, 180, 30);
        getContentPane().add(sign_up_separator);
        sign_up_separator.setBounds(20, 70, 710, 2);

        sign_up_usrnm.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        getContentPane().add(sign_up_usrnm);
        sign_up_usrnm.setBounds(240, 130, 280, 30);

        sign_up_usrnm_label.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_usrnm_label.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_usrnm_label.setText("Username :");
        getContentPane().add(sign_up_usrnm_label);
        sign_up_usrnm_label.setBounds(120, 130, 170, 20);

        sign_up_name_label.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_name_label.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_name_label.setText("First Name :");
        getContentPane().add(sign_up_name_label);
        sign_up_name_label.setBounds(100, 170, 132, 20);

        sign_up_name.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        getContentPane().add(sign_up_name);
        sign_up_name.setBounds(240, 170, 280, 30);

        sign_up_surname_label.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_surname_label.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_surname_label.setText("Last Name :");
        getContentPane().add(sign_up_surname_label);
        sign_up_surname_label.setBounds(110, 210, 170, 20);

        sign_up_surname.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        getContentPane().add(sign_up_surname);
        sign_up_surname.setBounds(240, 210, 280, 30);

        sign_up_phone_label.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_phone_label.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_phone_label.setText("Phone Number :");
        getContentPane().add(sign_up_phone_label);
        sign_up_phone_label.setBounds(74, 250, 170, 20);

        sign_up_phone.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        getContentPane().add(sign_up_phone);
        sign_up_phone.setBounds(240, 250, 280, 30);

        sign_up_address_label.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_address_label.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_address_label.setText("Address :");
        getContentPane().add(sign_up_address_label);
        sign_up_address_label.setBounds(130, 290, 110, 20);

        sign_up_address.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        getContentPane().add(sign_up_address);
        sign_up_address.setBounds(240, 290, 280, 30);

        sign_up_gender_label.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_gender_label.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_gender_label.setText("Gender :");
        getContentPane().add(sign_up_gender_label);
        sign_up_gender_label.setBounds(140, 330, 90, 20);

        sign_up_gender.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        sign_up_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(sign_up_gender);
        sign_up_gender.setBounds(240, 330, 120, 30);

        sign_up_birthdate_label.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_birthdate_label.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_birthdate_label.setText("Date of Birth :");
        getContentPane().add(sign_up_birthdate_label);
        sign_up_birthdate_label.setBounds(65, 370, 165, 20);

        sign_up_day.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        sign_up_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(sign_up_day);
        sign_up_day.setBounds(240, 370, 50, 30);

        sign_up_month.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        sign_up_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        getContentPane().add(sign_up_month);
        sign_up_month.setBounds(310, 370, 50, 30);

        sign_up_year.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        sign_up_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));
        getContentPane().add(sign_up_year);
        sign_up_year.setBounds(380, 370, 70, 30);

        sign_up_pass_label.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_pass_label.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_pass_label.setText("Password :");
        getContentPane().add(sign_up_pass_label);
        sign_up_pass_label.setBounds(120, 410, 110, 20);

        sign_up_password.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        getContentPane().add(sign_up_password);
        sign_up_password.setBounds(240, 410, 280, 30);

        sign_up_re_pass_label.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_re_pass_label.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_re_pass_label.setText("Re-enter Password :");
        getContentPane().add(sign_up_re_pass_label);
        sign_up_re_pass_label.setBounds(20, 450, 230, 20);

        sign_up_re_pass.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        getContentPane().add(sign_up_re_pass);
        sign_up_re_pass.setBounds(240, 450, 280, 30);

        sign_up_log_out.setBackground(new java.awt.Color(37, 35, 57));
        sign_up_log_out.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/Export-48.png"))); // NOI18N
        sign_up_log_out.setBorder(null);
        sign_up_log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_up_log_outActionPerformed(evt);
            }
        });
        getContentPane().add(sign_up_log_out);
        sign_up_log_out.setBounds(640, 530, 50, 50);

        admin_menu_logo.setIcon(new javax.swing.ImageIcon("F:\\TEI\\4th_Semester\\Databases\\Hotel_Managment\\Assets\\triplet_suns_logo.png")); // NOI18N
        getContentPane().add(admin_menu_logo);
        admin_menu_logo.setBounds(0, 500, 170, 100);

        sign_up_create_account_btn.setBackground(new java.awt.Color(236, 76, 76));
        sign_up_create_account_btn.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_create_account_btn.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_create_account_btn.setText("Create Account");
        sign_up_create_account_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sign_up_create_account_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_up_create_account_btnActionPerformed(evt);
            }
        });
        getContentPane().add(sign_up_create_account_btn);
        sign_up_create_account_btn.setBounds(270, 520, 200, 40);

        sign_up_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/252339.png"))); // NOI18N
        sign_up_bg.setPreferredSize(new java.awt.Dimension(750, 675));
        getContentPane().add(sign_up_bg);
        sign_up_bg.setBounds(0, 0, 750, 640);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sign_up_log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_up_log_outActionPerformed
        dispose();
        login_menu login = new login_menu();
        login.setVisible(true);
    }//GEN-LAST:event_sign_up_log_outActionPerformed

    private void sign_up_create_account_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_up_create_account_btnActionPerformed

        username=sign_up_usrnm.getText();
        password=sign_up_password.getText();
        re_password=sign_up_re_pass.getText();
        name=sign_up_name.getText();
        surname=sign_up_surname.getText();
        phone=sign_up_phone.getText();
        address=sign_up_address.getText();
        gender=(String)sign_up_gender.getSelectedItem();
        birthdate=(String)sign_up_year.getSelectedItem()+"-"+(String)sign_up_month.getSelectedItem()+"-"+(String)sign_up_day.getSelectedItem();
        
        if(password.equals(re_password) && !check_blank() && !check_username()){
            confirmation.setVisible(true);
            confirmation.setSize(375,175);
            confirmation.setLocationRelativeTo(null);
            confirmation.setResizable(false);
        }else if(check_blank()){
            empty_fields.setVisible(true);
            empty_fields.setSize(375,175);
            empty_fields.setLocationRelativeTo(null);
            empty_fields.setResizable(false);
        }
        else if(!password.equals(re_password)){
            no_match_pass.setVisible(true);
            no_match_pass.setSize(375,175);
            no_match_pass.setLocationRelativeTo(null);
            no_match_pass.setResizable(false);
        }else if(check_username()){
            username_exists.setVisible(true);
            username_exists.setSize(375,175);
            username_exists.setLocationRelativeTo(null);
            username_exists.setResizable(false);  
        }   
    }//GEN-LAST:event_sign_up_create_account_btnActionPerformed

    private void no_match_pass_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_match_pass_okActionPerformed
        no_match_pass.dispose();
    }//GEN-LAST:event_no_match_pass_okActionPerformed

    private void sign_up_create_account_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_up_create_account_okActionPerformed
       empty_fields.dispose();
    }//GEN-LAST:event_sign_up_create_account_okActionPerformed

    private void sign_up_create_account_yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_up_create_account_yesActionPerformed
        
        java.sql.Date sqlDate = java.sql.Date.valueOf(birthdate);
        
        try {
            Statement statement  = con.createStatement();
            statement.executeUpdate("insert into Users(username,password,name,surname,date_of_birth,gender,address,phone_number,type) "
                    + "values('"+username+"','"+password+"','"+name+"','"+surname+"','"+sqlDate+"','"+gender+"','"+address+"','"+phone+"','user') ");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        confirmation.dispose();
        dispose();
        login_menu login = new login_menu();
        login.setVisible(true);
    }//GEN-LAST:event_sign_up_create_account_yesActionPerformed

    private void sign_up_create_account_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_up_create_account_noActionPerformed
       confirmation.dispose();
    }//GEN-LAST:event_sign_up_create_account_noActionPerformed

    private void username_exists_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_exists_okActionPerformed
        username_exists.dispose();
    }//GEN-LAST:event_username_exists_okActionPerformed
    
    //Αν έστω και ένα είναι άδειο, επιστρέφει true (είναι blank)
    private boolean check_blank(){
        for (JTextField textbox : textFields){
            if(textbox.getText().trim().isEmpty())
                return true;
        }
        return false;
    }
    
    private boolean check_username(){
        
        try {
            Statement statement=con.createStatement();
            ResultSet rs =statement.executeQuery("select username from Users where username='"+username+"' ");
            while(rs.next()){
                String usrnm = rs.getString("username");
                if(usrnm.equals(username))return true;
            }
            
            return false;
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
    private void add_to_list(){
        textFields.add(sign_up_usrnm);
        textFields.add(sign_up_password);
        textFields.add(sign_up_re_pass);
        textFields.add(sign_up_name);
        textFields.add(sign_up_surname);
        textFields.add(sign_up_phone);
        textFields.add(sign_up_address);
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
            java.util.logging.Logger.getLogger(account_creation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(account_creation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(account_creation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(account_creation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new account_creation().setVisible(true);
            }
        });
    }
   
   static Connection con;
   String username="";
   String password="";
   String re_password="";
   String name="";
   String surname="";
   String phone="";
   String address="";
   String gender="";
   String birthdate="";
   
   ArrayList<JTextField> textFields = new ArrayList<>();
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin_menu_logo;
    private javax.swing.JDialog confirmation;
    private javax.swing.JDialog empty_fields;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JDialog no_match_pass;
    private javax.swing.JButton no_match_pass_ok;
    private javax.swing.JTextField sign_up_address;
    private javax.swing.JLabel sign_up_address_label;
    private javax.swing.JLabel sign_up_bg;
    private javax.swing.JLabel sign_up_bg1;
    private javax.swing.JLabel sign_up_bg2;
    private javax.swing.JLabel sign_up_bg3;
    private javax.swing.JLabel sign_up_bg4;
    private javax.swing.JLabel sign_up_birthdate_label;
    private javax.swing.JButton sign_up_create_account_btn;
    private javax.swing.JButton sign_up_create_account_no;
    private javax.swing.JButton sign_up_create_account_ok;
    private javax.swing.JButton sign_up_create_account_yes;
    private javax.swing.JComboBox<String> sign_up_day;
    private javax.swing.JComboBox<String> sign_up_gender;
    private javax.swing.JLabel sign_up_gender_label;
    private javax.swing.JButton sign_up_log_out;
    private javax.swing.JComboBox<String> sign_up_month;
    private javax.swing.JTextField sign_up_name;
    private javax.swing.JLabel sign_up_name_label;
    private javax.swing.JLabel sign_up_pass_label;
    private javax.swing.JTextField sign_up_password;
    private javax.swing.JTextField sign_up_phone;
    private javax.swing.JLabel sign_up_phone_label;
    private javax.swing.JTextField sign_up_re_pass;
    private javax.swing.JLabel sign_up_re_pass_label;
    private javax.swing.JSeparator sign_up_separator;
    private javax.swing.JTextField sign_up_surname;
    private javax.swing.JLabel sign_up_surname_label;
    private javax.swing.JLabel sign_up_title;
    private javax.swing.JTextField sign_up_usrnm;
    private javax.swing.JLabel sign_up_usrnm_label;
    private javax.swing.JComboBox<String> sign_up_year;
    private javax.swing.JDialog username_exists;
    private javax.swing.JButton username_exists_ok;
    // End of variables declaration//GEN-END:variables
}
