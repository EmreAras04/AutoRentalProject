package com.exemple.vue;
import java.sql.*;


public class ConectDB 
{
    // Importation des bibliothèque pour DB
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public Connection ConnectDB()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/demoproject","root","");
            System.out.println("Connected to Database");
            
        }
        catch(Exception e)
        {
            // if we have an error
            e.printStackTrace();      
        }
        return null;
    }
}
