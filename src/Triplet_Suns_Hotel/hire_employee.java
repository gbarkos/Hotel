package Triplet_Suns_Hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTextField;

public class hire_employee extends javax.swing.JFrame {

    public hire_employee() {
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

        confirmation = new javax.swing.JDialog();
        hire_yes = new javax.swing.JButton();
        hire_no = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        sign_up_bg3 = new javax.swing.JLabel();
        id_exists = new javax.swing.JDialog();
        id_exists_ok = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        sign_up_bg4 = new javax.swing.JLabel();
        empty_fields = new javax.swing.JDialog();
        sign_up_create_account_ok = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sign_up_bg2 = new javax.swing.JLabel();
        success = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        success_ok = new javax.swing.JButton();
        sign_up_bg5 = new javax.swing.JLabel();
        sign_up_title = new javax.swing.JLabel();
        sign_up_separator = new javax.swing.JSeparator();
        sign_up_name_label = new javax.swing.JLabel();
        sign_up_surname_label = new javax.swing.JLabel();
        sign_up_phone_label = new javax.swing.JLabel();
        sign_up_address_label = new javax.swing.JLabel();
        sign_up_gender_label = new javax.swing.JLabel();
        sign_up_birthdate_label = new javax.swing.JLabel();
        hire_day = new javax.swing.JComboBox<>();
        hire_month = new javax.swing.JComboBox<>();
        hire_year = new javax.swing.JComboBox<>();
        hire_gender = new javax.swing.JComboBox<>();
        hire_address = new javax.swing.JTextField();
        hire_phone = new javax.swing.JTextField();
        hire_surname = new javax.swing.JTextField();
        hire_salary = new javax.swing.JTextField();
        hire_emp = new javax.swing.JButton();
        hire_back = new javax.swing.JButton();
        admin_menu_logo = new javax.swing.JLabel();
        sign_up_name_label1 = new javax.swing.JLabel();
        hire_name = new javax.swing.JTextField();
        sign_up_name_label2 = new javax.swing.JLabel();
        hire_id = new javax.swing.JTextField();
        hire_yos = new javax.swing.JTextField();
        sign_up_name_label3 = new javax.swing.JLabel();
        hire_post = new javax.swing.JTextField();
        sign_up_name_label4 = new javax.swing.JLabel();
        sign_up_bg = new javax.swing.JLabel();

        confirmation.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        confirmation.setResizable(false);
        confirmation.setSize(new java.awt.Dimension(375, 175));
        confirmation.getContentPane().setLayout(null);

        hire_yes.setBackground(new java.awt.Color(102, 255, 102));
        hire_yes.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        hire_yes.setForeground(new java.awt.Color(255, 255, 255));
        hire_yes.setText("Yes");
        hire_yes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hire_yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hire_yesActionPerformed(evt);
            }
        });
        confirmation.getContentPane().add(hire_yes);
        hire_yes.setBounds(50, 80, 110, 40);

        hire_no.setBackground(new java.awt.Color(236, 76, 76));
        hire_no.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        hire_no.setForeground(new java.awt.Color(255, 255, 255));
        hire_no.setText("No");
        hire_no.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hire_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hire_noActionPerformed(evt);
            }
        });
        confirmation.getContentPane().add(hire_no);
        hire_no.setBounds(210, 80, 110, 40);

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hire Employee ?");
        confirmation.getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 30, 150, 22);

        sign_up_bg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/252339.png"))); // NOI18N
        sign_up_bg3.setPreferredSize(new java.awt.Dimension(750, 675));
        confirmation.getContentPane().add(sign_up_bg3);
        sign_up_bg3.setBounds(0, 0, 400, 150);

        id_exists.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        id_exists.setResizable(false);
        id_exists.setSize(new java.awt.Dimension(375, 175));
        id_exists.getContentPane().setLayout(null);

        id_exists_ok.setBackground(new java.awt.Color(236, 76, 76));
        id_exists_ok.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        id_exists_ok.setForeground(new java.awt.Color(255, 255, 255));
        id_exists_ok.setText("OK");
        id_exists_ok.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        id_exists_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_exists_okActionPerformed(evt);
            }
        });
        id_exists.getContentPane().add(id_exists_ok);
        id_exists_ok.setBounds(130, 80, 100, 40);

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID already exists!");
        id_exists.getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 30, 240, 22);

        sign_up_bg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/252339.png"))); // NOI18N
        sign_up_bg4.setPreferredSize(new java.awt.Dimension(750, 675));
        id_exists.getContentPane().add(sign_up_bg4);
        sign_up_bg4.setBounds(0, 0, 400, 150);

        empty_fields.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        empty_fields.setResizable(false);
        empty_fields.setSize(new java.awt.Dimension(375, 175));
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

        success.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        success.setResizable(false);
        success.setSize(new java.awt.Dimension(375, 175));
        success.getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Success!");
        success.getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 30, 130, 22);

        success_ok.setBackground(new java.awt.Color(236, 76, 76));
        success_ok.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        success_ok.setForeground(new java.awt.Color(255, 255, 255));
        success_ok.setText("Ok");
        success_ok.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        success_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                success_okActionPerformed(evt);
            }
        });
        success.getContentPane().add(success_ok);
        success_ok.setBounds(130, 80, 110, 40);

        sign_up_bg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/252339.png"))); // NOI18N
        sign_up_bg5.setPreferredSize(new java.awt.Dimension(750, 675));
        success.getContentPane().add(sign_up_bg5);
        sign_up_bg5.setBounds(0, 0, 400, 150);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 650));
        setPreferredSize(new java.awt.Dimension(750, 650));
        setSize(new java.awt.Dimension(750, 650));
        getContentPane().setLayout(null);

        sign_up_title.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        sign_up_title.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_title.setText("Hire Employee");
        getContentPane().add(sign_up_title);
        sign_up_title.setBounds(20, 30, 270, 30);
        getContentPane().add(sign_up_separator);
        sign_up_separator.setBounds(20, 70, 710, 2);

        sign_up_name_label.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_name_label.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_name_label.setText("Salary :");
        getContentPane().add(sign_up_name_label);
        sign_up_name_label.setBounds(140, 460, 90, 20);

        sign_up_surname_label.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_surname_label.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_surname_label.setText("Last Name :");
        getContentPane().add(sign_up_surname_label);
        sign_up_surname_label.setBounds(110, 210, 170, 20);

        sign_up_phone_label.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_phone_label.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_phone_label.setText("Phone Number :");
        getContentPane().add(sign_up_phone_label);
        sign_up_phone_label.setBounds(74, 250, 170, 20);

        sign_up_address_label.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_address_label.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_address_label.setText("Address :");
        getContentPane().add(sign_up_address_label);
        sign_up_address_label.setBounds(130, 290, 110, 20);

        sign_up_gender_label.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_gender_label.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_gender_label.setText("Gender :");
        getContentPane().add(sign_up_gender_label);
        sign_up_gender_label.setBounds(140, 330, 90, 20);

        sign_up_birthdate_label.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_birthdate_label.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_birthdate_label.setText("Date of Birth :");
        getContentPane().add(sign_up_birthdate_label);
        sign_up_birthdate_label.setBounds(65, 370, 165, 20);

        hire_day.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        hire_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(hire_day);
        hire_day.setBounds(240, 370, 50, 30);

        hire_month.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        hire_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        getContentPane().add(hire_month);
        hire_month.setBounds(310, 370, 50, 30);

        hire_year.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        hire_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));
        getContentPane().add(hire_year);
        hire_year.setBounds(380, 370, 70, 30);

        hire_gender.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        hire_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(hire_gender);
        hire_gender.setBounds(240, 330, 80, 30);

        hire_address.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        getContentPane().add(hire_address);
        hire_address.setBounds(240, 290, 280, 30);

        hire_phone.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        getContentPane().add(hire_phone);
        hire_phone.setBounds(240, 250, 280, 30);

        hire_surname.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        getContentPane().add(hire_surname);
        hire_surname.setBounds(240, 210, 280, 30);

        hire_salary.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        getContentPane().add(hire_salary);
        hire_salary.setBounds(240, 450, 280, 30);

        hire_emp.setBackground(new java.awt.Color(236, 76, 76));
        hire_emp.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        hire_emp.setForeground(new java.awt.Color(255, 255, 255));
        hire_emp.setText("Hire Employee");
        hire_emp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hire_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hire_empActionPerformed(evt);
            }
        });
        getContentPane().add(hire_emp);
        hire_emp.setBounds(270, 550, 200, 40);

        hire_back.setBackground(new java.awt.Color(37, 35, 57));
        hire_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/Export-48.png"))); // NOI18N
        hire_back.setBorder(null);
        hire_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hire_backActionPerformed(evt);
            }
        });
        getContentPane().add(hire_back);
        hire_back.setBounds(640, 530, 50, 50);

        admin_menu_logo.setIcon(new javax.swing.ImageIcon("F:\\TEI\\4th_Semester\\Databases\\Hotel_Managment\\Assets\\triplet_suns_logo.png")); // NOI18N
        getContentPane().add(admin_menu_logo);
        admin_menu_logo.setBounds(10, 500, 170, 100);

        sign_up_name_label1.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_name_label1.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_name_label1.setText("First Name :");
        getContentPane().add(sign_up_name_label1);
        sign_up_name_label1.setBounds(100, 170, 132, 20);

        hire_name.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        getContentPane().add(hire_name);
        hire_name.setBounds(240, 170, 280, 30);

        sign_up_name_label2.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_name_label2.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_name_label2.setText("ID :");
        getContentPane().add(sign_up_name_label2);
        sign_up_name_label2.setBounds(186, 140, 44, 20);

        hire_id.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        getContentPane().add(hire_id);
        hire_id.setBounds(240, 130, 280, 30);

        hire_yos.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        getContentPane().add(hire_yos);
        hire_yos.setBounds(240, 410, 280, 30);

        sign_up_name_label3.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_name_label3.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_name_label3.setText("Post :");
        getContentPane().add(sign_up_name_label3);
        sign_up_name_label3.setBounds(160, 500, 66, 20);

        hire_post.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        getContentPane().add(hire_post);
        hire_post.setBounds(240, 490, 280, 30);

        sign_up_name_label4.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_name_label4.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_name_label4.setText("Years of service :");
        getContentPane().add(sign_up_name_label4);
        sign_up_name_label4.setBounds(30, 420, 200, 20);

        sign_up_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/252339.png"))); // NOI18N
        sign_up_bg.setPreferredSize(new java.awt.Dimension(750, 675));
        getContentPane().add(sign_up_bg);
        sign_up_bg.setBounds(0, 0, 750, 640);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hire_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hire_empActionPerformed

        id=hire_id.getText();
        salary=hire_salary.getText();
        post=hire_post.getText();
        yos=hire_yos.getText();
        name=hire_name.getText();
        surname=hire_surname.getText();
        phone=hire_phone.getText();
        address=hire_address.getText();
        gender=(String)hire_gender.getSelectedItem();
        birthdate=(String)hire_year.getSelectedItem()+"-"+(String)hire_month.getSelectedItem()+"-"+(String)hire_day.getSelectedItem();

        if(!check_blank() && !check_id()){
            confirmation.setVisible(true);
            confirmation.setSize(375,175);
            confirmation.setLocationRelativeTo(null);
            confirmation.setResizable(false);
        }else if(check_blank()){
            empty_fields.setVisible(true);
            empty_fields.setSize(375,175);
            empty_fields.setLocationRelativeTo(null);
            empty_fields.setResizable(false);
        }else if(check_id()){
            id_exists.setVisible(true);
            id_exists.setSize(375,175);
            id_exists.setLocationRelativeTo(null);
            id_exists.setResizable(false);
        }
    }//GEN-LAST:event_hire_empActionPerformed

    private void hire_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hire_backActionPerformed
        dispose();
        employee_management emp = new employee_management();
        emp.setVisible(true);
    }//GEN-LAST:event_hire_backActionPerformed

    private void hire_yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hire_yesActionPerformed

        java.sql.Date sqlDate = java.sql.Date.valueOf(birthdate);
        
        try {
            String sql_statement="insert into Employee(id,name,surname,date_of_birth,gender,address,phone_number,post,salary,years_of_service) "
                + "values(?,?,?,?,?,?,?,?,?,?) ";
            PreparedStatement statement  = con.prepareStatement(sql_statement);
            
            statement.setString(1,id);
            statement.setString(2,name);
            statement.setString(3,surname);
            statement.setDate(4,sqlDate);
            statement.setString(5,gender);
            statement.setString(6,address);
            statement.setString(7,phone);
            statement.setString(8,post);
            statement.setDouble(9,Double.valueOf(salary));
            statement.setInt(10,Integer.valueOf(yos));
            
            statement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        confirmation.dispose();
        success.setVisible(true);
        success.setLocationRelativeTo(null);
        clear_fields();
    }//GEN-LAST:event_hire_yesActionPerformed

    private void hire_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hire_noActionPerformed
        confirmation.dispose();
    }//GEN-LAST:event_hire_noActionPerformed

    private void id_exists_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_exists_okActionPerformed
        id_exists.dispose();
    }//GEN-LAST:event_id_exists_okActionPerformed

    private void sign_up_create_account_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_up_create_account_okActionPerformed
        empty_fields.dispose();
    }//GEN-LAST:event_sign_up_create_account_okActionPerformed

    private void success_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_success_okActionPerformed
        success.dispose();
    }//GEN-LAST:event_success_okActionPerformed
    
    private void clear_fields(){
        for (JTextField textbox : textFields){
            textbox.setText("");
        }
        hire_gender.setSelectedIndex(0);
        hire_day.setSelectedIndex(0);
        hire_month.setSelectedIndex(0);
        hire_year.setSelectedIndex(0);
    }
    
    private boolean check_blank(){
        for (JTextField textbox : textFields){
            if(textbox.getText().trim().isEmpty())
                return true;
        }
        return false;
    }
    
    private boolean check_id(){
        
        try {
            Statement statement=con.createStatement();
            ResultSet rs =statement.executeQuery("select id from Employee where id='"+id+"' ");
            while(rs.next()){
                String sql_id = rs.getString("id");
                if(sql_id.equals(id))return true;
                System.out.println("smth");
            }
            
            return false;
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
    private void add_to_list(){
        textFields.add(hire_name);
        textFields.add(hire_surname);
        textFields.add(hire_id);
        textFields.add(hire_phone);
        textFields.add(hire_address);
        textFields.add(hire_yos);
        textFields.add(hire_salary);
        textFields.add(hire_post);
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hire_employee().setVisible(true);
            }
        });
    }
    
    static Connection con;
    String name="";
    String surname="";
    String id="";
    String phone="";
    String address="";
    String salary="";
    String yos="";
    String post="";
    String gender="";
    String birthdate="";
    ArrayList<JTextField> textFields = new ArrayList<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin_menu_logo;
    private javax.swing.JDialog confirmation;
    private javax.swing.JDialog empty_fields;
    private javax.swing.JTextField hire_address;
    private javax.swing.JButton hire_back;
    private javax.swing.JComboBox<String> hire_day;
    private javax.swing.JButton hire_emp;
    private javax.swing.JComboBox<String> hire_gender;
    private javax.swing.JTextField hire_id;
    private javax.swing.JComboBox<String> hire_month;
    private javax.swing.JTextField hire_name;
    private javax.swing.JButton hire_no;
    private javax.swing.JTextField hire_phone;
    private javax.swing.JTextField hire_post;
    private javax.swing.JTextField hire_salary;
    private javax.swing.JTextField hire_surname;
    private javax.swing.JComboBox<String> hire_year;
    private javax.swing.JButton hire_yes;
    private javax.swing.JTextField hire_yos;
    private javax.swing.JDialog id_exists;
    private javax.swing.JButton id_exists_ok;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel sign_up_address_label;
    private javax.swing.JLabel sign_up_bg;
    private javax.swing.JLabel sign_up_bg2;
    private javax.swing.JLabel sign_up_bg3;
    private javax.swing.JLabel sign_up_bg4;
    private javax.swing.JLabel sign_up_bg5;
    private javax.swing.JLabel sign_up_birthdate_label;
    private javax.swing.JButton sign_up_create_account_ok;
    private javax.swing.JLabel sign_up_gender_label;
    private javax.swing.JLabel sign_up_name_label;
    private javax.swing.JLabel sign_up_name_label1;
    private javax.swing.JLabel sign_up_name_label2;
    private javax.swing.JLabel sign_up_name_label3;
    private javax.swing.JLabel sign_up_name_label4;
    private javax.swing.JLabel sign_up_phone_label;
    private javax.swing.JSeparator sign_up_separator;
    private javax.swing.JLabel sign_up_surname_label;
    private javax.swing.JLabel sign_up_title;
    private javax.swing.JDialog success;
    private javax.swing.JButton success_ok;
    // End of variables declaration//GEN-END:variables
}
