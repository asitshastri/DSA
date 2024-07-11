package DSA7_Backtracking;
import java.util.ArrayList;
import java.util.Arrays;

public class PrintSequence {
    public static void printSequence(int arr[],int idx, ArrayList<Integer> tempArr){
        //base case
        if(idx==arr.length){
            //print the subsequence but not the empty array
            if(tempArr.size()>0){
                System.out.println(tempArr);
            }
            return;
        }
        //recursive call

        //include
        printSequence(arr, idx+1, tempArr);

        //add value in tempArr
        tempArr.add(arr[idx]);

        //don't include
        printSequence(arr, idx+1, tempArr);

        //remove the value from tempArray -- backtracking
        tempArr.remove(tempArr.size() - 1);
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2};

        System.out.println("For the array - " + Arrays.toString(arr1));

        printSequence(arr1, 0, new ArrayList<Integer>());

        // System.out.println();

        // int[] arr2 = {1, 2, 3, 4, 5};

        // System.out.println("For the array - " + Arrays.toString(arr2));

        // printSequence(arr2, 0, new ArrayList<Integer>());
    }
}
