/* Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
Note : If a number has trailing zeros, then its reverse will not include them.
For e.g., reverse of 10400 will be 401 instead of 00401. */

import java.util.Scanner;

public class RevOfNumber {
    public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int reverse = 0;
            while (n != 0) {
            	int remainder = n % 10;
            	reverse = reverse * 10 + remainder;
            	n = n / 10;
            }
            System.out.print(reverse);
        }
	}
}
