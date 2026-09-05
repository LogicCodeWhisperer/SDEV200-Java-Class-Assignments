// Program: DogTriathlonParticipant.java -> p.143
// Author: Chase Stephenson
// Date Written: 9/4/2026

public class DogTriathlonParticipant 
{
    //Declared fields
    
    //Field is not static to allow different number for each dog
    private final int NUM_EVENTS;
    
    //Field is not final to allow value increase as each dog participates
    //However, field is static because at any moment, it is the same for all participants
    private static int totalCumulativeScore = 0;  //Without static, total score is the same as 
                                                  //cumulative score for each participant display
    
    private String name;
    private int obedienceScore;
    private int conformationScore;
    private int agilityScore;
    private int total;
    private double avg;

    //Constructor with five parameters
    public DogTriathlonParticipant(String name, int numEvents, int score1, 
                                   int score2, int score3)
    {
        //Parameter Assignments
        this.name = name;
        NUM_EVENTS = numEvents;
        obedienceScore = score1;
        conformationScore = score2;
        agilityScore = score3;

        //Calculations
        total = obedienceScore + conformationScore + agilityScore;
        avg = (double) total / NUM_EVENTS;
        totalCumulativeScore = totalCumulativeScore + total;
    }

    //Method for display()
    public void display()
    {
        //NUM_EVENTS = 4; //added to show error for non-changable constant

        System.out.println(name + " participated in " + NUM_EVENTS + 
                           " events and has an average score of " + avg);
        System.out.println(" " + name + " has a total score of " + total +
                           " bringing the total cumulative score to " + 
                           totalCumulativeScore);
    }
}
