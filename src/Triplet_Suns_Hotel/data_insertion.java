package Triplet_Suns_Hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class data_insertion {
    
    static String     driverClassName = "" ;
    static String     url = "" ;
    static Connection dbConnection = null;
    static String     username = "";        //fill the strings with the prefered
    static String     passwd = "";          //respective JDBC values
    static Statement  statement       = null;
    
    public static void main(String args[])throws Exception{
        
        dbConnection = DriverManager.getConnection (url, username, passwd);
        statement    = dbConnection.createStatement();
        
       //admin
        statement.executeUpdate("insert into Users(username,password,type) "
                + "values('gbarkos','passwd','admin') ");
        
        //Rooms
        statement.executeUpdate("insert into Room(number,type,theme,no_of_beds,overnight_stay_cost) "
                + "values(101,'normal','Wild West',2,80) ");
        
        statement.executeUpdate("insert into Room(number,type,theme,no_of_beds,overnight_stay_cost) "
                + "values(102,'normal','Wild West',3,120) ");
        
        statement.executeUpdate("insert into Room(number,type,theme,no_of_beds,overnight_stay_cost) "
                + "values(103,'normal','Wild West',4,160) ");
        
        statement.executeUpdate("insert into Room(number,type,theme,no_of_beds,overnight_stay_cost) "
                + "values(201,'normal','Ancient Greece',2,80) ");
        
        statement.executeUpdate("insert into Room(number,type,theme,no_of_beds,overnight_stay_cost) "
                + "values(202,'normal','Ancient Greece',3,120) ");
        
        statement.executeUpdate("insert into Room(number,type,theme,no_of_beds,overnight_stay_cost) "
                + "values(203,'normal','Ancient Greece',4,160) ");
        
        statement.executeUpdate("insert into Room(number,type,theme,no_of_beds,overnight_stay_cost) "
                + "values(301,'normal','Ancient Egypt',2,80) ");
        
        statement.executeUpdate("insert into Room(number,type,theme,no_of_beds,overnight_stay_cost) "
                + "values(302,'normal','Ancient Egypt',3,120) ");
        
        statement.executeUpdate("insert into Room(number,type,theme,no_of_beds,overnight_stay_cost) "
                + "values(303,'normal','Ancient Egypt',4,160) ");
        
        statement.executeUpdate("insert into Room(number,type,theme,no_of_beds,overnight_stay_cost) "
                + "values(401,'normal','Ancient China',2,80) ");
        
        statement.executeUpdate("insert into Room(number,type,theme,no_of_beds,overnight_stay_cost) "
                + "values(402,'normal','Ancient China',3,120) ");
        
        statement.executeUpdate("insert into Room(number,type,theme,no_of_beds,overnight_stay_cost) "
                + "values(403,'normal','Ancient China',4,160) ");
        
        statement.executeUpdate("insert into Room(number,type,theme,no_of_beds,overnight_stay_cost) "
                + "values(501,'suite','Roman Palace',4,220) ");
        
        statement.executeUpdate("insert into Room(number,type,theme,no_of_beds,overnight_stay_cost) "
                + "values(502,'suite','Roman Palace',4,220) ");
        
        statement.executeUpdate("insert into Room(number,type,theme,no_of_beds,overnight_stay_cost) "
                + "values(503,'suite','Roman Palace',4,220) ");
        
        //Employees
        statement.executeUpdate("insert into Employee(id,name,surname,date_of_birth,gender,address,phone_number,post,salary,years_of_service) "
                + "values('AA123456','Nicholas','Dowd','1990-10-05','Male','9 Arrowhead Road','1234567890','bartender',850,2)");
        
        statement.executeUpdate("insert into Employee(id,name,surname,date_of_birth,gender,address,phone_number,post,salary,years_of_service) "
                + "values('AB123456','Nathan','Forsyth','1989-06-04','Male','8026 Wellington St.','2345678901','waiter',850,3)");
        
        statement.executeUpdate("insert into Employee(id,name,surname,date_of_birth,gender,address,phone_number,post,salary,years_of_service) "
                + "values('AC123456','Samantha','Ball','1995-07-14','Female','119 Cardinal Drive','3456789012','waiter',850,1)");
         
        statement.executeUpdate("insert into Employee(id,name,surname,date_of_birth,gender,address,phone_number,post,salary,years_of_service) "
                + "values('AD123456','Rebecca','Kelly','1987-12-26','Female','9581 Lyme Drive','4567890123','receptionist',990,5)");
         
        statement.executeUpdate("insert into Employee(id,name,surname,date_of_birth,gender,address,phone_number,post,salary,years_of_service) "
                + "values('AE123456','Justin','Morrison','1984-02-02','Male','9422 Creek St.','5678901234','receptionist',990,7)");
         
        statement.executeUpdate("insert into Employee(id,name,surname,date_of_birth,gender,address,phone_number,post,salary,years_of_service) "
                + "values('AL123456','Richard','Hughes','1979-03-22','Male','7087 Poor House Street','6789012345','security guard',875,4)");
         
        statement.executeUpdate("insert into Employee(id,name,surname,date_of_birth,gender,address,phone_number,post,salary,years_of_service) "
                + "values('AF123456','Cameron','Roberts','1974-01-06','Male','7962 6th St.','7890123456','security guard',875,8)");
         
        statement.executeUpdate("insert into Employee(id,name,surname,date_of_birth,gender,address,phone_number,post,salary,years_of_service) "
                + "values('AG123456','Penelope','Bower','1969-11-05','Female','7643 Laurel Ave.','8901234567','maid',705,3)");
         
        statement.executeUpdate("insert into Employee(id,name,surname,date_of_birth,gender,address,phone_number,post,salary,years_of_service) "
                + "values('AH123456','Sue','Gray','1973-12-09','Female','9207 Inverness Drive','9012345678','maid',705,2)");
         
        statement.executeUpdate("insert into Employee(id,name,surname,date_of_birth,gender,address,phone_number,post,salary,years_of_service) "
                + "values('AI123456','Trevor','Welch','1989-06-29','Male','77 South Jackson St.','0123456789','chef',1000,3)");
         
        statement.executeUpdate("insert into Employee(id,name,surname,date_of_birth,gender,address,phone_number,post,salary,years_of_service) "
                + "values('AK123456','Han','Robertson','1981-05-24','Male','78 South Martins St.','0123456709','chef',1000,2)");
        
        statement.executeUpdate("insert into Employee(id,name,surname,date_of_birth,gender,address,phone_number,post,salary,years_of_service) "
                + "values('AJ123456','Luke','Hamilton','1982-08-17','Male','125 Purple Finch Street','0123456780','porter',785,5)");
         
    }
}
