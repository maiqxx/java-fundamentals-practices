package array;
//printing distinct numbers in java from StackOverflow

import java.util.*;
public class Practice24 {
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);

        int[] num = new int[10];
        boolean[] distinct = new boolean[10];

        System.out.println("Enter ten numbers: ");
        for(int i = 0; i < num.length; i++)
        {
            System.out.println("Number " + (i + 1) + ": ");
            num[i] = s.nextInt();
            distinct[i] = true;
            for(int j = 0; j < 10; j++)
            {
                if (num[i] == num[j] && (i != j))
                {
                    distinct[i] = false;
                }
            }
        }

        int count = 0;
        for (int j = 0; j < 10; j++)
        {
            if(distinct[j]){
                num[count] = num[j];
                count++;
            }
        }

        System.out.println("The distinct number is: " + num[count]);
        System.out.println("The distinct numbers are: " + num[count]);

    }
}
