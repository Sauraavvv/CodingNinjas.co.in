/* You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list. */

package Array_and_String;
public class IntersectionOfArray {
    public static int findUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
          int count = 0;
          for (int j = 0; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
              count++;
            }
          }
            if (count == 1) {
              return arr[i];
            }
          }return -1;
        }
}
