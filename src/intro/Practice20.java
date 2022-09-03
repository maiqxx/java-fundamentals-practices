package intro;

import java.util.Scanner;
public class Practice20 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //A. Print square star pattern
        int side, i = 1, j;
        sc = new Scanner(System.in);
        System.out.print("Enter the number of your desired pattern:");
        side=sc.nextInt();

        while(i<=side) //condition
        {
            j=1;   //initializing variable for inner
            while (j<=side)
            {
                System.out.print("*"); //Print square star pattern
                j++;
            }
            i++;
            System.out.print("\n"); //prints new line
        }
        System.out.println(); //another new line

        /*
           B.
            *
            **
            ***
            ****
            *****
         */
        int row=5;

        for(i=0 ; i<row ; i++)  //outer loop
        {
            for(j=0 ; j<=i ; j++)  //inner loop
            {
                System.out.print("*");  //prints triangle star pattern

            }

            System.out.print("\n");  //prints new line
        }
        System.out.println();  //another new line


        /*C.
            01010
            01010
            01010
            01010
            01010
        */

        for(i=1 ; i<=row ; i++)  //outer loop
        {
            int num;
            if(i%2==0)  //condition
            {
                num=0;

                for(j=1 ; j<=row ; j++)  //inner loop: if number is divisble by 2
                {
                    System.out.print(num);  //prints binary pattern
                    num=(num==0)?1:0;
                }

            }
            else  //otherwise this loop will execute for inner loop
            {
                num=1;
                for(j=1 ; j<=row ; j++)
                {
                    System.out.print(num);  //prints binary pattern
                    num=(num==0)?1:0;
                }
            }
            System.out.print("\n");  //prints new line
        }
        System.out.println(); //another new line


        /*D.
         * * * * *
         * * * *
         * * *
         * *
         *

         */

        for(i=row-1 ; i>0; i--)  //descending order of outer loop
        {
            for(j=0 ; j<=i ; j++)  //ascending order of outer loop
            {
                System.out.print("*" +"");  //prints pattern

            }

            System.out.print("\n");  //prints new line
        }
        System.out.println();  //another new line

    }
}
