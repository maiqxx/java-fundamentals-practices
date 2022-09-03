package array;
//Write a Java program to remove a specific element from an array.

import java.util.Arrays;
public class Practice28 {
    public static void main(String args[]){
        int[] my_array = {25, 14, 56, 15, 36,  56, 77, 18, 29, 49};

        System.out.println("Origianl array: " + Arrays.toString(my_array));

        //removing an element element(index->1, value->) of the array
        int removedIndex = 1;
        int i = 0;
        for(i = removedIndex; i < my_array.length -1; i++){
            my_array[i] = my_array[i + 1];
        }
        //System.out.println("Removed element: " + );
        System.out.println("After removing the element: " + Arrays.toString(my_array));
    }
}
