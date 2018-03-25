package Triplet_Suns_Hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class table_creation {
    
    static String     driverClassName = "" ;
    static String     url = "" ;
    static Connection dbConnection = null;      //fill the strings with the prefered
    static String     username = "";            //respective JDBC values
    static String     passwd = "";
    static Statement  statement       = null;
    
    public static void main(String args[])throws Exception{
                 
        dbConnection = DriverManager.getConnection (url, username, passwd);
        statement    = dbConnection.createStatement();
        String sql_statement="";
        
        try{
            
            //statement.executeUpdate("drop table Reservation ");
            System.out.println("Reservation droped successfully");
           // statement.executeUpdate("drop table Guest ");
            System.out.println("Guest droped successfully");
           // statement.executeUpdate("drop table Room ");
            System.out.println("Room droped successfully");
           // statement.executeUpdate("drop table Users ");
            System.out.println("Users droped successfully");
           // statement.executeUpdate("drop table Employee ");
            System.out.println("Employee droped successfully");
            System.out.println("\n");

            sql_statement="create table Users (" +
                          "username varchar(15) not null primary key , " +
                          "password varchar(30) not null , " +
                          "name varchar(30), " +
                          "surname varchar(30), " +
                          "date_of_birth date, " +
                          "gender varchar(6), " +
                          "address varchar(50), " +
                          "phone_number varchar(10), "+
                          "type varchar(5) not null )";

            statement.executeUpdate(sql_statement);
            System.out.println("Table Users created successfully");

            sql_statement="create table Employee (" +
                          "id varchar(8) not null primary key , " +
                          "name varchar(30), " +
                          "surname varchar(30), " +
                          "date_of_birth date, " +
                          "gender varchar(6), " +
                          "address varchar(50), " +
                          "phone_number varchar(10), " +
                          "post varchar(20), " +
                          "salary double, " +
                          "years_of_service integer )" ;

            statement.executeUpdate(sql_statement);
            System.out.println("Table Employee created successfully");

            sql_statement="create table Room (" +
                          "number integer not null primary key , " +
                          "type varchar(30), " +
                          "theme varchar(30), " +
                          "no_of_beds integer, " +
                          "overnight_stay_cost integer )";

            statement.executeUpdate(sql_statement);
            System.out.println("Table Room created successfully");
            
             sql_statement="create table Guest (" +
                          "id varchar(8) not null primary key , " +
                          "username varchar(15) , " +
                          "foreign key(username) references Users(username) on delete cascade , " +
                          "name varchar(30), " +
                          "surname varchar(30), " +
                          "date_of_birth date, " +
                          "gender varchar(6), " +
                          "address varchar(50), " +
                          "phone_number varchar(10) ) " ;

            statement.executeUpdate(sql_statement);
            System.out.println("Table Guest created successfully");
            
            sql_statement="create table Reservation (" +
                          "reservation_id varchar(30) not null, " +
                          "guest_id varchar(8) not null, " +
                           "foreign key(guest_id) references Guest(id) on delete cascade, " +
                          "room_number integer not null, " +
                          "foreign key(room_number) references Room(number) on delete cascade, " +
                          "check_in_date date not null, " +
                          "check_out_date date not null, " +
                          "reservation_date timestamp not null, " +
                          "final_cost double, " +
                          "primary key (reservation_id) )" ;

            statement.executeUpdate(sql_statement);
            System.out.println("Table Reservation created successfully");
            
           
            
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        
        statement.close();
        dbConnection.close();
    }   
    
}
