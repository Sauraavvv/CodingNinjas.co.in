/* Print the following pattern for the given N number of rows.

Pattern for N = 4
4444
333
22
1      */

package Patterns;
import java.util.Scanner;
public class InvertedTriPattern {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int i = 1;

            while(i<=n){
                int j = 1;
                while(j<=n-i-1){
                    System.out.print(n-i+1);
                    j++;
                }System.out.println();
                i++;
            }
        }
    }
}
