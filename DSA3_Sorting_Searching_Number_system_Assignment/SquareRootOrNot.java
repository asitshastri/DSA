package DSA3_Sorting_Searching_Number_system_Assignment;
import java.util.Scanner;
/*Q5. Given a positive integer num, return true if num is a perfect square or false otherwise.
A perfect square is an integer that is the square of an integer. In other words, it is the product
 of some integer with itself.
Example 1:
Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
Example 2:
Input: num = 1
Output: false
Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer*/
public class SquareRootOrNot {
    public static boolean isPerfectSquare(int num){
        boolean res = false;
        long start = 0;
        long end = num/2;
        while(start<=end){
            long mid = start + (end-start)/2;
            if(mid*mid == num){res=true;} 
            if(mid*mid > num){ end = mid-1;}
            else{start=mid+1;}
            
        }
        return res;
    }
    public static void main(String[] args) {
        int m;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        m=sc.nextInt();      
       
        System.out.println("The given number is a perfect square: " + isPerfectSquare(m));
        sc.close();;
    }
}
