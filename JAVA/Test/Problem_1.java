/* Print the following pattern for given number of rows.
for n = 5
 5432*
 543*1
 54*21
 5*321
 *4321   */

package Test;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int i = 1;
            while (i <= n) {
            	int j = n;
            	while (j >= 1) {
            		if (j != i) {
            			System.out.print(j);
            		} else {
            			System.out.print("*");
            			}
            		j--;
            	}
            	System.out.println();
            	i++;
            }
        }

	}
}
