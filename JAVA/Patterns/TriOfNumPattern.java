/* Print the following pattern for the given number of rows.
Pattern for N = 4

...1
..232
.34543
4567654
Dot represent blank spaces.

*/
package Patterns;

import java.util.Scanner;

public class TriOfNumPattern {

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      int n = s.nextInt();
      int i = 1;
      while(i<=n){
        int j = 1;
        while(j<=n-i){
          System.out.print(" ");
          j++;
        }
        int q = i;
        j = 1;
        while(j<=i){
          System.out.print(q);
          q++;
          j++;
        }
        int k = q - 2;
        while(k>=i){
          System.out.print(k);
          k--;
        }
        System.out.println();
        i++;
      }
      
    }
  }
}
