package DSA3_Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            boolean swapped = false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }
    public static void main(String[] args) {
        // array definition
        int[] arr = {20, 50, 10, 12, 45, 67, 90};
        // function calling
        bubbleSort(arr);
        System.out.println("Sorted array is: ");
        System.out.println(Arrays.toString(arr));
    }   
}
