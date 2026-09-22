// Program: TestGame.java -> p.157
// Author: Chase Stephenson
// Date Written: 9/12/2026

import java.util.Scanner;
public class TestGame 
{
    public static void main(String[] args)
    {
        boolean equalInfo = false; 
        char choice;                           //"commented out until options are done in while loop else statement, may be put into a separate method"
        String retrySchool;                    //"                                                                                                    "
        Scanner input = new Scanner(System.in);                         //To read user input
        Game gameTeam1 = new Game(); //Creates object for Team 1
        Game gameTeam2 = new Game(); //Creates object for Team 2

        gameTeam1 = gameData(gameTeam1);
        gameTeam2 = gameData(gameTeam2);

        
        while(equalInfo == false)
        {
            if(gameTeam1.getSportName().equalsIgnoreCase(gameTeam2.getSportName()) && 
               gameTeam1.getGameTime().equalsIgnoreCase(gameTeam2.getGameTime()))
            {
                System.out.print("\n" + gameTeam1.getSchool() + " and " +  gameTeam2.getSchool() +
                             "\nboth have a " + gameTeam1.getSportName() + " game at " +
                             gameTeam1.getGameTime() + "\n" + "\n" + "Program closing.");
                
                equalInfo = true;
            }
            else
            {   
                System.out.print("The teams play two different sports or the game times do not match.\n" + 
                                 "Whould you like to reenter information for a team? (y/n): ");
                choice = input.nextLine().charAt(0);                                         //reads the whole line, but only takes the first character 
                
                if (choice == 'y' || choice =='Y')
                {
                    System.out.print("\nWhich team?");
                    System.out.printf("\n" +
                                      "School Name: " + gameTeam1.getSchool() + "\n" +  
                                      "Sport: " + gameTeam1.getSportName() + "\n" +
                                      "Team Name: " + gameTeam1.getGameTime() + "\n" +
                                      "\n" +
                                      "School Name: " + gameTeam2.getSchool() + "\n" +  
                                      "Sport: " + gameTeam2.getSportName() + "\n" +
                                      "Team Name: " + gameTeam2.getGameTime() + "\n" + "\n");

                    System.out.print("Enter school name: ");
                    retrySchool = input.nextLine(); 
                    
                    //If statement to check which team 
                    if(gameTeam1.getSchool().equalsIgnoreCase(retrySchool))
                    {
                        gameTeam1 = gameRetry(gameTeam1);
                    }
                    else if(gameTeam2.getSchool().equalsIgnoreCase(retrySchool))
                    {
                        gameTeam2 = gameRetry(gameTeam2);
                    }
                    else
                        System.out.println("Somthing went wrong!");
                }
                else 
                    break;                                                                    // breaks out of blue while loop curly brace
            } 
        } 
    }

    public static Game gameData(Game details)
    {
        //Declarations
        String school, sportName, gameTime;
        Scanner input = new Scanner(System.in);                         //To read user input

        System.out.print("Enter the school name: ");                    //Promts user to input school name
        school = input.nextLine();                                      //school holds user input
        System.out.print("Enter the sport name: ");                     //Promts user to input sport name
        sportName = input.nextLine();                                   //sportName holds user input
        System.out.print("Enter the game start time (Ex: 6:00 PM): ");  //Promts user to input game start time
        gameTime = input.nextLine();                                    //gameTime holds user input
        System.out.println();                                           //Inserts space for readability

        details.setSchool(school);
        details.setSportName(sportName);
        details.setGameTime(gameTime);

        return details;
    }

    public static Game gameRetry(Game details)
    {
        //Declarations
        String sportName, gameTime;
        Scanner input = new Scanner(System.in);                         //To read user input

        System.out.print("Reenter sport name: ");                       //Promts user to input new sport name
        sportName = input.nextLine();                                   //sportName holds user input
        System.out.print("Reenter game start time (Ex: 6:00 PM): ");    //Promts user to input new game start time
        gameTime = input.nextLine();                                    //gameTime holds user input
        System.out.println();                                           //Inserts space for readability

        
        details.setSportName(sportName);
        details.setGameTime(gameTime);

        return details;
    }


}
