// Program: TestDogs.java -> p.143
// Author: Chase Stephenson
// Date Written: 9/4/2026

public class TestDogs
{
    public static void main(String[] args)
    {
        //Decloared objects -- Using zero as number of events shows infinity average, 
        //                     the book says it should show NaN (Not a Number). 
        //                     If the letter O is used, the program will not run.
        DogTriathlonParticipant dog1 = new DogTriathlonParticipant( "Bowser", 2, 85, 89, 0);
        dog1.display();
        DogTriathlonParticipant dog2 = new DogTriathlonParticipant( "Rush", 3, 78, 72, 80);
        dog2.display();
        DogTriathlonParticipant dog3 = new DogTriathlonParticipant( "Ginger", 3, 90, 86, 72);
        dog3.display();

        //Extra display of dog1 to verify the cumulative outcome does not change
        //dog1.display();
        
    }    
}
