package DSA2_Searching;
import java.util.Scanner;
/**
 * LinearSearch
 */
public class LinearSearch {
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
        int idx=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            System.out.println("Element not found in the Array");
        }
        else{System.out.println("Element is present at index= "+idx);}
        sc.close();
    }
}