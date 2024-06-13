package Array;
/*Q3 : Given an array arr[] of size N-1 with integers in the range of [1, N],
 the task is to find the missing number
from the first N integers. */
public class Missing {
    public static void main(String[] args) {
        /*Aim: to find one missing Element 
         * array = {1,2,4,7,5,6} 
         * size of array (without missing element) =6
         * size of array (with missing element) =6+1=7
        */
        int arr[]={1,2,4,7,5,6};
        int n=arr.length;

        //Sum of n+1 nautral nos. = [(n+1)(n+2)]/2
        int sum_natural_no = ((n+1)*(n+2))/2;
        int sum_elements = 0;
        for(int x:arr){
            sum_elements+=x;
        }
        int missing_element = sum_natural_no-sum_elements;
        System.out.println("Missing Element= "+missing_element);
    }
}
