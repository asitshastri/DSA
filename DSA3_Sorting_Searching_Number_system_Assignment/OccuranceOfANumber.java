package DSA3_Sorting_Searching_Number_system_Assignment;

import java.util.Scanner;

/*Q4. Given a sorted integer array containing duplicates, count occurrences of a given number. If the element is
not found in the array, report that as well.
Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9] target = 5
Output: Target 5 occurs 3 times
Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9] target = 6
Output: Target 6 occurs 2 times */
public class OccuranceOfANumber {
    public static int upperBound(int arr[],int low,int high,int target){
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
    public static int lowerBound(int arr[],int low,int high,int target){
        int result = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                result = mid;
                high = mid-1;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
         int m;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to add : ");
        m=sc.nextInt();      
        
        int []arr = new int[m];
        
        System.out.print("Enter the elements of the array: ");
        
        for(int i=0;i<m;i++){
            arr[i] = sc.nextInt();
        }
        
        int target;
        Scanner sc1 = new Scanner(System.in);
        System.out.print("enter the target: ");
        target = sc1.nextInt();
        
        int first = lowerBound(arr , 0 , m - 1 , target);
        int last = upperBound(arr , 0 , m - 1 , target);
        
        if(first == last && first == -1)System.out.println("The target does not exist in the array.");
        else System.out.println("The frequency of target in the given array is " + (last - first + 1) + " time/times");
        sc.close();
        sc1.close();
    }
}
