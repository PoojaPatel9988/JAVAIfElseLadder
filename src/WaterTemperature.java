/*  You are creating a logic system for a smart water heater. Based on outside temperature,decide the heating level:
Temperature <5`C -----> set heating to high
Temperature between 5`C to 15`C -----> set to medium
Temperature between 16`C to 25`C -----> set to low
Temperature >25`C -----> heater OFF

Input:Outside Temperature
Output:Heater Level
 */
import java.util.Scanner;
import java.lang.*;
public class WaterTemperature
{
    public static void main(String[]args)
    {
        int temperature;
        Scanner er=new Scanner(System.in);
        System.out.println("enter water heater temperature :");
        temperature=er.nextInt();

        if(temperature < 5)
        {
            System.out.print("Set heating to high.");
        }
        else if(temperature <= 15)
        {
            System.out.println("Set to medium");
        }
        else if(temperature <= 25)
        {
            System.out.println("set to low");
        }
        else
        {
            System.out.println("heater OFF");
        }
    }
}
