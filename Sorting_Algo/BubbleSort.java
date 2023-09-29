//You are given an integer array 'arr' of size 'N'.
//You must sort this array using 'Bubble Sort'.

package Sorting_Algo;
public class BubbleSort {
    public static void bubbleSort(int[] arr, int n) {
        for(int i=0; i<arr.length-1; i++){  // for traveling accross the array.
            for(int j=0; j<arr.length-1; j++){  // for comparing the elements
                if(arr[j] > arr[j+1]){ 
                    int temp = arr[j]; // swaping the elements
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
