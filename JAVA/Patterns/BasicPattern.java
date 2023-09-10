/* Print the following pattern for the given N number of rows.
      
####
####
#### 

For pattern problems 3 things are required 
1--> How many rows (n from user),
2--> How many column (ith row or n input),
3--> What to print */

package Patterns;

import java.util.Scanner;

public class BasicPattern {

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      int n = s.nextInt();
      int i = 1;
      while (i <= n) {
        int j = 1;
        while (j <= n) {
          System.out.print("#");
          j++;
        }
        System.out.println();
        i++;
      }
    }
  }
}
