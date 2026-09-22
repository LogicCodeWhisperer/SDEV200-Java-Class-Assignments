// Program: TestTeam.java -> p.157
// Author: Chase Stephenson
// Date Written: 9/12/2026

import java.util.Scanner;
public class TestTeam
{
    public static void main(String[] args)
    {
        Team teamObject1 = new Team(); //Creates object for team 1
        Team teamObject2 = new Team(); //Creates object for team 2
        Team teamObject3 = new Team(); //Creates object for team 3

        teamObject1 = setTeamData(teamObject1); //Object to hold team 1 data
        teamObject2 = setTeamData(teamObject2); //Object to hold team 2 data
        teamObject3 = setTeamData(teamObject3); //Object to hold team 3 data

        //Loop to eliminate repetitive output statements set to a max of 3 starting from 1
        for(int count = 1; count <= 3; count++)
        {
            System.out.println();
            System.out.print("High school sports team " + count + " data: \n" +
                             "Motto: " + Team.getMotto() + "\n");
                            
            if(count == 1)       
            {                    //Output to display team 1 data
                System.out.print("School Name: " + teamObject1.getSchool() + "\n" +  
                                 "Sport: " + teamObject1.getSport() + "\n" +
                                 "Team Name: " + teamObject1.getTeamName() + "\n");
            }
            else if(count == 2)  
            {                    //Output to display team 2 data
                System.out.print("School Name: " + teamObject2.getSchool() + "\n" + 
                                 "Sport: " + teamObject2.getSport() + "\n" +
                                 "Team Name: " + teamObject2.getTeamName() + "\n");
            }
            else                 //Output to display team 3 data
                System.out.print("School Name: " + teamObject3.getSchool() + "\n" +  
                                 "Sport: " + teamObject3.getSport() + "\n" +
                                 "Team Name: " + teamObject3.getTeamName() + "\n");
        } 
    }//End of public static void main(String[] args)

    public static Team setTeamData(Team data)
    {
        //Declarations
        String school, sport, teamName;
        Scanner input = new Scanner(System.in);              //To read user input

        System.out.print("Enter the name of the school: ");  //Promts user to input school name
        school = input.nextLine();                           //school holds user input
        System.out.print("Enter the name of the sport: ");   //Promts user to input sport name
        sport = input.nextLine();                            //sport holds user input
        System.out.print("Enter the name of the team: ");    //Promts user to input team name
        teamName = input.nextLine();                         //teamName holds user input
        System.out.println();                                //inserts space for readability

        //Sets data to individual fields for the Team class
        data.setSchool(school);
        data.setSport(sport);
        data.setTeamName(teamName);

        //input.close();
        return data;    //returns set data to Team class
    }//End of public static Team setTeamData(Team data)
}//End of public class TestTeam
