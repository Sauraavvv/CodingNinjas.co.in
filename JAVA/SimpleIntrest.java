/* Take the principal amount, rate of interest, and the time period as input and calculate the Simple Interest.
Note: Print the answer as Floor integer value. */

import java.util.Scanner;

public class SimpleIntrest {

  public static void main(String args[]) {
    try (Scanner s = new Scanner(System.in)) {
      int p = s.nextInt();

      double r = s.nextDouble();

      int t = s.nextInt();

      int simple = (int) (p * r * t) / 100;

      System.out.println(simple);
    }
  }
}
