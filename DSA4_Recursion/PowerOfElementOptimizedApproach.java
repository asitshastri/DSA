package DSA4_Recursion;

import java.util.Scanner;

public class PowerOfElementOptimizedApproach {
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
                return 2 * result;
            } else
                return result;
        }

    }

    public static void main(String[] args) {
        System.out.println("Finding a^b");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        int a = sc.nextInt();
        System.out.print("Enter its power: ");
        int b = sc.nextInt();
        System.out.println(a + " to the power " + b + " = " + pow(a, b));
        sc.close();
    }
}
