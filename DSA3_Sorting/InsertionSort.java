package DSA3_Sorting;
import java.util.Arrays;
/**
 * InsertionSort
 * Time complexity = O(n^2), pace Complexity=O(1)
 * 
 * Note:-
 *  1)When Array is almost/fully sorted then always call: Insertion Sort
 *      reason: when almost full insertion sort time complexity= O(n)
 *  2)Insertion Sort is a Stable Sorting Algoritm.
 */
public class InsertionSort {
    //Implementation
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                //swap arr[j] and arr[j-1]
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {20,50,25,67,79,12,15};
        //function call
        insertionSort(arr);
        System.out.println("Sorted array is: ");
        System.out.println(Arrays.toString(arr));
    }    
}