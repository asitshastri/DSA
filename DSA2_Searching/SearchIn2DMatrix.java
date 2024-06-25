package DSA2_Searching;
import java.util.Arrays;
import java.util.Scanner;

/*You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
  */
/**
 * SearchIn2DMatrix
 */
public class SearchIn2DMatrix {
  public static boolean findMatrix(int arr[][],int target){
    //no of rows
    int rows = arr.length;
    if(rows==0){
      return false;
    }

    //no of columns
    int cols = arr[0].length;

    //Binary Search Algorithm
    int low=0, high=rows*cols-1;
    while(low<=high){
      int mid = low+(high-low)/2;
      if(arr[mid/cols][mid%cols]==target){
        return true;
      }
      else{
        if(target < arr[mid/cols][mid%cols]){
          high = mid-1;
        }
        else low = mid+1;
      }
    }
    return false;
  }
  public static void main(String[] args) {
    int arr[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
    Scanner sc = new Scanner(System.in);
    for(int x[]:arr){
      System.out.println(Arrays.toString(x));
    }
    System.out.print("Enter element to Search in the Matrix: ");
    int target = sc.nextInt();
    System.out.println(target+" is present inside Matrix?: "+findMatrix(arr, target));
    sc.close();
  }
}
