/* Write a program to input an integer 'n' and print the sum of all its even digits and the sum of all its odd digits separately.
Digits mean numbers, not places! That is, if the given integer is "132456", 
even digits are 2, 4, and 6, and odd digits are 1, 3, and 5. */

import java.util.Scanner;

public class SumOfEvenOddDigit {
    public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int even_sum = 0;  // initialize even sum as 0
            int odd_sum = 0;  // initialize odd sum as 0
            int digit;

            for(int i=n; i>0; i=i/10){      // divide by 10 will give last number of the input number asfter
            	digit = i%10;               // modulous of i will give the remainder of the input number and store it in a var-digit
            	if(digit%2==0){             // After that we will check whether the ndigit is odd or even. 
            		even_sum = even_sum + digit;
            	}                           // If the digit is even the we will add that digit in the previously initialize even sum.
            	else{
            		odd_sum = odd_sum + digit;
            	}
            }

            System.out.print(even_sum);
            System.out.print(" ");
            System.out.println(odd_sum);
        }
		
}
}
