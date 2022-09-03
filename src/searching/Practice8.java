package searching;

public class Practice8 {
    public static void main(String args[])
    {
        int array[] = {10, 13, 25, 42, 50, 50, 20, 72, 63};
        int size = array.length;
        int value = 50;

        for (int i = 0; i < size; i++){
            if (array[i] == value){
                System.out.println(value + " is found at index: " + i);
            }
        }

    }
}
