package DSA4_Recursion;
import java.util.Scanner;

public class BinarySearchwithRecurssion {
    public static int binarySeacrh(int arr[],int low,int high,int target){
        int mid = low+(high-low)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
            return binarySeacrh(arr, mid+1, high, target);
        }
        else{
            return binarySeacrh(arr, low, mid-1, target);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,8,10,12};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int high = arr.length-1;
        System.out.println(target+" is present at index "+binarySeacrh(arr,0,high,target));
        sc.close();
    }
}
