package array;
//Write a Java program to test if an array contains a specific value.

public class Practice26 {
    public static boolean contains(int[] arr, int item){
        for (int n: arr){
            if (item == n){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int[] my_array1 = {
                2001, 2002, 2003, 2004, 2005,
                2006, 2007, 2008, 2009, 2010,
                2011, 2012, 2013, 2014};

        System.out.println(contains(my_array1, 2013)); //calling method inside the print statement
        System.out.println(contains(my_array1, 2015)); //calling method inside the print statement
    }
}
