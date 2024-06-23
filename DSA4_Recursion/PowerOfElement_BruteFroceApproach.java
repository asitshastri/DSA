package DSA4_Recursion;

import java.util.Scanner;

public class PowerOfElement_BruteFroceApproach{
    public static int pow(int a, int b){
        int result = 0;
        if(b==1){
            return a;
        }
        else if(b==0){
            return 1;
        }
        else{
            result = a*pow(a, b-1);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Finding a^b");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        int a = sc.nextInt();
        System.out.print("Enter its power: ");
        int b = sc.nextInt();
        System.out.println(a+" to the power "+b+" = "+pow(a,b));
        sc.close();
    }
}
