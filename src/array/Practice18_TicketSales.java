package array;
/**Description:
 * The senior class was selling tickets to their play. They had two prices, 5 and 8. The tickets were on sale during the week before
 the play. On Monday, they sold 23 tickets at 5 and 14 at 8. Tuesday, they sold 31 tickets at 5 and 22 at 8. Wednesday sales
 were 46 at 5 and 28 at 8. Thursday sales were 39 at 5 and 32 at 8. Friday, including sales at the door, they sold 22 at 5 and 56
 at 8. How much money did they take in ticket sales?
 */

import java.util.Scanner;
public class Practice18_TicketSales {
    public static void main(String args[]){
        int days = 5, price = 2;
        int i, j, sum = 0;


        Scanner sc = new Scanner(System.in);

        int ticket[][] = {{23, 14},
                {31, 22},
                {46, 28},
                {39, 32},
                {22, 56}};

        char price1 = 'J';
        char price2 = 'S';

        System.out.println("Ticket Price1 for Junior Students: 5.00" + "\n" +
                "Ticket Price2 for Senior Students: 8.00" + "\n");
        int x = 1;
        for( i=0; i < days; i++){
            for( j=0; j < price; j++){
                ticket[i][j] = x++;
            }
        }
        for( i=0; i < days; ++i){

            for( j=0; j < price; ++j){
                sum = sum + ticket[j][i];

            }
            System.out.println("Tickets with Price " + (i+1) + " = " + sum);   //prints out the sum of each row

        }
    }
}
