package DSA1_Array;
import java.util.Arrays;
public class Palindrom {
    public static void main(String[] args) {
        //Initializing array
        int arr_sample[] = {1,2,3,2,1};

        //Palindrome Check:-
        //Method-1
        System.out.println("Method-1");
        int arr_new[] = new int[arr_sample.length];
        for(int i=0;i<arr_sample.length;i++){
            arr_new[i] = arr_sample[arr_sample.length-1-i];
        }
        if(Arrays.equals(arr_new, arr_sample)){
            System.out.println("Palindrome");
        }
        else System.out.println("Not a Palindrome");
        /*In this method:
         * Time complexity= O(n)
         * Space Complexity = O(n)
         * Now how to reduce it?
         */

        //Method-2
        System.out.println("\nMethod-2");
        int mid=arr_sample.length/2;
        int flag=0;
        for(int i=0;i<mid;i++){
            if(arr_sample[i]!=arr_sample[arr_sample.length-1-i]){
                flag+=1;
                System.out.println("Not a Palindrome");
                break;
            }
        }
        if(flag == 0){
            System.out.println("Palindrome");
        }

    }
}