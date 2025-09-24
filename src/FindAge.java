import java.util.Scanner;
public class FindAge
{
    public static void main(String[]args)
    {
        int age;
        Scanner ae=new Scanner(System.in);
        System.out.print("Enter your age : ");
        age=ae.nextInt();

        if(age <= 18)
        {
            System.out.println("you are children");
        }
        else if(age <=45)
        {
            System.out.println("yor are younger");
        }
        else
        {
            System.out.println("you are older");
        }
    }
}
