package DSA4_Recursion_Assignment;

import java.util.Scanner;

/*Assignment Questions
Q1 : Given an integer, find out the sum of its digits using recursion.
Input: n= 1234
Output: 10
Explanation: 1+2+3+4=10 */
public class SumOFDigits {
    public static int digitSum(int digit){
        if(digit==0){
            return 0;
        }
        return ((digit%10)+digitSum(digit/10));
    }
    public static void main(String[] args) {
        System.out.print("Enter a Digit: ");
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        System.out.println("Sum of Digits of number "+digit+" = "+digitSum(digit));
        sc.close();
    }
}
