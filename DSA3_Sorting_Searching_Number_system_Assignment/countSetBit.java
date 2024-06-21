package DSA3_Sorting_Searching_Number_system_Assignment;

import java.util.Scanner;

/*Q4. Given a number, count the number of set bits in that number without using an extra space. */
public class countSetBit {
    public static int setCount(int n){
        int count = 0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n>>=1;
        }
        return count;
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Enter a number:- ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int count = setCount(n);
        System.out.println("Number of Sets = "+count);
        sc.close();
    }
}
