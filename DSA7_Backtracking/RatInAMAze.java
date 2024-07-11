package DSA7_Backtracking;

import java.util.Arrays;

public class RatInAMAze {
    public static void printMatrix(int matrix[][]){
        for(int[] row:matrix){
            System.out.println(Arrays.toString(row));
        }
    }
    public static boolean isSafe(int [][] maze, int i, int j,int n){
        if(i>=0&&i<n && j>=0&&j<n && maze[i][j]==1){
            return true;
        }
        else return false;
    }
    public static boolean solveMaze(int [][]maze,int[][] output,int i,int j,int n){
        //base case
        if(i==n-1&&j==n-1 && maze[i][j]==1){
            output[i][j]=1;
            return true;
        }

        if(isSafe(maze, i, j, n)==true){
            if(output[i][j]==1){
                return false;  //because we are also backtracking and if already covered not need run call again
            }

            //othervise make it a part of solution
            output[i][j]=1;
            
            //after this make recursive calls

            //Right Direction
            if(solveMaze(maze, output, i, j+1, n)==true){
                return true;
            }
            //Bottom Direction
            if(solveMaze(maze, output, i+1, j, n)==true){
                return true;
            }

            //backtracking--unmark
            output[i][j]=0;
            return false;

        }
        return false;

    }
    public static void main(String[] args) {
        int maze[][] = {
            {1,1,0,1},
            {0,1,1,1},
            {0,1,0,0},
            {1,1,1,1}
        };
        // printing Maze
        printMatrix(maze);

        int n = maze.length;

        //output matrix same dimension as maze matrix
        int output[][] = new int[n][n];

        System.out.println();

        if(solveMaze(maze, output, 0, 0, n)==true){
            printMatrix(output);
        }
        else System.out.println("Path to Destination does not exist");

    }
}
