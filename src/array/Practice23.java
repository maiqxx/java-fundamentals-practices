package array;
//Write a Java program to find the duplicate values of an array of integer values.

import java.util.*;
public class Practice23 {
    static Scanner s = new Scanner(System.in);
    public static void main(String args[]){

        int A[] = new int[]{34, 12, 56, 78, 90, 12, 78};

        for(int i = 0; i < A.length - 1; i++)
        {
            for(int j = i + 1; j < A.length; j++){
                if((A[i]) == A[j]){
                    System.out.println("Duplicate element: " + A[j]);
                }
            }
        }

    }
}
