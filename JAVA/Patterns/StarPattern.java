package Patterns;

import java.util.Scanner;

public class StarPattern {
		 public static void main(String args[]) 
  {
      try (Scanner s = new Scanner(System.in)) {
        int n = s.nextInt();
 
          //Outer Loop for number of Rows
          for(int i=0;i<n;i++)
          {
        	  // loop for printing Spaces -->
              for(int k=i;k<n-1;k++){
              System.out.print(" ");
        	  }
              // We run loop till j = 2*i to print odd no. of stars.
              for(int j=0;j<=2*i;j++)
              {
                // We print '*' for each row.
                System.out.print("*");
              }System.out.println();
          }
    }
  }
	}

