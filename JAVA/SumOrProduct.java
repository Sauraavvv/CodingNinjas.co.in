/* Write a program that asks the user for a number N and a choice C.
And then give them the possibility to choose between computing the sum and computing the
product of all integers in the range 1 to N (both inclusive).

If C is equal to -

 1, then print the sum
 2, then print the product
 Any other number, then print '-1' (without the quotes) */

import java.util.Scanner;

public class SumOrProduct {

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
        int n = s.nextInt();
        int c = s.nextInt();

        int sum = 0;
        int product = 1;

        if (c == 1) {
          for (int i = 1; i <= n; i++) {
            sum = sum + i;
          }
          System.out.println(sum);
        } else if (c == 2) {
          for (int i = 1; i <= n; i++) {
            product = product * i;
          }
          System.out.println(product);
        }else{
            System.out.println("-1");
        }
    }
  }
}
