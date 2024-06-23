package DSA4_Recursion;

import java.util.Scanner;

public class FactorialFinding {
    //Function Definition
    public static int findFactorial(int n){
        int result =0;
        //Base Case Condition
        if(n==0 || n==1){
            return 1;
        }
        else{
            //Recursive Function Calling
            result = n*findFactorial(n-1);
            
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Factorial");
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" = "+findFactorial(n));
        sc.close();
    }
}
