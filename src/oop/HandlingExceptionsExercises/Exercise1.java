/*Exercise 1:

Runtime errors

This program generates runtime errors because there are two
test expression which confused the program. The variables i and j was declared inside
the loop. It should declare as local variables, otherwise the variables
in the last statement will be out of scope.

The output of the program after making some correction:

0 + 0 = 0
1 + 1 = 2
2 + 2 = 4
3 + 3 = 6
4 + 4 = 8
5 + 5 = 10
6 + 6 = 12
7 + 7 = 14
8 + 8 = 16
9 + 9 = 18
I’ve printed out the sums of i and j up to 10,10

*/


package oop.HandlingExceptionsExercises;

public class Exercise1 {
    public static void main(String[] args) {

        int i, j;
        for (i = 0, j = 0; j < 10; i++, j++) {
            System.out.println(i + " + " + j + " = " + (i+j));
        }
        System.out.println("I’ve printed out the sums of i and j up to "
                + i + "," + j);
    }

}

