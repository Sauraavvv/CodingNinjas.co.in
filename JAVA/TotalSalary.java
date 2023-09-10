/* Write a program to calculate the total salary of a person.
The user has to enter the basic salary (an integer) and the grade (an uppercase character),
and depending upon which the total salary is calculated as -

  totalSalary = basic + hra + da + allow – pf 
where
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic */

import java.util.Scanner;

public class TotalSalary {
     public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {

            int bs=s.nextInt();   // Taking basic salary from user.
            String str=s.next();
            char c=str.charAt(0);
            int all; // Allowance

            // Using ASCII values
            if(c==65)
            {
            	all=1700;
            }
            else if(c==66)
            {
            	all=1500;
            }
            else
            {
            	all=1300;
            }

            double ts=((bs+(0.20*bs)+(0.50*bs)+all)-(0.11*bs)); // Total Salary
            double p=Math.round(ts);  // Round off function
            int h=(int)(p);    // Type casting
            
            System.out.println(h);
        }
	}
}
