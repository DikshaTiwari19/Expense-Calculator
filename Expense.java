/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expense;
import java.sql.*;
/**
 *
 * @author diksh
 */
public class Expense {
 
 static final String DB_URL="jdbc:mysql://localhost:3306/mit_pune";
 static final String USER="root";
 static final String PASS="";
  public static Connection connectDB(){
      Connection conn=null;
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          conn=DriverManager.getConnection(DB_URL,USER,PASS);
          System.out.println("Connection Established");
      }
      catch(Exception e){
          System.out.println("There were errors while connecting to db");
          e.printStackTrace();
          
      }
     return conn;
     
  }
    /**
     * @param args the command line arguments
     */
    
    
}
