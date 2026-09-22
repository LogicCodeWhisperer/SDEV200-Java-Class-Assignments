// Program: PreschoolStudent.java -> p.190-192
// Author: Chase Stephenson
// Date Written: 9/6/2026

public class PreschoolStudent 
{
    //Declarations
    int idNum, age;
    public final int HIGH_ID = 9999, HIGH_AGE = 6;

    //Constructors
    
    public PreschoolStudent(int num, int studentAge)
    {
        setIdNum(num);
        setAge(studentAge);
    }
    //Method to set student ID number
    public void setIdNum(int num)
    {
        if(num <= HIGH_ID)
            idNum = num;
        else
            idNum = 0;
    }
    //Method to set student age
    public void setAge(int studentAge)
    {
        if(studentAge <= HIGH_AGE)
            age = studentAge;
        else
            age = 0;
    }

    //Method to get student ID number
    public int getIdNum()
    {
        return idNum;
    }

    //Method to get student age
    public int getAge()
    {
        return age;
    }
}
