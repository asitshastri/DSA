package DSA6_Leet_Code;

import java.util.Scanner;

public class PrintMAzePath {
    public static void printMAzePath(int cr,int cc,int dr,int dc, String path){
        if(cr>dr || cc>dc){
            return;
        }
        if(cr==dr&&cc==dc){
            System.out.println(path);
            return;
        }
        printMAzePath(cr+1, cc, dr, dc, path+" + 1V");
        printMAzePath(cr, cc+1, dr, dc, path+" + 1H");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows in the maze: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns in maze: ");
        int cols = sc.nextInt();
        printMAzePath(0,0,rows,cols,"start");
        sc.close();
    }
}
