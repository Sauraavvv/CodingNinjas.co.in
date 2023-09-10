/* Print the following pattern for the given N number of rows.
Pattern for N = 4
*
**
***
****  */

package Patterns;
import java.util.Scanner;

public class TriStarPattern {

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      int n = s.nextInt();
      int i = 1;

      while (i <= n) {
        int j = 1;
        while (j <= i) {
          System.out.print("*");
          j++;
        }
        System.out.println();
        i++;
      }
    }
  }
}
