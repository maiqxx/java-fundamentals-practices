package array;

public class Practice30 {
    public static void main (String args[]){
        String[] strArr = new String[10];
        for(int i = strArr.length - 1; i >+ 0; i--){
            strArr[i] = "b" + (i - 1);
        }
        System.out.println("Value: " + strArr[5]);
    }
}
