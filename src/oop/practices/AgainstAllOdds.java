
package oop.practices;

import java.util.Scanner;

public class AgainstAllOdds {
    
     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        
	    while(i > 0) {
			if ((i % 2) != 0) {
				System.out.println(i);
                
			}
            i--;
    }
     }

    
}
