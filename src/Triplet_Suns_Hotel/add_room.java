package Triplet_Suns_Hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTextField;

public class add_room extends javax.swing.JFrame {

    public add_room() {
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
        confirmation_yes = new javax.swing.JButton();
        confirmation_no = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        sign_up_bg3 = new javax.swing.JLabel();
        id_exists = new javax.swing.JDialog();
        number_exists_ok = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        sign_up_bg4 = new javax.swing.JLabel();
        empty_fields = new javax.swing.JDialog();
        empty_fields_ok = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sign_up_bg2 = new javax.swing.JLabel();
        success = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        success_ok = new javax.swing.JButton();
        sign_up_bg5 = new javax.swing.JLabel();
        sign_up_title = new javax.swing.JLabel();
        sign_up_separator = new javax.swing.JSeparator();
        sign_up_surname_label = new javax.swing.JLabel();
        sign_up_phone_label = new javax.swing.JLabel();
        sign_up_address_label = new javax.swing.JLabel();
        room_cost = new javax.swing.JTextField();
        room_beds = new javax.swing.JTextField();
        room_theme = new javax.swing.JTextField();
        add_room = new javax.swing.JButton();
        hire_back = new javax.swing.JButton();
        admin_menu_logo = new javax.swing.JLabel();
        sign_up_name_label1 = new javax.swing.JLabel();
        room_type = new javax.swing.JTextField();
        sign_up_name_label2 = new javax.swing.JLabel();
        room_number = new javax.swing.JTextField();
        sign_up_bg = new javax.swing.JLabel();

        confirmation.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        confirmation.setResizable(false);
        confirmation.setSize(new java.awt.Dimension(375, 175));
        confirmation.getContentPane().setLayout(null);

        confirmation_yes.setBackground(new java.awt.Color(102, 255, 102));
        confirmation_yes.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        confirmation_yes.setForeground(new java.awt.Color(255, 255, 255));
        confirmation_yes.setText("Yes");
        confirmation_yes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirmation_yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmation_yesActionPerformed(evt);
            }
        });
        confirmation.getContentPane().add(confirmation_yes);
        confirmation_yes.setBounds(50, 80, 110, 40);

        confirmation_no.setBackground(new java.awt.Color(236, 76, 76));
        confirmation_no.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        confirmation_no.setForeground(new java.awt.Color(255, 255, 255));
        confirmation_no.setText("No");
        confirmation_no.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirmation_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmation_noActionPerformed(evt);
            }
        });
        confirmation.getContentPane().add(confirmation_no);
        confirmation_no.setBounds(210, 80, 110, 40);

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Add Room ?");
        confirmation.getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 30, 100, 22);

        sign_up_bg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/252339.png"))); // NOI18N
        sign_up_bg3.setPreferredSize(new java.awt.Dimension(750, 675));
        confirmation.getContentPane().add(sign_up_bg3);
        sign_up_bg3.setBounds(0, 0, 400, 150);

        id_exists.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        id_exists.setResizable(false);
        id_exists.setSize(new java.awt.Dimension(375, 175));
        id_exists.getContentPane().setLayout(null);

        number_exists_ok.setBackground(new java.awt.Color(236, 76, 76));
        number_exists_ok.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        number_exists_ok.setForeground(new java.awt.Color(255, 255, 255));
        number_exists_ok.setText("OK");
        number_exists_ok.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        number_exists_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_exists_okActionPerformed(evt);
            }
        });
        id_exists.getContentPane().add(number_exists_ok);
        number_exists_ok.setBounds(130, 80, 100, 40);

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Number already exists!");
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

        empty_fields_ok.setBackground(new java.awt.Color(236, 76, 76));
        empty_fields_ok.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        empty_fields_ok.setForeground(new java.awt.Color(255, 255, 255));
        empty_fields_ok.setText("OK");
        empty_fields_ok.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        empty_fields_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empty_fields_okActionPerformed(evt);
            }
        });
        empty_fields.getContentPane().add(empty_fields_ok);
        empty_fields_ok.setBounds(130, 80, 100, 40);

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 650));
        setPreferredSize(new java.awt.Dimension(750, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(750, 650));
        getContentPane().setLayout(null);

        sign_up_title.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        sign_up_title.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_title.setText("Add Room");
        getContentPane().add(sign_up_title);
        sign_up_title.setBounds(20, 30, 270, 30);
        getContentPane().add(sign_up_separator);
        sign_up_separator.setBounds(20, 70, 710, 2);

        sign_up_surname_label.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_surname_label.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_surname_label.setText("Theme :");
        getContentPane().add(sign_up_surname_label);
        sign_up_surname_label.setBounds(150, 210, 170, 20);

        sign_up_phone_label.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_phone_label.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_phone_label.setText("Number of Beds :");
        getContentPane().add(sign_up_phone_label);
        sign_up_phone_label.setBounds(50, 250, 200, 20);

        sign_up_address_label.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_address_label.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_address_label.setText("Overnight cost :");
        getContentPane().add(sign_up_address_label);
        sign_up_address_label.setBounds(50, 290, 190, 20);

        room_cost.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        getContentPane().add(room_cost);
        room_cost.setBounds(240, 290, 280, 30);

        room_beds.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        getContentPane().add(room_beds);
        room_beds.setBounds(240, 250, 280, 30);

        room_theme.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        getContentPane().add(room_theme);
        room_theme.setBounds(240, 210, 280, 30);

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
        add_room.setBounds(270, 550, 200, 40);

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
        sign_up_name_label1.setText("Type :");
        getContentPane().add(sign_up_name_label1);
        sign_up_name_label1.setBounds(160, 170, 66, 20);

        room_type.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        getContentPane().add(room_type);
        room_type.setBounds(240, 170, 280, 30);

        sign_up_name_label2.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        sign_up_name_label2.setForeground(new java.awt.Color(255, 255, 255));
        sign_up_name_label2.setText("Number :");
        getContentPane().add(sign_up_name_label2);
        sign_up_name_label2.setBounds(140, 140, 90, 20);

        room_number.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        getContentPane().add(room_number);
        room_number.setBounds(240, 130, 280, 30);

        sign_up_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triplet_Suns_Hotel/252339.png"))); // NOI18N
        sign_up_bg.setPreferredSize(new java.awt.Dimension(750, 675));
        getContentPane().add(sign_up_bg);
        sign_up_bg.setBounds(0, 0, 750, 640);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void add_roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_roomActionPerformed

        number=room_number.getText();     
        type=room_type.getText();
        theme=room_theme.getText();
        beds=room_beds.getText();
        cost=room_cost.getText();

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
    }//GEN-LAST:event_add_roomActionPerformed

    private void hire_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hire_backActionPerformed
        dispose();
        room_management emp = new room_management();
        emp.setVisible(true);
    }//GEN-LAST:event_hire_backActionPerformed

    private void confirmation_yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmation_yesActionPerformed
  
        try {
            String sql_statement="insert into Room(number,type,theme,no_of_beds,overnight_stay_cost) "
                + "values(?,?,?,?,?) ";
            PreparedStatement statement  = con.prepareStatement(sql_statement);
            
            statement.setInt(1,Integer.valueOf(number));
            statement.setString(2,type);
            statement.setString(3,theme);
            statement.setInt(4,Integer.valueOf(beds));
            statement.setInt(5,Integer.valueOf(cost));
            
            
            statement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        confirmation.dispose();
        success.setVisible(true);
        success.setLocationRelativeTo(null);
        clear_fields();
    }//GEN-LAST:event_confirmation_yesActionPerformed

    private void confirmation_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmation_noActionPerformed
        confirmation.dispose();
    }//GEN-LAST:event_confirmation_noActionPerformed

    private void number_exists_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_exists_okActionPerformed
        id_exists.dispose();
    }//GEN-LAST:event_number_exists_okActionPerformed

    private void empty_fields_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empty_fields_okActionPerformed
        empty_fields.dispose();
    }//GEN-LAST:event_empty_fields_okActionPerformed

    private void success_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_success_okActionPerformed
        success.dispose();
    }//GEN-LAST:event_success_okActionPerformed
    
    private void clear_fields(){
        for (JTextField textbox : textFields){
            textbox.setText("");
        }
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
            ResultSet rs =statement.executeQuery("select number from Room where number="+number+" ");
            while(rs.next()){
                int sql_number = rs.getInt("number");
                if(sql_number==Integer.valueOf(number))return true;
                System.out.println("smth");
            }
            
            return false;
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
    private void add_to_list(){
        textFields.add(room_type);
        textFields.add(room_theme);
        textFields.add(room_number);
        textFields.add(room_beds);
        textFields.add(room_cost);
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_room().setVisible(true);
            }
        });
    }
    
    static Connection con;
    String number="";
    String type="";
    String theme="";
    String beds="";
    String cost="";
    ArrayList<JTextField> textFields = new ArrayList<>();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_room;
    private javax.swing.JLabel admin_menu_logo;
    private javax.swing.JDialog confirmation;
    private javax.swing.JButton confirmation_no;
    private javax.swing.JButton confirmation_yes;
    private javax.swing.JDialog empty_fields;
    private javax.swing.JButton empty_fields_ok;
    private javax.swing.JButton hire_back;
    private javax.swing.JDialog id_exists;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton number_exists_ok;
    private javax.swing.JTextField room_beds;
    private javax.swing.JTextField room_cost;
    private javax.swing.JTextField room_number;
    private javax.swing.JTextField room_theme;
    private javax.swing.JTextField room_type;
    private javax.swing.JLabel sign_up_address_label;
    private javax.swing.JLabel sign_up_bg;
    private javax.swing.JLabel sign_up_bg2;
    private javax.swing.JLabel sign_up_bg3;
    private javax.swing.JLabel sign_up_bg4;
    private javax.swing.JLabel sign_up_bg5;
    private javax.swing.JLabel sign_up_name_label1;
    private javax.swing.JLabel sign_up_name_label2;
    private javax.swing.JLabel sign_up_phone_label;
    private javax.swing.JSeparator sign_up_separator;
    private javax.swing.JLabel sign_up_surname_label;
    private javax.swing.JLabel sign_up_title;
    private javax.swing.JDialog success;
    private javax.swing.JButton success_ok;
    // End of variables declaration//GEN-END:variables
}
