/* You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.
You don't need to print or return anything, just change in the input array itself. */

package Array_and_String;

public class SwapAlternate {

  public static void swapAlternate(int arr[]) {
    for (int i = 0; i < arr.length; i += 2) {
      if (i == arr.length - 1 && i % 2 == 0) {
        break;
      }
      int temp = arr[i];
      arr[i] = arr[i + 1];
      arr[i + 1] = temp;
    }
  }
}
