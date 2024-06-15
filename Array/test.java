package Array;
/**
 * Q4: Write a program to find out the second largest element in a given array.
Input 1: arr[] = {34,21,54,65,43}
 */
public class test {

    public static void main(String[] args){
        int peak = -1;
        int arr[] = {1, 4,7,3,2,6,5};
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                if(peak<arr[i]){
                    peak = arr[i];
                }
            }  
        }
        System.out.println(peak);
    }
}