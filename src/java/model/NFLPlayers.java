
package model;

public class NFLPlayers {
 
    private int PLAYERID;
    private String PLAYERNAME;
    private String TEAMNAME;
    private int AGE;
    private String POSISTION;

    
     
    public NFLPlayers() {
        this.PLAYERID = 0;
        this.PLAYERNAME = "";
        this.TEAMNAME = "";
        this.AGE = 0;
        this.POSISTION = "";
    }
    
    
    public NFLPlayers(int PLAYERID, String PLAYERNAME, String TEAMNAME, int AGE, String POSISTION) {
        this.PLAYERID = PLAYERID;
        this.PLAYERNAME = PLAYERNAME;
        this.TEAMNAME = TEAMNAME;
        this.AGE = AGE;
        this.POSISTION = POSISTION;
    }

    public int getPLAYERID() {
        return PLAYERID;
    }

    public void setPLAYERID(int PLAYERID) {
        this.PLAYERID = PLAYERID;
    }

    public String getPLAYERNAME() {
        return PLAYERNAME;
    }

    public void setPLAYERNAME(String PLAYERNAME) {
        this.PLAYERNAME = PLAYERNAME;
    }

    public String getTEAMNAME() {
        return TEAMNAME;
    }

    public void setTEAMNAME(String TEAMNAME) {
        this.TEAMNAME = TEAMNAME;
    }

    public int getAGE() {
        return AGE;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }

    public String getPOSISTION() {
        return POSISTION;
    }

    public void setPOSISTION(String POSISTION) {
        this.POSISTION = POSISTION;
    }

    @Override
    public String toString() {
        return "NFLPlayers{" + "PLAYERID=" + PLAYERID + ", PLAYERNAME=" + PLAYERNAME + ", TEAMNAME=" + TEAMNAME + ", AGE=" + AGE + ", POSISTION=" + POSISTION + '}';
    }
    
    
    
    
}
