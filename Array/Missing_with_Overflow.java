package Array;
/*Q3 : Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing number
from the first N integers. But if N is Larger Overflow can occur

Arrroach:-
In order to avoid integer overflow, pick one number from the range [1, N] and 
subtract a number from the given array (don’t subtract the same number twice).
 This way there won’t be any integer overflow.

Solution:-
1) Create a variable total = 1 which will store the total sum of first n 
    elements.
2) Traverse the array from start to end.
        Update the value of total as total += i , now decrease value of total 
        by current array element.
3) Print the missing number , which will be present in the total variable.
*/
public class Missing_with_Overflow {
    static int getMissingNo(int a[], int n)
    {
        int total = 1;
        for (int i = 2; i < (n + 1); i++) {
            total += i;
            total -= a[i - 2];
        }
        return total;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 3 };
        int N = arr.length;
      
        // Function call
        System.out.println(getMissingNo(arr, N));
    }
}
