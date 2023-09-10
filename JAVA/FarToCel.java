/* Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W)
you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding
Celsius values and print the table. */

import java.util.Scanner;

public class FarToCel {

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
        int S = s.nextInt();
        int E = s.nextInt();
        int W = s.nextInt();
        int C;

        while (S <= E) {
          C = 5 * (S - 32) / 9;
          System.out.print(S);
          System.out.print(" ");
          System.out.println(C);
          S = S + W;
        }
    }
  }
}
