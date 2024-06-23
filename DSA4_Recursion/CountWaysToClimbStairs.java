package DSA4_Recursion;

import java.util.Scanner;

public class CountWaysToClimbStairs {
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
        System.out.println("Count possible ways to climb the steps\n If only 1 or 2 steps are allowed at a time.\n");
        System.out.print("Enter no of Stairs:- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Possible Ways= "+fibo(n+1));
        sc.close();
    }
}
