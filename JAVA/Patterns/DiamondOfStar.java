/* Print the following pattern for the given number of rows.
Note: N is always odd.

Pattern for N = 5
  *
 ***
*****
 ***
  *

The dots represent spaces. */

package Patterns;

import java.util.Scanner;

public class DiamondOfStar {
    public static void main(String[] args) {
        
     try (Scanner s = new Scanner(System.in)) {
        int N = s.nextInt();
        int n1 = (N + 1) / 2;
        int n2 = n1 - 1;

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n1 - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n2; i>0; i--){
            for(int j = 1; j<= n2-i+1; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
}
