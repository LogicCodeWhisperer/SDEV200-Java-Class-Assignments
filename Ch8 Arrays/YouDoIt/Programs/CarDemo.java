// Program: CarDemo.java -> p.316
// Author: Chase Stephenson
// Date Written: 9/16/2026

public class CarDemo 
{
    public static void main(String[] args)
    {
        Car firstCar = new Car(2021, Model.MINIVAN, Color.BLUE);     //Car object details
        Car secondCar = new Car(2024, Model.CONVERTIBLE, Color.RED); //Car object details
        firstCar.display();   //Displays data for first car
        secondCar.display();  //Displays data for second car
    }
}
