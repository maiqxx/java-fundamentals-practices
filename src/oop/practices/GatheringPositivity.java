
package oop.practices;

import java.util.Scanner;

public class GatheringPositivity {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int sum = 0;
    int number = 0;

    do {
      
      number = input.nextInt();
      if(number < 0){
          
          continue;
      }
      
      //else if(number == 0){
          //break;
      //}
      number++;
      sum += number;
      
    } while(number >= 0); 
	   
       System.out.println("Sum = " + sum);
  }
}
    
