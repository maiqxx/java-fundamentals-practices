package searching;

public class Practice1_FindingIndex {
    public static void main(String[] args) {

        int array[] = {10, 13, 25, 42, 50, 28, 72, 63}; //data inside an array
        int size = array.length;  //length of an array or a number of elements stored in an array
        int value = 50;  //the value to be searched

        for (int i = 0; i < size; i++){
            if (array[i] == value){
                System.out.println(value + " is found at index: " + i); //displays result
            }
        }
    }
}
