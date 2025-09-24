/*  ask user marks .if >90 -->grade A,> 75-->B,else C.
 */
import java.util.Scanner;
public class Grade
{
    public static void main(String[] args) {
        double marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks : ");
        marks=sc.nextDouble();

        if(marks >= 90)
        {
            System.out.println("your grade A,Excellant ");
        }
        else if(marks >=75)
        {
            System.out.println("your grade B,very good");
        }
        else
        {
            System.out.println("your grade C,good");
        }
    }
}
