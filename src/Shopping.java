/*  A customer is shopping on your e-commerce website. Based on their total amount,apply the following discounts:
5000 or more ---->25% discount
3000-4999 ------->20% discount
1500-2999 ------->10% discount
Below 1500 ------> no discount

Write a java program that takes the total bill amount and displays the discount and the final amount after discount.
 */
import java.util.Scanner;
import java.lang.*;
public class Shopping
{
    public static void main(String[]args)
    {
        String productName;
        double price;
        int quantity;

        Scanner hii=new Scanner(System.in);
        System.out.print("Enter your product name: ");
        productName=hii.next();
        System.out.print("Enter your price : ");
        price=hii.nextDouble();
        System.out.print("Enter your Quantity :");
        quantity=hii.nextInt();

        double totalBill = price * quantity;
        System.out.println("your total bill is : " + totalBill);

        if(totalBill >= 5000)
        {
            double discount = totalBill * 25 / 100;
            System.out.println("your 25% discount is : " + discount);
            double finalBill = totalBill - discount;
            System.out.println("your net bill is : " + finalBill);
        }
        else if(totalBill >= 3000)
        {
            double discount = totalBill * 20 / 100;
            System.out.println("your 20% discount is : " + discount);
            double finalBill = totalBill - discount;
            System.out.println("your net bill is : " + finalBill);
        }
        else if(totalBill >= 1500)
        {
            double discount = totalBill * 10 / 100;
            System.out.println("your 10% discount is : " + discount);
            double finalBill = totalBill - discount;
            System.out.println("your net bill is : " + finalBill);
        }
        else if( totalBill < 1500)
        {
            System.out.println("NO discount");
        }
        else
        {
            System.out.println("thank you");
        }
    }
}
