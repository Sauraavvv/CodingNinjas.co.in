// Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.
/* Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list. */

package Array_and_String;

public class ReturnArraySum {

  public static int sum(int[] arr) {
    int n = arr.length;
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum = sum + arr[i];
    }
    return sum;
  }
}
