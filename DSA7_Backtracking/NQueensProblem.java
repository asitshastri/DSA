package DSA7_Backtracking;

import java.util.Arrays;

public class NQueensProblem {
    public static void printSolution(int board[][]){
        for(int row[]:board){
            System.out.println(Arrays.toString(row));
        }
    }
    public static boolean isSafe(int board[][],int row, int column,int n){
        int i,j;

        //check for the left side of the row
        for(i=0;i<column;i++){
            if(board[row][i]==1){
                return false;
            }
        }
        //check for the upper diagonal in the left direction
        for(i=row,j=column;i>=0&&j>=0;i--,j--){
            if(board[i][j]==1){
                return false;
            }
        }
        //check for the lower diagonal in the left direction
        for(i=row,j=column;i<n&&j>=0;i++,j--){
            if(board[i][j]==1){
                return false;
            }
        }
        //if all the abouve conditions are passed then
        return true;
    }

    //Function to solve NQueen Problem
    public static boolean solveNQueen(int board[][],int column,int n){
        /*
         * Base case - if all the queens have got placed then return true
         * */
        if (column >= n)
        {
            return true;
        }

        //consider this column and try placing all the queens one by one in all the rows
        for (int i = 0; i < n; i++) {
            //check if it is safe to place the queen or not
            if (isSafe(board, i, column, n)) {
                //place the queen in the board
                board[i][column] = 1;

                //recursive call for remaining queens
                if (solveNQueen(board, column + 1, n) == true) {
                    return true;
                }

                //if placing the queen does not lead to solution then backtrack
                board[i][column] = 0;
            }
        }

        //if it is not possible to place the queen in any row of the given column then return false
        return false;
    }
    public static void main(String[] args) {
        int[][]  board = {{0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0}
                        };
        int n = board.length;
        if(solveNQueen(board, 0,n )){
            printSolution(board);
        }
        else{
            System.out.println("Solution Doesn't exist");
        }
    }
}
