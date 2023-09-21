/* Given a number N, find its square root. You need to find and print only the integral part of square root of N.
For eg. if number given is 18, answer is 4 */

import java.util.Scanner;

public class SquareRoot {
   public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int sqr = 0;

            for(int i=1; i<n; i++){
            	if(i*i>n){
            		sqr=i-1;
            		break;
            }
            	}System.out.println(sqr);
        }
		

	} 
}
