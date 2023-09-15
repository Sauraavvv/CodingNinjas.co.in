/* Write a program to print triangle of user defined integers sum.
for n = 3 -->

1=1
1+2=3
1+2+3=6

*/
package Patterns;

import java.util.Scanner;

public class SumPattern {
    public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int sum = 0;

            int i = 1;
while(i<=n){
            	int j = 1;
            	while(j<=i){
            		sum = sum + i;
            		System.out.print(j);
            		if(j==i){
            			System.out.print("=");
            		}
            		else{
            			System.out.print("+");
            		}
            		j++;
            	}System.out.println();
            	i++;
            }
        }

	}
}
