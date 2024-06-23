package DSA4_Recursion_Assignment;

import java.util.Scanner;

/*Q5. Given a number n. Print if it is an armstrong number or not. An armstrong number is a number if the sum
of every digit in that number raised to the power of total digits in that number is equal to the number.
Example : 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 hence 153 is an armstrong number. (Easy)
Input1 : 153
Output1 : Yes
Input 2 : 134
Output2 : No */
public class CheckArmstrong {
    public static int pow(int a, int b) {
        int result = 0;
        if (b == 0) {
            return 1;
        }
        // Base Case Condition
        if (b == 1) {
            return a;
        } else {
            result = pow(a, b / 2);
            result *= result;
            if (b % 2 == 1) {
                return a * result;
            } else
                return result;
        }
    }
    public static int digitSum(int digit,int power){
        if(digit==0){
            return 0;
        }
        return (pow(digit%10,power)+digitSum(digit/10,power));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int power = num%10;
        if(digitSum(num, power)==num){
            System.out.println(num+" is an Armstrong number");
        }
        else System.out.println(num+" is not an Armstrong number.");
        sc.close();
    }
}
