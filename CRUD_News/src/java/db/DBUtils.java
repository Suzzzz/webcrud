/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Thang
 */
public class DBUtils {
    public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException{
        PreparedStatement ps =  null;
        //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Class.forName("com.mysql.jdbc.Driver");  
        //String url = "jdbc:sqlserver://localhost:1433;databaseName=CRUD_News";
        //String user = "sa";
        //String pass = "123456789";
        
        //Connection con = DriverManager.getConnection(url, user, pass);
        Connection con = null;
        try{
        con=DriverManager.getConnection("jdbc:mysql://localhost/crud_news","root",null);  
        }
        catch(SQLException e){
            System.out.println(e);
        }
        
        ps = con.prepareStatement(sql);
        
       
        return ps;
    }
    
    //Check connections.
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        getPreparedStatement("select * form News");
//    }
}
