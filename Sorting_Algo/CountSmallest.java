/* You are given two arrays of integers. Let's call the first array A and the second array B.
A finds the number of elements in array B that are smaller than or equal to that element for every array element. */

package Sorting_Algo;
public class CountSmallest {
    public static int[] countS(int n, int m, int[] a, int[] b) {
        int [] output = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (a[i] >= b[j]) {
                    count++;
                }
            }
            output[i]=count;
        }
        return output;
    }
}
