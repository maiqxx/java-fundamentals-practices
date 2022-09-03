package intro;

public class Practice44 {
    public static void main(String args[]){
        int sum = 0;

        for(int number = 2; number <= 100; number += 2){
            sum += number;
        }
        System.out.println("Sum is " + sum);
    }
}
