// Write a code which takes two integers "F1" and "F2" as inputs and print their product .

import java.util.Scanner;

public class MultiplyingTwoNumber {
    public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)) {
            int F1 = s.nextInt();
            int F2 = s.nextInt();

            long product = (long)F1*F2;
            System.out.println(product);
        }

	}
}
