/* You are given two numbers, ‘X’ and ‘Y’. Your task is to find the greatest common divisor of the given two numbers.
The Greatest Common Divisor of any two integers is the largest number that divides both integers. */

package Test;

import java.util.Scanner;

public class Problem_3 {
   public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            // int ans = 1;
            int k = 1;
            while (k <= n) {
            	int x = s.nextInt();
            	int y = s.nextInt();

            int i = x%y;
            while(i!=0){
            	x=y;
            	y=i;
            	i=x%y;
            }System.out.println(y);
            	k++;
            }
        }
	} 
}
