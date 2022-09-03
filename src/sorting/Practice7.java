package sorting;

public class Practice7 {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            //shift until you find the position to place the element 'key'
            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            //place element 'key' in the correct position in the sorted part of the array
            arr[j+1] = key;
        }
    }
}
