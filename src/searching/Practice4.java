package searching;

public class Practice4 {
    public static void main(String args[]){
        int array[] = {50, 15, 25, 42, 55, 28, 74, 65}; //values inside an array
        int size = array.length;  //length of an array or a number of elements stored in an array
        int value = 65;  //value to be searched

        for (int i = 0; i < size; i++){
            if(array[i] == value){
                //if found
                System.out.println("Element found at index: " + i);
            } else {
                //if not found
                System.out.println("Element not found.");
            }
        }
    }
}
