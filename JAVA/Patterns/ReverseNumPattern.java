/* Print the following pattern for the given N number of rows.
Pattern for N = 4
1
21
321
4321 */

package Patterns;
import java.util.Scanner;

public class ReverseNumPattern {

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      int n = s.nextInt();
      int i = 1;

      while (i <= n) {
        int j = 1;
        while (j <= i) {
          System.out.print(i - j + 1);
          j++;
        }
        System.out.println();
        i++;
      }
    }
  }
}
