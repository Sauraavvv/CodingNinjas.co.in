package Array_and_String;

public class PrintAllPairs {
    public static void PrintAllPair(int[] arr){
          int n = arr.length;
          for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                System.out.println("(" + arr[i] + "," + arr[j] + ")");
            }
          }
    }
    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3 ,4 ,5};
        PrintAllPair(arr);
    }
}
