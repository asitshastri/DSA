package DSA4_Recursion;
import java.util.Scanner;
/* ex number=5 uperbound of table5
 * ans= 24
 *      48
 *      72
 *      96
 *      120
*/
public class PrintMultiple {
    public static void printMulti(int n, int k){
        if(k==1){
            System.out.println(n+"x1 = "+n);
            return;
        }
        printMulti(n, k-1);
        System.out.println(n+"x"+k+" = "+n*k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int num = sc.nextInt();
        System.out.print("Enter k:");
        int k = sc.nextInt();
        printMulti(num, k);
        sc.close();
    }
}
