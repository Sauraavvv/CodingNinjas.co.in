/* Write a program to print the pattern for the given N number of rows.
For N = 4 -->

1357
3571
5713
7135

*/

package Patterns;

import java.util.Scanner;

public class OddSquarePattern {
    public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int i = 1;
            while (i <= n) {
            	int valueToPrint = (2 * i) - 1;
            	int maxValue = (2 * n) - 1;
            	int j = 1;
            	while (j <= n) {
            		System.out.print(valueToPrint);
            		valueToPrint = valueToPrint + 2;
            		if (valueToPrint > maxValue) {
            			valueToPrint = 1;
            		}
            		j++;

            	}
            	System.out.println();
            	i++;
            }
        }
	}
}
