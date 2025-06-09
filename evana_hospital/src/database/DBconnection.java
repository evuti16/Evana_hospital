/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.*;
/**
 *
 * @author tsion
 */
public class DBconnection {
    private static DBconnection dbconnection;
    
    private final Connection connection;
    
    private DBconnection() throws ClassNotFoundException, SQLException  
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/evana_hospital","root","tsionsql");
    }
    public static DBconnection getInstance() throws ClassNotFoundException, SQLException{
        if(dbconnection==null){
            dbconnection= new DBconnection();
        }
        return dbconnection;
    }
    public Connection getConnection(){
        return connection;
    }
}
