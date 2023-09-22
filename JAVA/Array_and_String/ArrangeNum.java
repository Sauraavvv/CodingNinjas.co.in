/* You have been given an empty array(ARR) and its size N.
The only input taken from the user will be N and you need not worry about the array.
Your task is to populate the array using the integer values in the range
1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2. */ 

package Array_and_String;

import java.util.Scanner;

public class ArrangeNum {
    public static int[] takeInput() {
		try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i < n;i++) {
            	arr[i] = s.nextInt();
            }
            return arr;
        }
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

public static int[] arrange(int[] arr, int n) {
    
    int value = 1;
    int start = 0; // start pointer.
    int end = n-1; // end pointer.
    while(start<=end){
        // if the value is odd then put it in the start and increase then value and start by 1
        if(value % 2 == 1){
            arr[start] = value;
            value++;
            start++;
        }
        // if the value is even then put it in the end and increase then value by 1 and decrease start by 1
        else{
            arr[end] = value;
            value++;
            end--;
        }
    }
    return arr;
}

public static void main(String[] args){
    try (Scanner s = new Scanner(System.in)) {
        int[] arr = takeInput();
        int n = s.nextInt();
        int[] result = arrange(arr, n);
        System.out.println(result);
    }
}
}
