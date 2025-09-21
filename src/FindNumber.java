//  WAP to detect if the number is positive,negative,zero.

import java.util.Scanner;
public class FindNumber
{
    public static void main(String[]args)
    {
        int number;

        Scanner sc=new Scanner(System.in);
        System.out.print("enter number : ");
        number=sc.nextInt();

        if(number > 0)
        {
            System.out.println("number is positive");
        }
        else if(number == 0)
        {
            System.out.println("number is zero");
        }
        else if(number < 0)
        {
            System.out.println("number is negative");
        }
        else
        {
            System.out.println("Invalid number");
        }
    }
}

