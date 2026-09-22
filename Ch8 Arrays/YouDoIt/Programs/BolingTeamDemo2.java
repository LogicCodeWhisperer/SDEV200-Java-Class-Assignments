// Program: BolingTeamDemo2.java -> p.282-283
// Author: Chase Stephenson
// Date Written: 9/13/2026

import java.util.*;
public class BolingTeamDemo2 
{
    public static void main(String[] args)
    {
        String name;                                      //Holds user input
        final int NUM_TEAMS = 4;                          //Constant to hold number of BowlingTeam objects 
        BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS]; //Declares an array of 4 BowlingTeam objects
        int i;                                            //Used as loop index for team member names
        int y;                                            //Used as loop index for team names
        final int NUM_TEAM_MEMBERS = 4;                   //Constant to represent number of members on team
        Scanner input = new Scanner(System.in);           //Scanner object for user input

        for(y = 0; y < NUM_TEAMS; ++y)            
        {
            teams[y] = new BowlingTeam();             //Allocates memory for each array element
            System.out.print("Enter team name: ");    //Prompts user to enter team name 
            name = input.nextLine();                  //Sets user input equal to name
            teams[y].setTeamName(name);               //Assigns name to BowlingTeam object
            for(i = 0; i <  NUM_TEAM_MEMBERS; ++i)
            {
                System.out.print("Enter team Member's name: "); //Prompts user to enter team member's name
                name = input.nextLine();                        //Sets user input equal to name
                teams[y].setMember(i, name);                    //Assigns name to BowlingTeam object, the index indicates team members position in the array
            }
        }

        for(y = 0; y < NUM_TEAMS; ++y)
        {
            System.out.println("\nMembers of team " + teams[y].getTeamName()); //Output displays members of bowlTeam teamName
            for(i = 0; i < NUM_TEAM_MEMBERS; ++i)                              //Loop to print all team member names
            System.out.print(teams[y].getMember(i) + " " );                    //Gets team member accociated with index and displays their name
            System.out.println();                                              //Adds empty line for spacing
        }

        input.close();
    }
}
