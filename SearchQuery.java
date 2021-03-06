
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


public class SearchQuery {
    
    private Connection conn;
    private ResultSet results;
    
    public SearchQuery() {
    
        Properties props = new Properties(); //MWC
    InputStream instr = getClass().getResourceAsStream("dbConn.properties");
       try {
           props.load(instr);
       } catch (IOException ex) {
           Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
       }
       try {
           instr.close();
       } catch (IOException ex) {
           Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
       try {
           Class.forName(driver);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
       }
       try {
           conn = DriverManager.getConnection(url, username, passwd);
       } catch (SQLException ex) {
           Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    
    }
    
    
public void doSearch(String PLAYERNAME){
        
        try {
            String query = "SELECT * FROM NFLPlayers WHERE UPPER(PLAYERNAME) LIKE ? ORDER BY PLAYERNAME ASC";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, "%" + PLAYERNAME.toUpperCase() + "%");
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}


 public String getHTMLtable() throws SQLException{
   
       String table = "";
       table += "<table border=1>";
      
       while(this.results.next()){
           
         NFLPlayers nflplayer = new NFLPlayers();
         nflplayer.setPLAYERID(this.results.getInt("PLAYERID"));
         nflplayer.setPLAYERNAME(this.results.getString("PLAYERNAME"));
         nflplayer.setTEAMNAME(this.results.getString("TEAMNAME"));
         nflplayer.setAGE(this.results.getInt("AGE"));
         nflplayer.setPOSISTION(this.results.getString("POSISTION"));
      
         table += "<tr>";
            table += "<td>";
                    table += nflplayer.getPLAYERID();
            table += "</td>";
            
            table += "<td>";
                    table += nflplayer.getPLAYERNAME();
            table += "</td>";
            
            table += "<td>";
                    table += nflplayer.getTEAMNAME();
            table += "</td>";
            
            table += "<td>";
                    table += nflplayer.getAGE();
            table += "</td>";
            
            table += "<td>";
                    table += nflplayer.getPOSISTION();
            table += "</td>";
            
            table += "<td>";
            table += "<a href=update?PLAYERID=" + nflplayer.getPLAYERID() + "> Update </a>" + "<a href=delete?PLAYERID="+ nflplayer.getPLAYERID()+ "> Delete </a>";
            table += "</td>";        
          
        
         table += "</tr>";
       }
      
      
       
       table += "</table>";
       
               return table;        
       
   }

    public String getHTMLTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
   
    
    
    
    
}
