// Given a number N, print sum of all even numbers from 1 to N.

import java.util.Scanner;

public class SumTillEnd {

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      int n = s.nextInt();

      int sum = 0;
      for (int i = 1; i <= n; i++) {
        if ((i % 2) == 0) {
          sum = sum + i;
        }
      }
      System.out.println(sum);
    }
  }
}
