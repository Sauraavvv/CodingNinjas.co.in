/* Write a program to print N number of rows for Half Diamond pattern using stars and numbers
for n = 3 -->

*
*1*
*121*
*12321*
*121*
*1*
*
              */
package Patterns;

import java.util.Scanner;

public class HalfDiamondPattern {

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      int n = s.nextInt();
      System.out.println("*");

      int i = 1;
      while (i <= n) {
        System.out.print("*");
        int j = 1;
        while (j <= i) {
          System.out.print(j);
          j++;
        }
        j = j - 2;
        while (j >= 1) {
          System.out.print(j);
          j--;
        }
        System.out.print("*");
        System.out.println();
        i++;
      }
      i = 1;
      while (i <= n - 1) {
        System.out.print("*");
        int j = 1;
        while (j <= n - i) {
          System.out.print(j);
          j++;
        }
        j = j - 2;
        while (j >= 1) {
          System.out.print(j);
          j--;
        }
        System.out.print("*");
        System.out.println();
        i++;
      }
    }
    System.out.println("*");
  }
}
