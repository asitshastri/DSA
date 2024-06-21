package DSA2_Searching;
import java.util.Scanner;
public class SquareRoot {
    public static int findSquareRoot(int num){
        int low = 0, high=num, result=-1;

        //modified Binary search
        while(low<=high){
            int mid=low+(high-low)/2;
            long val = mid*mid;
            if(val==num){
                //perfect square root
                return mid;
            }
            else if (val<num){
                /*
                 * store the result of low in case the no is not a perfect square root
                 * reason: we need floor value of the number.
                 * 
                 */
                result = mid;
                low = mid+1;
            }
            else{high = mid-1;}
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of which you want the square root to: ");
        int num = sc.nextInt();

        //function calling
        int result = findSquareRoot( num);
        System.out.println("Square root of "+num+" = "+result);
        sc.close();
    }
}
