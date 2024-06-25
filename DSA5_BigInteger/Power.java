package DSA5_BigInteger;

import java.math.BigInteger;
import java.util.Scanner;
public class Power {
    public static BigInteger pow(BigInteger a, int b){
        BigInteger result;
        if(b==1){
            return a;
        }

        else{
            result = pow(a, b/2);
            result = result.multiply(result);
            if(b%2==1){
                return a.multiply(result);
            }
            else return result;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        BigInteger a = sc.nextBigInteger();
        System.out.print("Enter power: ");
        int b = sc.nextInt();
        System.out.println(a+"^"+b+" = "+pow(a,b));
        sc.close();
    }
}