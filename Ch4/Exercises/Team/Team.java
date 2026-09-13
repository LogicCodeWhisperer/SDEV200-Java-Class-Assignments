// Program: Team.java -> p.157
// Author: Chase Stephenson
// Date Written: 9/12/2026

public class Team 
{
    //Declarations
    private String school, sport, team;
    public final static String MOTTO = "Sportsmanship!";

    //Constructor with parameters
    public Team(String HS, String SP, String TN)
    {
        school = HS;
        sport = SP;
        team = TN;
    }

    public Team()
    {
        //Default parameters for testing
        this("Clover Valley", "Base Ball", "Emerald");
    }

    public void setSchool(String schoolName)
    {
        school = schoolName;
    }

    public void setSport(String sportName)
    {
        sport = sportName;
    }

    public void setTeamName(String teamName)
    {
        team = teamName;
    }

    public String getSchool()
    {   
        return school;
    }

    public String getSport()
    {   
        return sport;
    }

    public String getTeamName()
    {
        return team;
    }

    public static String getMotto()
    {
        return MOTTO;
    }
}

