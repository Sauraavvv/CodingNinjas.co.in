// Given a binary number as an integer N, convert it into decimal and print.

import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int base = 1;
            int dec_value = 0;

            while(n>0){
            	int last_digit = n%10;
            	n = n/10;

            	dec_value += last_digit*base;
            	base = base*2;
            }
            System.out.print(dec_value);
        }
		

	}
}
