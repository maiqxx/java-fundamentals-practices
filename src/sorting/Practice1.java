package sorting;
/**
 * Bubble Sort
*/

import java.util.Arrays;
public class Practice1 {
    public static void main(String args[]){

        //testing our bubble sort method in Java
        int[] unsorted = {5, 4, 3, 2, 1};
        bubbleSort(unsorted);
    }

    public static void bubbleSort(int[] unsorted){
        System.out.println("original array : " + Arrays.toString(unsorted));

        // Outer loop - need n-1 iteration to sort n elements
        for(int i=0; i<unsorted.length -1; i++){

            //Inner loop to perform the comparison and swapping between adjacent numbers
            //After each iteration one index from last is sorted
            for(int j= 1; j<unsorted.length -i-1; j++){

                //If the current number is greater than swap those two
                if(unsorted[j-1] > unsorted[j]){
                    int temp = unsorted[j];
                    unsorted[j] = unsorted[j-1];
                    unsorted[j-1] = temp;
                }
            }
            System.out.printf("unsorted array after %d pass %s: %n", i+1, Arrays.toString(unsorted));
        }
    }
}

