package intro;
/**Description:
 * MyJava Café wants you to write a program to take orders from the Internet. Your program asks for
 the item, its price, and if overnight shipping is wanted. Regular shipping for items under 10 is 2.00; for
 items 10 or more shipping is 3.00. For overnight delivery add 5.00. Provide an invoice as summary of
 purchase.
 */

import java.util.Scanner;
public class Practice37 {
    public static void main (String args[]){

        //Scanner to get input from user
        Scanner input = new Scanner(System.in);

        //declaring variables
        double price = 0.0, shipping = 0.0, total = 0.0;
        int overnightDelivery = 0, stop = 1;


        while(stop != -1){
            // prompt for user input
            System.out.println("Enter the name of your item: ");
            String item = input.nextLine();  //stores user's input

            // prompt user for price
            System.out.println("Enter the price: ");
            price = input.nextInt();  // stores price

            // prompt user for overnight delivery choice
            System.out.println("Overnight delivery (0 = No, 1 =Yes)?: ");
            int choice = input.nextInt();  // enter 0 or 1


            // if it is an overnight delivery...
            if(overnightDelivery == 1){
                if(price < 10){
                    shipping = 2.00 + 5.00;
                }else{
                    shipping = 3.00 + 5.00;
                }
            }

            // if it is a regular delivery
            if (overnightDelivery == 0){
                if(price < 10){
                    shipping = 2.00;
                }else{
                    shipping = 3.00;
                }
                // print all the results
                System.out.println("===============================================");
                System.out.println("Invoice: ");
                System.out.printf("%-23s %15.2f\n",  item , price);
                System.out.printf("shipping %30.2f\n", shipping);
                total = price + shipping;
                System.out.printf("total %33.2f\n", total);
                total = 0.0;

                System.out.println("===============================================");
                //if user wants to add another item
                System.out.println("More item? Press -1 to stop, other to continue: ");
                stop = input.nextInt();
                System.out.println();
            }

        }
    }
}
