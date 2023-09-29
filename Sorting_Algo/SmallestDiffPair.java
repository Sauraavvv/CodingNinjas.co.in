/* Given two unsorted arrays of non-negative integers, 'arr1' and 'arr2' of size 'N' and 'M', respectively.
Your task is to find the pair of elements (one from each array), such that their absolute (non-negative) difference
is the smallest, and return the difference.
Example :
N = 3, arr1 = [10, 20, 30]
M = 2, arr2 = [17, 15]
The smallest difference pair is (20, 17) with an absolute difference of 3. So, the answer is 3. */

package Sorting_Algo;

public class SmallestDiffPair {
    public static int smallestDifferencePair(int []arr1, int n, int []arr2, int m) {
        int minDiff = Integer.MAX_VALUE; //Initialize the maximum integer

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int diff = Math.abs(arr1[i]-arr2[j]); // finding the difference btw elements

                if(diff<minDiff){  //comparing the diff with min-diff
                    minDiff = diff;  // Updating the mindiff with diff
                }
            }
        }
        return minDiff;
   }
}
