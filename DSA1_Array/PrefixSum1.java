package DSA1_Array;
import java.util.Scanner;
/*Q4 : Givev a matrix avd a couple of coordivate pairs (x1 , y1) avd (x2 , y2) respectively. Returv the 
sum of the rectavgle formed usivg these coordivates as opposite corvers. */

/*PROBLEM:
 * If no of quaries increases(ex: 10^5) then the code will run for O(10^5 * m * n) times which 
 * is very long
 */
public class PrefixSum1 {
    public static int rectangularSum(int[][] arr){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter row no. of 1st element");
        int r1 = scan.nextInt();


        System.out.println("Enter column no. of 1st element");
        int c1 = scan.nextInt();

        System.out.println("Enter row no. of 2st element");
        int r2 = scan.nextInt();

        System.out.println("Enter column no. of 2nd element");
        int c2 = scan.nextInt();
        scan.close();

        int sum=0;
        // time complexity : O(m * n)
        // space complexity : O(1)
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][]={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        System.out.println("Prefix Sum= "+rectangularSum(arr));
    }
}
