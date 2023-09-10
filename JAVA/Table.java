// Write a program to print multiplication table of n

import java.util.Scanner;

public class Table {

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      int n = s.nextInt();

      for (int i = 1; i <= 10; i++) {
        System.out.println(n * i);
      }
    }
  }
}
