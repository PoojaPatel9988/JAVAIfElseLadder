/* traffic signal light color */


import java.util.Scanner;
public class TrafficSignal
{
    public static void main(String[]args)
    {
        String color;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your color :");
        color =sc.nextLine();

        if(color.equals("red"))
        {
            System.out.println("STOP");
        }
        else if(color.equals("yellow"))
        {
            System.out.print("WAIT");
        }
        else if(color.equals("green"))
        {
            System.out.println("RUNNING");
        }
        else
        {
            System.out.println("INVALID COLOR");
        }
    }

}