/* Print the following pattern for the given N number of rows.

4444
4444
4444
4444     */

package Patterns;

import java.util.Scanner;

public class SquarePattern {

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
        int n = s.nextInt();
        int i = 1;

        while (i <= n) {
          int j = 1;
          while (j <= n) {
            System.out.print(n);
            j++;
          }
          System.out.println();
          i++;
        }
    }
  }
}
