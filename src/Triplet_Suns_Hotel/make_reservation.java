package Triplet_Suns_Hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class make_reservation extends javax.swing.JFrame {

    public make_reservation() {
        initComponents();
        try {
            con=Connection_Manager.getConnection();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        check_room_number();
        try {
            ps = con.prepareStatement("select number from Room R where theme=? "
                    + "and type=? and no_of_beds=? and not exists(select * from Reservation K where R.number=k.room_number "
                    + "and check_in_date < ? and check_out_date > ?)");
            
            namesurname = con.prepareStatement("select * from Users where username=?");
                           
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmation = new javax.swing.JDialog();
        sign_up_title1 = new javax.swing.JLabel();
        sign_up_separator1 = new javax.swing.JSeparator();
        sign_up_name_label7 = new javax.swing.JLabel();
        sign_up_birthdate_label3 = new javax.swing.JLabel();
        sign_up_birthdate_label1 = new javax.swing.JLabel();
        sign_up_name_label8 = new javax.swing.JLabel();
        sign_up_name_label9 = new javax.swing.JLabel();
        sign_up_name_label10 = new javax.swing.JLabel();
        details_confirm = new javax.swing.JButton();
        admin_menu_logo1 = new javax.swing.JLabel();
        sign_up_birthdate_label4 = new javax.swing.JLabel();
        sign_up_birthdate_label5 = new javax.swing.JLabel();
        details_id = new javax.swing.JLabel();
        sign_up_name_label12 = new javax.swing.JLabel();
        details_return = new javax.swing.JButton();
        details_name = new javax.swing.JLabel();
        details_check_in_date = new javax.swing.JLabel();
        details_theme = new javax.swing.JLabel();
        details_beds = new javax.swing.JLabel();
        details_username = new javax.swing.JLabel();
        details_surname = new javax.swing.JLabel();
        details_check_out_date = new javax.swing.JLabel();
        details_cost = new javax.swing.JLabel();
        sign_up_name_label21 = new javax.swing.JLabel();
        details_type = new javax.swing.JLabel();
        sign_up_name_label11 = new javax.swing.JLabel();
        details_room_num = new javax.swing.JLabel();
        sign_up_bg3 = new javax.swing.JLabel();
        empty_fields = new javax.swing.JDialog();
        sign_up_create_account_ok = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sign_up_bg2 = new javax.swing.JLabel();
        success = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        success_ok = new javax.swing.JButton();
        sign_up_bg5 = new javax.swing.JLabel();
        info = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        success_ok1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        sign_up_bg6 = new javax.swing.JLabel();
        date = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        success_ok2 = new javax.swing.JButton();
        sign_up_bg7 = new javax.swing.JLabel();
        pick_a_room = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        success_ok3 = new javax.swing.JButton();
        sign_up_bg8 = new javax.swing.JLabel();
        sign_up_title = new javax.swing.JLabel();
        sign_up_separator = new javax.swing.JSeparator();
        sign_up_birthdate_label = new javax.swing.JLabel();
        out_day = new javax.swing.JComboBox<>();
        out_month = new javax.swing.JComboBox<>();
        out_year = new javax.swing.JComboBox<>();
        complete = new javax.swing.JButton();
        hire_back = new javax.swing.JButton();
        admin_menu_logo = new javax.swing.JLabel();
        sign_up_name_label2 = new javax.swing.JLabel();
        user_id = new javax.swing.JTextField();
        sign_up_name_label3 = new javax.swing.JLabel();
        sign_up_name_label4 = new javax.swing.JLabel();
        sign_up_birthdate_label2 = new javax.swing.JLabel();
        in_day = new javax.swing.JComboBox<>();
        in_month = new javax.swing.JComboBox<>();
        in_year = new javax.swing.JComboBox<>();
        beds_box = new javax.swing.JComboBox<>();
        no_results = new javax.swing.JLabel();
        sign_up_name_label5 = new javax.swing.JLabel();
        theme_box = new javax.swing.JComboBox<>();
        type_box = new javax.swing.JComboBox<>();
        roomlist = new javax.swing.JComboBox<>();
        sign_up_name_label6 = new javax.swing.JLabel();
        proceed = new javax.swing.JButton();
        check = new javax.swing.JButton();
        sign_up_bg = new javax.swing.JLabel();

        confirmation.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        confirmation.setMinimumSize(new java.awt.Dimension(750, 650));
        confirmation.setResizable(false);
        confirmation.setSize(new java.awt.Dimension(750, 650));
        confirmation.getContentPane().setLayout(null);

        sign_up_title1.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        sign_up_title1.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_title1.setText("Reservation Details");
        confirmation.getContentPane().add(sign_up_title1);
        sign_up_title1.setBounds(20, 30, 410, 30);
        confirmation.getContentPane().add(sign_up_separator1);
        sign_up_separator1.setBounds(20, 70, 710, 2);

        sign_up_name_label7.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_name_label7.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_name_label7.setText("Username :");
        confirmation.getContentPane().add(sign_up_name_label7);
        sign_up_name_label7.setBounds(360, 110, 110, 20);

        sign_up_birthdate_label3.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_birthdate_label3.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_birthdate_label3.setText("Check in date :");
        confirmation.getContentPane().add(sign_up_birthdate_label3);
        sign_up_birthdate_label3.setBounds(30, 190, 180, 20);

        sign_up_birthdate_label1.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_birthdate_label1.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_birthdate_label1.setText("Name :");
        confirmation.getContentPane().add(sign_up_birthdate_label1);
        sign_up_birthdate_label1.setBounds(30, 150, 70, 20);

        sign_up_name_label8.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_name_label8.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_name_label8.setText("Room theme :");
        confirmation.getContentPane().add(sign_up_name_label8);
        sign_up_name_label8.setBounds(30, 230, 132, 20);

        sign_up_name_label9.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_name_label9.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_name_label9.setText("Room type :");
        confirmation.getContentPane().add(sign_up_name_label9);
        sign_up_name_label9.setBounds(360, 230, 121, 20);

        sign_up_name_label10.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_name_label10.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_name_label10.setText("Final Cost :");
        confirmation.getContentPane().add(sign_up_name_label10);
        sign_up_name_label10.setBounds(30, 310, 140, 20);

        details_confirm.setBackground(new java.awt.Color(153, 255, 153));
        details_confirm.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        details_confirm.setForeground(new java.awt.Color(255, 255, 255));
        details_confirm.setText("Complete");
        details_confirm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        details_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                details_confirmActionPerformed(evt);
            }
        });
        confirmation.getContentPane().add(details_confirm);
        details_confirm.setBounds(240, 380, 100, 40);

        admin_menu_logo1.setIcon(new javax.swing.ImageIcon("F:\\TEI\\4th_Semester\\Databases\\Hotel_Managment\\Assets\\triplet_suns_logo.png")); // NOI18N
        confirmation.getContentPane().add(admin_menu_logo1);
        admin_menu_logo1.setBounds(10, 510, 170, 100);

        sign_up_birthdate_label4.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_birthdate_label4.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_birthdate_label4.setText("Surname :");
        confirmation.getContentPane().add(sign_up_birthdate_label4);
        sign_up_birthdate_label4.setBounds(360, 150, 100, 20);

        sign_up_birthdate_label5.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_birthdate_label5.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_birthdate_label5.setText("Check out date :");
        confirmation.getContentPane().add(sign_up_birthdate_label5);
        sign_up_birthdate_label5.setBounds(360, 190, 180, 20);

        details_id.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        details_id.setForeground(new java.awt.Color(255, 255, 255));
        confirmation.getContentPane().add(details_id);
        details_id.setBounds(80, 110, 270, 20);

        sign_up_name_label12.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_name_label12.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_name_label12.setText("Number of Beds :");
        confirmation.getContentPane().add(sign_up_name_label12);
        sign_up_name_label12.setBounds(30, 270, 176, 20);

        details_return.setBackground(new java.awt.Color(236, 76, 76));
        details_return.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        details_return.setForeground(new java.awt.Color(255, 255, 255));
        details_return.setText("Return");
        details_return.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        details_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                details_returnActionPerformed(evt);
            }
        });
        confirmation.getContentPane().add(details_return);
        details_return.setBounds(390, 380, 100, 40);

        details_name.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        details_name.setForeground(new java.awt.Color(255, 255, 255));
        confirmation.getContentPane().add(details_name);
        details_name.setBounds(100, 150, 250, 20);

        details_check_in_date.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        details_check_in_date.setForeground(new java.awt.Color(255, 255, 255));
        confirmation.getContentPane().add(details_check_in_date);
        details_check_in_date.setBounds(200, 190, 150, 20);

        details_theme.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        details_theme.setForeground(new java.awt.Color(255, 255, 255));
        confirmation.getContentPane().add(details_theme);
        details_theme.setBounds(170, 230, 180, 20);

        details_beds.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        details_beds.setForeground(new java.awt.Color(255, 255, 255));
        confirmation.getContentPane().add(details_beds);
        details_beds.setBounds(210, 270, 140, 20);

        details_username.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        details_username.setForeground(new java.awt.Color(255, 255, 255));
        confirmation.getContentPane().add(details_username);
        details_username.setBounds(480, 110, 250, 20);

        details_surname.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        details_surname.setForeground(new java.awt.Color(255, 255, 255));
        confirmation.getContentPane().add(details_surname);
        details_surname.setBounds(470, 150, 260, 20);

        details_check_out_date.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        details_check_out_date.setForeground(new java.awt.Color(255, 255, 255));
        confirmation.getContentPane().add(details_check_out_date);
        details_check_out_date.setBounds(540, 190, 190, 20);

        details_cost.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        details_cost.setForeground(new java.awt.Color(255, 255, 255));
        confirmation.getContentPane().add(details_cost);
        details_cost.setBounds(170, 310, 230, 20);

        sign_up_name_label21.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_name_label21.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_name_label21.setText("ID :");
        confirmation.getContentPane().add(sign_up_name_label21);
        sign_up_name_label21.setBounds(30, 110, 50, 20);

        details_type.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        details_type.setForeground(new java.awt.Color(255, 255, 255));
        confirmation.getContentPane().add(details_type);
        details_type.setBounds(490, 230, 240, 20);

        sign_up_name_label11.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_name_label11.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_name_label11.setText("Room Number :");
        confirmation.getContentPane().add(sign_up_name_label11);
        sign_up_name_label11.setBounds(360, 270, 150, 20);

        details_room_num.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        details_room_num.setForeground(new java.awt.Color(255, 255, 255));
        confirmation.getContentPane().add(details_room_num);
        details_room_num.setBounds(510, 270, 220, 20);

        sign_up_bg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/252339.png"))); // NOI18N
        sign_up_bg3.setMinimumSize(new java.awt.Dimension(750, 650));
        sign_up_bg3.setPreferredSize(new java.awt.Dimension(750, 650));
        confirmation.getContentPane().add(sign_up_bg3);
        sign_up_bg3.setBounds(0, 0, 750, 650);

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
        success.setAlwaysOnTop(true);
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

        info.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        info.setResizable(false);
        info.setSize(new java.awt.Dimension(375, 175));
        info.getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Everything Else = Normal = 2-4 beds");
        info.getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 40, 360, 30);

        success_ok1.setBackground(new java.awt.Color(236, 76, 76));
        success_ok1.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        success_ok1.setForeground(new java.awt.Color(255, 255, 255));
        success_ok1.setText("Ok");
        success_ok1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        success_ok1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                success_ok1ActionPerformed(evt);
            }
        });
        info.getContentPane().add(success_ok1);
        success_ok1.setBounds(140, 90, 110, 30);

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Roman Palace = Suite = 4 beds");
        info.getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 10, 360, 30);

        sign_up_bg6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/252339.png"))); // NOI18N
        sign_up_bg6.setPreferredSize(new java.awt.Dimension(750, 675));
        info.getContentPane().add(sign_up_bg6);
        sign_up_bg6.setBounds(0, 0, 400, 150);

        date.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        date.setResizable(false);
        date.setSize(new java.awt.Dimension(375, 175));
        date.getContentPane().setLayout(null);

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Check in date <= Check out date !");
        date.getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 30, 340, 22);

        success_ok2.setBackground(new java.awt.Color(236, 76, 76));
        success_ok2.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        success_ok2.setForeground(new java.awt.Color(255, 255, 255));
        success_ok2.setText("Ok");
        success_ok2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        success_ok2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                success_ok2ActionPerformed(evt);
            }
        });
        date.getContentPane().add(success_ok2);
        success_ok2.setBounds(130, 80, 110, 40);

        sign_up_bg7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/252339.png"))); // NOI18N
        sign_up_bg7.setPreferredSize(new java.awt.Dimension(750, 675));
        date.getContentPane().add(sign_up_bg7);
        sign_up_bg7.setBounds(0, 0, 400, 150);

        pick_a_room.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        pick_a_room.setResizable(false);
        pick_a_room.setSize(new java.awt.Dimension(375, 175));
        pick_a_room.getContentPane().setLayout(null);

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Pick a room!");
        pick_a_room.getContentPane().add(jLabel9);
        jLabel9.setBounds(120, 30, 130, 30);

        success_ok3.setBackground(new java.awt.Color(236, 76, 76));
        success_ok3.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        success_ok3.setForeground(new java.awt.Color(255, 255, 255));
        success_ok3.setText("Ok");
        success_ok3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        success_ok3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                success_ok3ActionPerformed(evt);
            }
        });
        pick_a_room.getContentPane().add(success_ok3);
        success_ok3.setBounds(130, 80, 110, 40);

        sign_up_bg8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/252339.png"))); // NOI18N
        sign_up_bg8.setPreferredSize(new java.awt.Dimension(750, 675));
        pick_a_room.getContentPane().add(sign_up_bg8);
        sign_up_bg8.setBounds(0, 0, 400, 150);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(750, 650));
        getContentPane().setLayout(null);

        sign_up_title.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        sign_up_title.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_title.setText("Make a Reservation");
        getContentPane().add(sign_up_title);
        sign_up_title.setBounds(20, 30, 370, 30);
        getContentPane().add(sign_up_separator);
        sign_up_separator.setBounds(20, 70, 710, 2);

        sign_up_birthdate_label.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_birthdate_label.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_birthdate_label.setText("Check out date :");
        getContentPane().add(sign_up_birthdate_label);
        sign_up_birthdate_label.setBounds(50, 220, 180, 20);

        out_day.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        out_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(out_day);
        out_day.setBounds(240, 210, 50, 30);

        out_month.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        out_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        getContentPane().add(out_month);
        out_month.setBounds(310, 210, 50, 30);

        out_year.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        out_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018" }));
        getContentPane().add(out_year);
        out_year.setBounds(380, 210, 70, 30);

        complete.setBackground(new java.awt.Color(236, 76, 76));
        complete.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        complete.setForeground(new java.awt.Color(255, 255, 255));
        complete.setText("Info");
        complete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        complete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeActionPerformed(evt);
            }
        });
        getContentPane().add(complete);
        complete.setBounds(650, 90, 70, 30);

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
        admin_menu_logo.setBounds(10, 510, 170, 100);

        sign_up_name_label2.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_name_label2.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_name_label2.setText("Your ID :");
        getContentPane().add(sign_up_name_label2);
        sign_up_name_label2.setBounds(134, 140, 100, 20);

        user_id.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        getContentPane().add(user_id);
        user_id.setBounds(240, 130, 210, 30);

        sign_up_name_label3.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_name_label3.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_name_label3.setText("Available rooms based on your criteria");
        getContentPane().add(sign_up_name_label3);
        sign_up_name_label3.setBounds(170, 420, 440, 20);

        sign_up_name_label4.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_name_label4.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_name_label4.setText("Room type :");
        getContentPane().add(sign_up_name_label4);
        sign_up_name_label4.setBounds(100, 310, 121, 20);

        sign_up_birthdate_label2.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_birthdate_label2.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_birthdate_label2.setText("Check in date :");
        getContentPane().add(sign_up_birthdate_label2);
        sign_up_birthdate_label2.setBounds(60, 180, 180, 20);

        in_day.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        in_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(in_day);
        in_day.setBounds(240, 170, 50, 30);

        in_month.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        in_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        getContentPane().add(in_month);
        in_month.setBounds(310, 170, 50, 30);

        in_year.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        in_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018" }));
        getContentPane().add(in_year);
        in_year.setBounds(380, 170, 70, 30);

        getContentPane().add(beds_box);
        beds_box.setBounds(240, 340, 120, 30);

        no_results.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        no_results.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(no_results);
        no_results.setBounds(520, 450, 190, 30);

        sign_up_name_label5.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_name_label5.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_name_label5.setText("Room theme :");
        getContentPane().add(sign_up_name_label5);
        sign_up_name_label5.setBounds(90, 270, 132, 20);

        getContentPane().add(theme_box);
        theme_box.setBounds(240, 260, 120, 30);

        getContentPane().add(type_box);
        type_box.setBounds(240, 300, 120, 30);

        getContentPane().add(roomlist);
        roomlist.setBounds(390, 450, 110, 30);

        sign_up_name_label6.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_name_label6.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_name_label6.setText("Number of Beds :");
        getContentPane().add(sign_up_name_label6);
        sign_up_name_label6.setBounds(50, 350, 176, 20);

        proceed.setBackground(new java.awt.Color(236, 76, 76));
        proceed.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        proceed.setForeground(new java.awt.Color(255, 255, 255));
        proceed.setText("Proceed");
        proceed.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedActionPerformed(evt);
            }
        });
        getContentPane().add(proceed);
        proceed.setBounds(270, 550, 200, 40);

        check.setBackground(new java.awt.Color(236, 76, 76));
        check.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        check.setForeground(new java.awt.Color(255, 255, 255));
        check.setText("Check");
        check.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        getContentPane().add(check);
        check.setBounds(230, 450, 70, 30);

        sign_up_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/252339.png"))); // NOI18N
        sign_up_bg.setPreferredSize(new java.awt.Dimension(750, 675));
        getContentPane().add(sign_up_bg);
        sign_up_bg.setBounds(0, 0, 750, 640);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void completeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeActionPerformed
        info.setVisible(true);
        info.setLocationRelativeTo(null);
    }//GEN-LAST:event_completeActionPerformed

    private void hire_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hire_backActionPerformed
        dispose();
        user_menu emp = new user_menu();
        emp.setVisible(true);
    }//GEN-LAST:event_hire_backActionPerformed

    private void sign_up_create_account_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_up_create_account_okActionPerformed
        empty_fields.dispose();
    }//GEN-LAST:event_sign_up_create_account_okActionPerformed

    private void success_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_success_okActionPerformed
        success.dispose();
        confirmation.dispose();
        dispose();
        user_menu usr = new user_menu();
        usr.setVisible(true);
        
    }//GEN-LAST:event_success_okActionPerformed

    private void proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedActionPerformed
        
        id=user_id.getText();
        if(!id.equals("") && roomlist.getSelectedItem()!=null){
            setVisible(false);
            confirmation.setVisible(true);
            confirmation.setLocationRelativeTo(null);
            
            username=login_menu.getUsername();
            bedno=Integer.valueOf(roomlist.getSelectedItem()+"");
            diff=Math.abs(check_out_date.getTime() - check_in_date.getTime());
            diffDays = diff / (24 * 60 * 60 * 1000); 
            
            details_id.setText(id);
            details_username.setText(username);
            try {
                namesurname.setString(1,username);
                ResultSet u_set = namesurname.executeQuery();
                while(u_set.next()){
                    details_name.setText(u_set.getString("name"));
                    details_surname.setText(u_set.getString("surname"));
                }
                Statement osc = con.createStatement();
                u_set=osc.executeQuery("select overnight_stay_cost from Room where number="+bedno+" ");
                while(u_set.next()){
                    day_cost=u_set.getInt("overnight_stay_cost");
                }
                stay_cost=day_cost*diffDays;
                details_cost.setText(String.valueOf(stay_cost+" €"));
                
                
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            details_beds.setText(String.valueOf(nob));
            details_room_num.setText(String.valueOf(bedno));
            details_theme.setText(theme);
            details_type.setText(type);
            details_check_in_date.setText(String.valueOf(check_in_date));
            details_check_out_date.setText(String.valueOf(check_out_date));  
        }
        else if(id.equals("")){
            empty_fields.setVisible(true);
            empty_fields.setLocationRelativeTo(null);
        }
        else if(roomlist.getSelectedItem()==null){
            pick_a_room.setVisible(true);
            pick_a_room.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_proceedActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        roomlist.removeAllItems();
        compare_in=Integer.parseInt(in_day.getSelectedItem()+""+in_month.getSelectedItem()+""+in_year.getSelectedItem());
        compare_out=Integer.parseInt(out_day.getSelectedItem()+""+out_month.getSelectedItem()+""+out_year.getSelectedItem());
        
        check_in_date= java.sql.Date.valueOf(in_year.getSelectedItem()+"-"+in_month.getSelectedItem()+"-"+in_day.getSelectedItem());
        check_out_date= java.sql.Date.valueOf((String)out_year.getSelectedItem()+"-"+out_month.getSelectedItem()+"-"+out_day.getSelectedItem());
        theme=String.valueOf(theme_box.getSelectedItem());
        type=String.valueOf(type_box.getSelectedItem());
        nob=Integer.valueOf(beds_box.getSelectedItem()+"");
        
        if(compare_in>=compare_out){
            date.setVisible(true);
            date.setLocationRelativeTo(null);
        }else{
            try {
                ps.setString(1,theme);
                System.out.println(theme);
                ps.setString(2,type);
                System.out.println(type);
                ps.setInt(3,nob);
                System.out.println(nob);
                
                ps.setDate(4,check_out_date);
                System.out.println(check_in_date);
                ps.setDate(5,check_in_date);
                System.out.println(check_out_date);
                
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    roomlist.addItem(String.valueOf(rs.getInt("number")));
                }
                if(roomlist.getItemCount()==0)no_results.setText("No results!");
                else{
                    no_results.setText("");
                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_checkActionPerformed

    private void success_ok1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_success_ok1ActionPerformed
        info.dispose();
    }//GEN-LAST:event_success_ok1ActionPerformed

    private void success_ok2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_success_ok2ActionPerformed
        date.dispose();
    }//GEN-LAST:event_success_ok2ActionPerformed

    private void success_ok3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_success_ok3ActionPerformed
        pick_a_room.dispose();
    }//GEN-LAST:event_success_ok3ActionPerformed

    private void details_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_details_confirmActionPerformed

        String dummy_id="";
        Statement stm;
        rsrvid=id+""+compare_in+""+compare_out+""+bedno;
        
        try {
            stm = con.createStatement();
            ResultSet set = stm.executeQuery("select id from Guest where id='"+id+"' ");
            while(set.next()){
                dummy_id=set.getString("id");
            }
                
            //Αν δεν υπάρχει ο χρήστης στον πίνακα Guest, τον προσθέτουμε
            if(dummy_id.equals("")){
                PreparedStatement ps = con.prepareStatement("insert into Guest(id,username,name,surname,"
                                                        + "date_of_birth,gender,address,phone_number) "
                                                        + "values(?,?,?,?,?,?,?,?)");
                
                namesurname.setString(1,username);
                ResultSet rs = namesurname.executeQuery();
                
                while(rs.next()){
                    ps.setString(1,id);
                    ps.setString(2,rs.getString("username"));
                    ps.setString(3,rs.getString("name"));
                    ps.setString(4,rs.getString("surname"));
                    ps.setDate(5,rs.getDate("date_of_birth"));
                    ps.setString(6,rs.getString("gender"));
                    ps.setString(7,rs.getString("address"));
                    ps.setString(8,rs.getString("phone_number"));

                    ps.executeUpdate();
                }
            }
            Calendar calendar = Calendar.getInstance();
            java.sql.Timestamp tmstmp = new java.sql.Timestamp(calendar.getTime().getTime());
            
            PreparedStatement ps1=con.prepareStatement("insert into Reservation(reservation_id,guest_id,"
                                                           + "room_number,check_in_date,check_out_date,reservation_date,"
                                                           + "final_cost) "
                                                           + "values(?,?,?,?,?,?,?)");
            ps1.setString(1,rsrvid);
            ps1.setString(2,id);
            ps1.setInt(3,bedno);
            ps1.setDate(4,check_in_date);
            ps1.setDate(5,check_out_date);
            ps1.setTimestamp(6,tmstmp);
            ps1.setDouble(7,(stay_cost));
                
            ps1.executeUpdate();
            
            success.setVisible(true);
            success.setLocationRelativeTo(null);
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
                
    }//GEN-LAST:event_details_confirmActionPerformed

    private void details_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_details_returnActionPerformed
        setVisible(true);
        confirmation.dispose();
    }//GEN-LAST:event_details_returnActionPerformed
    
    private void fill_boxes(){
        for(int a=0; a<i; a++){
            theme_box.addItem(theme_list[a]);
        }
        for(int c=0; c<b; c++){
            beds_box.addItem(nob_list[c]);
        }
        for(int i=0; i<2; i++){
            type_box.addItem(type_list[i]);
        }
    }
    
    private void check_room_number(){
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select DISTINCT theme from Room ");
           
            while(rs.next()){
                theme_list[i]=rs.getString("theme");
                i++;
            }
            
            rs=statement.executeQuery("select DISTINCT no_of_beds from Room ");
            while(rs.next()){
                nob_list[b]=String.valueOf(rs.getInt("no_of_beds"));
                b++;
            }    
            
            type_list[0]="normal";
            type_list[1]="suite";
            
            fill_boxes();
              
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new make_reservation().setVisible(true);
            }
        });
    }
    
    String username="";
    PreparedStatement ps=null;
    PreparedStatement namesurname=null;
    static Connection con;
    String id="";
    java.sql.Date check_in_date=null;
    java.sql.Date check_out_date=null;
    String theme="";
    String type="";
    String rsrvid="";
    int compare_in;
    int compare_out;
    int bedno;
    int nob;
    int i=0;
    int b=0;
    String theme_list[]=new String[8];
    String type_list[]=new String[5];
    String nob_list[]=new String[5];
    long diff;
    long diffDays;
    int day_cost;
    long stay_cost;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin_menu_logo;
    private javax.swing.JLabel admin_menu_logo1;
    private javax.swing.JComboBox<String> beds_box;
    private javax.swing.JButton check;
    private javax.swing.JButton complete;
    private javax.swing.JDialog confirmation;
    private javax.swing.JDialog date;
    private javax.swing.JLabel details_beds;
    private javax.swing.JLabel details_check_in_date;
    private javax.swing.JLabel details_check_out_date;
    private javax.swing.JButton details_confirm;
    private javax.swing.JLabel details_cost;
    private javax.swing.JLabel details_id;
    private javax.swing.JLabel details_name;
    private javax.swing.JButton details_return;
    private javax.swing.JLabel details_room_num;
    private javax.swing.JLabel details_surname;
    private javax.swing.JLabel details_theme;
    private javax.swing.JLabel details_type;
    private javax.swing.JLabel details_username;
    private javax.swing.JDialog empty_fields;
    private javax.swing.JButton hire_back;
    private javax.swing.JComboBox<String> in_day;
    private javax.swing.JComboBox<String> in_month;
    private javax.swing.JComboBox<String> in_year;
    private javax.swing.JDialog info;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel no_results;
    private javax.swing.JComboBox<String> out_day;
    private javax.swing.JComboBox<String> out_month;
    private javax.swing.JComboBox<String> out_year;
    private javax.swing.JDialog pick_a_room;
    private javax.swing.JButton proceed;
    private javax.swing.JComboBox<String> roomlist;
    private javax.swing.JLabel sign_up_bg;
    private javax.swing.JLabel sign_up_bg2;
    private javax.swing.JLabel sign_up_bg3;
    private javax.swing.JLabel sign_up_bg5;
    private javax.swing.JLabel sign_up_bg6;
    private javax.swing.JLabel sign_up_bg7;
    private javax.swing.JLabel sign_up_bg8;
    private javax.swing.JLabel sign_up_birthdate_label;
    private javax.swing.JLabel sign_up_birthdate_label1;
    private javax.swing.JLabel sign_up_birthdate_label2;
    private javax.swing.JLabel sign_up_birthdate_label3;
    private javax.swing.JLabel sign_up_birthdate_label4;
    private javax.swing.JLabel sign_up_birthdate_label5;
    private javax.swing.JButton sign_up_create_account_ok;
    private javax.swing.JLabel sign_up_name_label10;
    private javax.swing.JLabel sign_up_name_label11;
    private javax.swing.JLabel sign_up_name_label12;
    private javax.swing.JLabel sign_up_name_label2;
    private javax.swing.JLabel sign_up_name_label21;
    private javax.swing.JLabel sign_up_name_label3;
    private javax.swing.JLabel sign_up_name_label4;
    private javax.swing.JLabel sign_up_name_label5;
    private javax.swing.JLabel sign_up_name_label6;
    private javax.swing.JLabel sign_up_name_label7;
    private javax.swing.JLabel sign_up_name_label8;
    private javax.swing.JLabel sign_up_name_label9;
    private javax.swing.JSeparator sign_up_separator;
    private javax.swing.JSeparator sign_up_separator1;
    private javax.swing.JLabel sign_up_title;
    private javax.swing.JLabel sign_up_title1;
    private javax.swing.JDialog success;
    private javax.swing.JButton success_ok;
    private javax.swing.JButton success_ok1;
    private javax.swing.JButton success_ok2;
    private javax.swing.JButton success_ok3;
    private javax.swing.JComboBox<String> theme_box;
    private javax.swing.JComboBox<String> type_box;
    private javax.swing.JTextField user_id;
    // End of variables declaration//GEN-END:variables
}
