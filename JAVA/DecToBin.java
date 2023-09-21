// Given a decimal number (integer N), convert it into binary and print.

import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            long pv = 1;
            long sum = 0;
            while(n!=0){
            	int last_digit = n%2;
            	n = n/2;

            	sum += last_digit*pv;
            	pv = (long)pv*10;
            }
            System.out.print(sum);
        }


	}
}
