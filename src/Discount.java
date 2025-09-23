/* take price(double) and quantity (int) of product (school bag) from the user and total bill.
after finding total bill check for discount eligibility if (total bill) is greater than 3000 custumer will get 15% discount,
or else he will not get any discount .
if true: price = total bill
         discount = ? (calculated)
         net bill = total bill - discount
if false: sorry, try next time
 */
import java.util.Scanner;
public class Discount
{
    public static void main(String[]args)
    {
        double price;
        int quantity;

        Scanner sc=new Scanner(System.in);
        System.out.println("agar app ka total bill 3000 se jada hai to aap ko 15% ka discount milaga hamari taraf se verna no discount. ");
        System.out.print("enter price on school bags:");
        price =sc.nextDouble();

        System.out.print("enter quantity buy on school bags:");
        quantity =sc.nextInt();

        double totalBill = price * quantity;
        System.out.println("your Total bill is : " + totalBill);

        if(totalBill >= 3000)
        {
            double discount = totalBill * 15 / 100;
            System.out.println("your 15% discount is :" + discount);
            double netBill = totalBill - discount;
            System.out.println("your net bill is : " + netBill);
        }
        else {
            System.out.println("Sorry! your no discount ,try next time.");
        }

    }
}