/* Sort the given unsorted array 'arr' of size 'N' in non-decreasing order using the selection sort algorithm.

Input:
N = 5
arr = {8, 6, 2, 5, 1}

Output:
1 2 5 6 8   */  
 
package Sorting_Algo;
public class SelectionSort {

  public static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) { // one loop for traveling the array
      int min = arr[i]; // initialize the minimum value at i index.
      int minIndex = i; // initialize the minimum index.
      for (int j = i + 1; j < arr.length; j++) {  // second loop for comparing the element.
        if (arr[j] < min) {  
          min = arr[j]; // if the new element is minimum than the min value then we update the min with the new element
          minIndex = j; // also we update the min index as we have to swap the elements.
        }
      }
      arr[minIndex] = arr[i];
      arr[i] = min;
    }
  }
}
