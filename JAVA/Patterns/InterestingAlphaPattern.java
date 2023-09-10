/* Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE */

package Patterns;
import java.util.Scanner;

public class InterestingAlphaPattern {

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      int n = s.nextInt();
      int i = 1;

      while (i <= n) {
        int j = 1;
        char StartChar = (char) ('A' + n - 1);

        while (j <= i) {
          System.out.print((char) (StartChar - i + j));
          j++;
        }
        System.out.println();
        i++;
      }
    }
  }
}
