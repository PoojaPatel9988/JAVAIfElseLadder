//WAP to find grade by grade average.input:percentage,output:show grade

import java.util.Scanner;
public class FindGrade
{
    public static void main(String[]args)
    {
        double average;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter average : ");
        average=sc.nextDouble();

        if(average >= 80)
        {
            System.out.println("your grade is A , excellent.");
        }
        else if(average >= 60)
        {
            System.out.println("your grade is B , very good.");
        }
        else if(average >= 50)
        {
            System.out.println("your grade is C , Good.");
        }
        else if(average >= 33)
        {
            System.out.println("your grade is D , bad.");
        }
        else if( average < 33)
        {
            System.out.println("fail");
        }
        else
        {
            System.out.println("invalid number");
        }
    }
}
