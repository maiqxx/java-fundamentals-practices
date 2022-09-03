package intro;

public class Practice43 {
    public static void main(String args[]){
        String str = "Jam@C.";
        String arrOfStr[] = str.split("@", 2);

        for(String a : arrOfStr)
            System.out.println(a);
    }
}
