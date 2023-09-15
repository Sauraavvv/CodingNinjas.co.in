/* Write a program to print parallelogram pattern for the given N number of rows.
for n = 3 -->

***
 ***
  ***     
  
*/

package Patterns;

import java.util.Scanner;

public class ParllelogramPattern {

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      int n = s.nextInt();

      int i = 1;
      while (i <= n) {
        int j = 1;
        while (j <= i - 1) {
          System.out.print(" ");
          j++;
        }
        j = 1;
        while (j <= n) {
          System.out.print("*");
          j++;
        }
        System.out.println();
        i++;
      }
    }
  }
}
