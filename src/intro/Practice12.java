package intro;
/**
 Write a program that breaks down an ISBN entered by the
user.
 */

import java.util.Scanner;
public class Practice12 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int gs1_prefix, group_id, pub_code, item_num;
        int check_digit;

        gs1_prefix = sc.nextInt();
        System.out.println("GS1 prefix: " + gs1_prefix);
        group_id = sc.nextInt();
        System.out.println("Group identifier: " + group_id);
        pub_code = sc.nextInt();
        System.out.println("Publisher code: " + pub_code);
        item_num = sc.nextInt();
        System.out.println("Item number: " + item_num);
        check_digit = sc.nextInt();
        System.out.println("Check digit: " + check_digit);

        System.out.println("ISBN: " + gs1_prefix + "-" + group_id + "-" + pub_code + "-" + item_num + "-" + check_digit);
    }
}
