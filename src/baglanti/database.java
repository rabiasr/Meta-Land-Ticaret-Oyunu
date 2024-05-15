package baglanti;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
  
public class database {
    Connection c=null;
    
    public database() {
    }
    
    public Connection dbcon() {
        try {
            this.c=DriverManager.getConnection("jdbc:mysql://localhost:3306/METALAND?user=root&password=1234");
            return c;  
        
        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex); 
        }
        return c;
        
    }
}
