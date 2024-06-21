package DSA3_Sorting_Searching_Number_system_Assignment;

import java.util.Scanner;

/**
 * Q3. Problem 1: Given a number. Using bit manipulation, check whether it is odd or even.
 */
public class CheckEvenOdd {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        number = sc.nextInt();

        if((number&1)==1){
            System.out.println("It's an Odd number");
        }
        else System.out.println("Even number");
        sc.close();
    }    
}