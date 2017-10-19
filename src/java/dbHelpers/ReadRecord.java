
package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.NFLPlayers;

public class ReadRecord {
    
    private Connection conn;
    private ResultSet results;
    
    private NFLPlayers Player = new NFLPlayers();
    private int PLAYERID;
    
    public ReadRecord (int PLAYERID) {

Properties props = new Properties(); //MWC
    InputStream instr = getClass().getResourceAsStream("dbConn.properties");
       try {
           props.load(instr);
       } catch (IOException ex) {
           Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
       }
       try {
           instr.close();
       } catch (IOException ex) {
           Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
    
    this.PLAYERID = PLAYERID;
    
       try {
           Class.forName(driver);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
       }
       try {
           conn = DriverManager.getConnection(url, username, passwd);
       } catch (SQLException ex) {
           Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
       }

}
    
    
    public void doRead() throws SQLException {
    
        PreparedStatement ps = null;
        try {
            //set up string to hold our query
            String query = "SELECT * FROM NFLPlayers WHERE PLAYERID = ?";
            //create a preparedstatement using our query string
            ps = conn.prepareStatement(query);
            //fill in the preparedstatement
            ps.setInt(1, PLAYERID);
            //execute the query
            this.results = ps.executeQuery();
            this.results.next();
            Player.setPLAYERID(this.results.getInt("PLAYERID"));
            Player.setPLAYERNAME(this.results.getString("PLAYERNAME"));
            Player.setTEAMNAME(this.results.getString("TEAMNAME"));
            Player.setAGE(this.results.getInt("AGE"));
            Player.setPOSISTION(this.results.getString("POSISTION"));
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ps.close();
        }
}
    
    public NFLPlayers getPlayer(){
        
        return this.Player;
    }
    
}
