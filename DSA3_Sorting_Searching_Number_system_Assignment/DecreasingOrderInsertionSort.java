package DSA3_Sorting_Searching_Number_system_Assignment;

import java.util.Arrays;

/*Q3. WAP to sort an array in decreasing order using insertion sort
Input Array {3,5,1,6,0}
Output Array: {6, 5, 3, 1, 0} */
public class DecreasingOrderInsertionSort {
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]>arr[j-1]){
                //swap arr[j] and arr[j-1]
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,5,1,6,0};
        //function call
        insertionSort(arr);
        System.out.println("Sorted array is: ");
        System.out.println(Arrays.toString(arr));
    }
}
