
package model;

public class NFLPlayers {
 
    private int PLAYERID;
    private string PLAYERNAME;
    private string TEAMNAME;
    private int AGE;
    private string POSISTION;

    
     
    public NFLPlayers() {
        this.PLAYERID = 0;
        this.PLAYERNAME = "";
        this.TEAMNAME = "";
        this.AGE = 0;
        this.POSISTION = "";
    }
    
    
    public NFLPlayers(int PLAYERID, string PLAYERNAME, string TEAMNAME, int AGE, string POSISTION) {
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

    public string getPLAYERNAME() {
        return PLAYERNAME;
    }

    public void setPLAYERNAME(string PLAYERNAME) {
        this.PLAYERNAME = PLAYERNAME;
    }

    public string getTEAMNAME() {
        return TEAMNAME;
    }

    public void setTEAMNAME(string TEAMNAME) {
        this.TEAMNAME = TEAMNAME;
    }

    public int getAGE() {
        return AGE;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }

    public string getPOSISTION() {
        return POSISTION;
    }

    public void setPOSISTION(string POSISTION) {
        this.POSISTION = POSISTION;
    }

    @Override
    public String toString() {
        return "NFLPlayers{" + "PLAYERID=" + PLAYERID + ", PLAYERNAME=" + PLAYERNAME + ", TEAMNAME=" + TEAMNAME + ", AGE=" + AGE + ", POSISTION=" + POSISTION + '}';
    }
    
    
    
    
}
