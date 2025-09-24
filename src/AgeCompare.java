import java.util.Scanner;

public class AgeCompare
{
    public static void main(String[] args)
    {
        String name;
        int myAge ,ageOfFriend;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name : ");
        name=sc.nextLine();

        System.out.println("Enter your age : ");
        myAge=sc.nextInt();

        System.out.println("Enter your friend age : ");
        ageOfFriend=sc.nextInt();

        if(myAge > ageOfFriend)
        {
            System.out.println(" me bada hu tujhse.");
        }
        else if(myAge < ageOfFriend)
        {
            System.out.println("tu bada hai mujhse.");
        }
        else {
            System.out.println("dono ki age same hai");
        }
    }
}