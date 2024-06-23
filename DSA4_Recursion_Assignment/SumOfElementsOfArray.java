package DSA4_Recursion_Assignment;
/*Q4 : Find the sum of the values of the array [92, 23, 15, -20, 10]. */
public class SumOfElementsOfArray {
    public static int findSum(int arr[],int n,int idx){
        if(idx==n-1){
            return arr[idx];
        }
        return arr[idx]+findSum(arr, n, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {92,23,15,-20,10};
        int n = arr.length;
        System.out.println("Sum of array elements = "+findSum(arr,n,0));
    }
}
