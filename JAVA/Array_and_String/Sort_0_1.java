/* You have been given an integer array/list(ARR) of size N that contains only
integers, 0 and 1. Write a function to sort this array/list. Think of a solution which
scans the array/list only once and don't require use of an extra array/list. */

package Array_and_String;
public class Sort_0_1 {
    public static void sortZeroesAndOne(int[] arr) {
    	int nextzero = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                int temp = arr[nextzero];
                arr[nextzero] = arr[i];
                arr[i] = temp;
                nextzero++;
            }
        }
    }
}
