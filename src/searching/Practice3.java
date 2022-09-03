package searching;

import java.util.Scanner;
public class Practice3 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to search: ");
        int num = in.nextInt();

        int value = 0;
        int arr[] = {10, 13, 25, 42, 50, 28, 72, 63};

        //Searching num using loop
        for (int i = 0; i < arr.length; i++)
        {
            if (num == arr[i])
            {
                value = i;
                break;
            }
        }
        if (value == 0)
        {
            System.out.println(num + " is not found.");
        }
        else
            System.out.println(num + " is found at the index " + value);
    }
}
