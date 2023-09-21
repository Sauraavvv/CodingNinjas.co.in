/* Ninja was playing with her sister to solve a puzzle pattern.
However, even after taking several hours, they could not solve the problem.
A value of N is given to them, and they are asked to solve the problem.
Since they are stuck for a while, they ask you to solve the problem. Can you help solve this problem?

output sample: 2, 3, 2
result -->

***
 **     
  *

**
 * 

 */

package Test;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
            int n1 = s.nextInt();
            int k = 1;
            while(k<=n1){
            	int n = s.nextInt();
            
            int i = 1;
            while (i <= n) {
            	int j = 1;
            	while (j <= i - 1) {
            		System.out.print(" ");
            		j++;
            	}
            	j = 1;
            	while (j <= n-i+1) {
            		System.out.print("*");
            		j++;
            	}
            	System.out.println();
            	i++;
            }k++;
}
        }
}
}
