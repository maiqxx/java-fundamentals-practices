package searching;
/**Description:
 * All the zombies arranged in sorted manner of their power, followed by the total power of zombies.
 All the vampires arranged in sorted manner of their power, followed by the total power of vampires.
 You've to help him produce the following list to help him save his city.
 */

import java.util.Scanner;
public class Practice6 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");

        int N = scan.nextInt();
        int i, j, temp;
        int villains[] = new int[N];

        //input elements
        System.out.println("Enter the elements: ");
        for(i=0; i<N; i++)
        {
            villains[i] = scan.nextInt();
        }

        //sorting
        System.out.println();
        for(i=1; i<N; i++)
        {
            temp = villains[i];
            j = i - 1;
            while((temp < villains[j]) && (j >= 0))
            {
                villains[j+1] = villains[j];
                j = j - 1;
            }
            villains[j+1] = temp;
        }

        //prints out the sorted elements
        System.out.print("Creatures are Sorted upon their powers: \n");
        for(i=0; i<N; i++)
        {
            System.out.print(villains[i] + "  ");
        }

        int zombies = 0;
        int vampires = 0;


        for(i = 0 ; i <  N; i++)
        {
            if(villains[i] % 2 != 0)
            {
                vampires++;
            }
        }
        System.out.println("");

        for(i = 0 ; i < N ; i++)
        {
            if(villains[i] % 2 == 0)
            {
                zombies++;
            }
        }
        System.out.println();
        System.out.print("Zombies are: " + vampires + "\n");
        System.out.print("Vampires are: " + zombies + "\n");
    }
}
