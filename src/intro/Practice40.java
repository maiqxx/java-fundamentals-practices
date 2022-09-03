package intro;

import java.util.Scanner;
public class Practice40 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int i,n,number,pos;

        System.out.println("Enter the number of elements:") ;
        n = sc.nextInt();
        int[] a = new int[n+1];

        System.out.println("Enter the elements") ;
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the number which you want to insert");
        number = sc.nextInt();

        System.out.println("Enter the position where you want to insert the number");
        pos = sc.nextInt();

        for(i=n-1;i>=pos;i--)
        {
            a[i+1]=a[i];
        }
        n=n+1;
        a[pos]=number;

        System.out.println("\nOn inserting new array we get is\n");
        for(i=0;i<n;i++)
        {
            System.out.println("a["+i+"] = "+a[i]);
        }
    }
}
