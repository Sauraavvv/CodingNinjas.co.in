/* You are given an integer array 'A' of size 'N', sorted in non-decreasing order. You are also given an integer 'target'.
Your task is to write a function to search for 'target' in the array 'A'.
If it exists, return its index in 0-based indexing. Otherwise, return -1.

Note: You must write an algorithm whose time complexity is O(logN). */

package Sorting_Algo;
public class BinarySearch {
    public static int search(int []nums, int target) {
        int start = 0; int end = nums.length-1; // initialize the start and end pointer.
        
        while(start<=end){  
            int mid = (start + end)/2;  // finding the mid element of the array.
            if(nums[mid] == target){  // If the target is equal to the mid element of array then return mid.
                return mid;
            }
            else if(target > nums[mid]){  // If the target is greater than mid then shift the pointers.
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
}
}
