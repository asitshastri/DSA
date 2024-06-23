package DSA4_Recursion_Assignment;
public class MaxValueOfArray {
    public static int checkMax(int arr[],int n,int idx){
        if(idx==n-1){
            return n-1;
        }
        int maxVal = Math.max(arr[idx], checkMax(arr, n, idx+1));
        return maxVal;
    }
    public static void main(String[] args) {
        int arr[] = {13, 1, -3, 22, 5};
        int n = arr.length;
        System.out.println("max = "+checkMax(arr,n,0));
    }
}
