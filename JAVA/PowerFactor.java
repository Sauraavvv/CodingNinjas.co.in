/* Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
Note : For this question, you can assume that 0 raised to the power of 0 is 1 */

import java.util.Scanner;

public class PowerFactor {

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      int x = s.nextInt();
      int n = s.nextInt();

      System.out.println((int) Math.pow(x, n));
    }
  }
}
