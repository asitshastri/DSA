package DSA3_Sorting_Searching_Number_system_Assignment;

import java.util.Scanner;

public class LastOccuranceOfElement {
    public static int upperBound(int arr[],int target){
        int low=0;int high=arr.length-1;
        int result = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                result = mid;
                low = mid+1;
            }
            if(arr[mid]>target){
                high=mid-1;
            }
            else low=mid+1;
        }
        return result;
    }
    public static void main(String[] args) {
        //scanner class object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements in Array:- ");
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
        int result = upperBound(arr,target);
        if(result==-1){
            System.out.println("Element not found");
        }
        else{System.out.println("Last Occurance of Element is at index: "+result);}
        sc.close();
    }
}
