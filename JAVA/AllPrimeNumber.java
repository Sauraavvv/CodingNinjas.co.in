/* Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
Print the prime numbers in different lines. */

import java.util.Scanner;

public class AllPrimeNumber {
    public static void main(String[] args) {

		try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();

            for (int i = 2; i <=n; i++) {
            	boolean isprime = true;
            	for (int j = 2; j < i; j++) {
            		if (i % j == 0) {
            			isprime = false;
            			break;
            		}
            	}
            	if(isprime){
            		System.out.println(i);
            	}
            }
        }

	}
}
