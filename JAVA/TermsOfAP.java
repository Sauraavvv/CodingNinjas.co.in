/* Write a program to print first x terms of the series 3N + 2 which are not multiples of 4. */

import java.util.Scanner;

public class TermsOfAP {
   public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
            int x = s.nextInt();
            int i = 1;
            int n = 1;
            
            while(n<=x && n<=1000){
            	int sum = ((3*i)+2);
            	if(sum%4!=0){
            		System.out.print(sum+" ");
            		n++;
            	}i++; 
            }
        }

	} 
}
