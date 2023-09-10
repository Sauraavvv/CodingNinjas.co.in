/* Write a program that takes a number as input and prints all its factors except 1 and the number itself.
If the number has only two factors (1 and the number itself), then the program should print -1. */

import java.util.Scanner;

public class Factors {

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {

      int n = s.nextInt();
      int factorCount = 0;   // initially the factor was 0

      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          factorCount++;
          System.out.print(i + " ");
        }
      }

      if (factorCount == 0) {
        System.out.println("-1");
      }
    }
  }
}
