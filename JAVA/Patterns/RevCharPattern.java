/* Print the following pattern for the given N number of rows.
Pattern for N = 5
E
ED
EDC
EDCB
EDCBA  */

package Patterns;
import java.util.Scanner;

public class RevCharPattern {

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      int n = s.nextInt();
      int i = 1;

      while (i <= n) {
        int j = 1;
        char StartingChar = (char) ('A' + n - 1);
        while (j <= i) {
          System.out.print(StartingChar);
          StartingChar = (char) (StartingChar - 1);
          j++;
        }
        System.out.println();
        i++;
      }
    }
  }
}
