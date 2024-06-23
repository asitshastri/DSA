package DSA4_Recursion;

import java.util.Scanner;

public class FibonacciSeries {
    //Function Definition
    public static int fibo(int n){
        int result = 0;
        if(n<=1){
            return n;
        }
        else{
            result =  fibo(n-1)+fibo(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Fibonacci Series");
        System.out.print("Enter the range of Fibonacci Series: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Function Calling
        System.out.println("Output is: "+fibo(n));
        sc.close();
    }
}
