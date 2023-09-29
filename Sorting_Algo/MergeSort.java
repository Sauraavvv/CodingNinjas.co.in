/* You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively,
merge them into a third array/list such that the third array is also sorted. 

Sample Input 1 :
1
5
1 3 4 7 11
4
2 4 6 13

Sample Output 1 :
1 2 3 4 4 6 7 11 13   */ 

package Sorting_Algo;
public class MergeSort {
    public static int[] merge(int arr1[], int arr2[]) {
    	int i=0, j=0, k=0;
        int ans[] = new int[arr1.length + arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                ans[k] = arr1[i];
                k++;
                i++;
            }
            else{
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length){
            ans[k] =  arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            ans[k] =  arr2[j];
            j++;
            k++;
        }
        return ans;
    }
}
