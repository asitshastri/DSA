package DSA2_Searching;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int arr[],int target){
        int low=0, high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return 0;
    }
    
    
    public static void main(String[] args) {
       //scanner class object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in Array:- ");
        int n = sc.nextInt();

        System.out.println("Enter array elements:- ");
        int arr[] = new int[n];

        //inputting array elements
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //target element
        System.out.println("Enter target Element:- ");
        int target = sc.nextInt();

        //Implementing Linerar Search
        int result = binarySearch(arr,target);
        if(result==0){
            System.out.println("Element not found");
        }
        else{System.out.println("Element is at index: "+result);}
        sc.close();;
    }
}
