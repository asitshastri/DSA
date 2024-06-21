package DSA3_Sorting_Searching_Number_system_Assignment;

import java.util.Arrays;

/*Q2. WAP to sort an array in descending order using selection sort
Input Array {3,5,1,6,0}
Output Array: {6, 5, 3, 1, 0} */
public class DescendingOrderSelectionSort {
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min_idx = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[min_idx]){
                    min_idx = j;
                }
            }
            if(min_idx!=i){
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,5,1,6,0};
        //calling function
        selectionSort(arr);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(arr));
    } 
}
