/* You are given S, a sequence of n integers i.e. S = s1, s2, ..., sn.
Compute if it is possible to split S into two parts : s1, s2, ..., si and si+1, si+2, ….., sn (0 <= i <= n) in such a 
way that the first part is strictly decreasing while the second is strictly increasing one. */

import java.util.Scanner;

public class CheckNumSeq {
    public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int pre = s.nextInt();  // Previous number.
            boolean seq_valid = true;  // Sequence is valid.
            boolean is_increasing = false;  // Sequence is increasing.

            int i = 1;
            while(i<=n-1){
            	int curr = s.nextInt();  // Current number.
            	int diff = curr - pre;   

            	if(diff==0){
            		seq_valid = false;
            	}
            	else if(diff>0){
            		is_increasing = true;
            	}
            	else if(diff<0){
            		if(is_increasing == true){
            			seq_valid = false;
            		}
            	}pre = curr;  // Assigning new values to current and previous.
            	i++;
            }
            System.out.println(seq_valid);
        }
		}
}
