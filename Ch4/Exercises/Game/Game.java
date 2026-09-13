// Program: Game.java -> p.157
// Author: Chase Stephenson
// Date Written: 9/12/2026

public class Game 
{
    private String school, sport, gameTime;

    //Constructor with parameters
    public Game(String HS, String SP, String GT)
    {
        school = HS;
        sport = SP;
        gameTime = GT;
    }
 
    //Constructor with defualt parameters for testing
    public Game()
    {
        //Default parameters for testing
        this("Clover Valley", "Base Ball", "6:00 PM");
    }

    //Recieves details.setSchool(school) as schoolName and stores in school
    public void setSchool(String schoolName)
    {
        school = schoolName;
    }

    //Recieves details.setsportName(sportName) as sportName and stores in sport
    public void setSportName(String sportName)
    {
        sport = sportName;
    }

    //Recieves details.setGameTime(gameTime) as gameStart and stores in gameTime 
    public void setGameTime(String gameStart)
    {
        gameTime = gameStart;
    }

    //returns stored school name
    public String getSchool()
    {   
        return school;
    }

    //returns stored team name
    public String getSportName()
    {   
        return sport;
    }

    //returns stored game start time
    public String getGameTime()
    {
        return gameTime;
    }
}
