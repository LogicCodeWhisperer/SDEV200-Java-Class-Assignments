// Program: BolingTeamDemo.java -> p.281
// Author: Chase Stephenson
// Date Written: 9/13/2026

import java.util.*;
public class BolingTeamDemo 
{
    public static void main(String[] args)
    {
        String name;                              //Holds user input
        BowlingTeam bowlTeam = new BowlingTeam(); //Creates bowling object
        int i;                                    //Used for loop index
        final int NUM_TEAM_MEMBERS = 4;           //constant to represent number of members on team
        Scanner input = new Scanner(System.in);   //Scanner object for user input

        System.out.print("Enter team name: ");    //Prompts user to enter team name 
        name = input.nextLine();                  //Sets user input equal to name
        bowlTeam.setTeamName(name);               //Assigns name to BowlingTeam object
        
        for(i = 0; i <  NUM_TEAM_MEMBERS; ++i)
        {
            System.out.print("Enter team Member's name: "); //Prompts user to enter team member's name
            name = input.nextLine();                        //Sets user input equal to name
            bowlTeam.setMember(i, name);                    //Assigns name to BowlingTeam object, the index indicates team members position in the array
        }

        System.out.println("\nMembers of team " + bowlTeam.getTeamName());//Output displays members of bowlTeam teamName
        for(i = 0; i < NUM_TEAM_MEMBERS; ++i)                             //Loop to print all team member names
            System.out.print(bowlTeam.getMember(i) + " " );               //Gets team member accociated with index and displays their name
        System.out.println();                                             //Adds empty line for spacing
    }
}
