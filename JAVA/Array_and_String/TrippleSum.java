/* You have been given a random integer array/list(ARR) and a number X.
Find and return the number of triplets in the array/list which sum to X. */

package Array_and_String;
public class TrippleSum {
    public static int findTriplet(int[] arr, int x) {
    	int ans = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == x){
                        ans++;
                    }
                }
            }
        }return ans;
    }
}
