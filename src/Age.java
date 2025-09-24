/*  store user's name and age .print a greeting based on age:
<13 = "Hi kid"
13-19 = "Hello Teen"
20+ = "Welcome Adult"
 */
import java.util.Scanner;
import java.lang.*;
public class Age
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter name : ");
        String name=sc.next();

        System.out.print("enter age : ");
        int age=sc.nextInt();

        if(age < 13)
        {
            System.out.println("Hii Kids.");
        }
        else if(age <= 19)
        {
            System.out.println("Hello Teen. ");
        }
        else
        {
            System.out.println("Welcome Adult");
        }

        System.out.println("your name is " + name + " and age is " + age );
    }
}
