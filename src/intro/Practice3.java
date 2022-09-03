package intro;

public class Practice3 {
    public static void main(String[] args){

        float firstNum = 1.20f, secNum = 2.45f;

        System.out.println("Enter firstNumber = " + firstNum);
        System.out.println("Enter secondNumber = " + secNum);

        float temp = firstNum;  //firstNum assigned to temp
        firstNum = secNum;  //secNum assigned to firstNum
        secNum = temp;  //temp assigned to secNnum

        System.out.println("After swapping, firstNumber = " + firstNum);
        System.out.println("After swapping, secondNumber = " + secNum);
    }
}
