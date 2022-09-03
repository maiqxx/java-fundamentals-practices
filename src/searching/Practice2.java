package searching;

public class Practice2 {
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4, 5};

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                System.out.println("Found at index: " + i);
            }
        }
    }
}
