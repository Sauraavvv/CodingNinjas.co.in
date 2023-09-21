package Array_and_String;

import java.util.Scanner;

public class LinearSearch {

  public static int[] takeInput() {
    try (Scanner s = new Scanner(System.in)) {
        int n = s.nextInt(); // to store user's input
        int[] arr = new int[n]; // initialize the size of array
        for (int i = 0; i < n; i++) { // inserting elements in the array
          arr[i] = s.nextInt();
        }
        return arr;
    }
  }

  public static void toPrint(int[] arr) { // creat a fnx that take array as parameter
    for (int i = 0; i < arr.length; i++) { // printing the array.
      System.out.print(arr[i] + " ");
    }
  }

  public static int linearSearch(int arr[], int x) {
    boolean flag = false;
    int i;
    for (i = 0; i < arr.length; i++) {
      if (x == arr[i]) {
        flag = true;
        break;
      }
    }
    if (flag == false) return -1; 
    else return i;
  }

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
        int[] arr = takeInput();
        int x = s.nextInt();
        int result = linearSearch(arr, x);
        System.out.print(result);
    }
  }
}
