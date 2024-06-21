package DSA1_Array;
/**
 * Q5: Write a function which accepts a 2D array of integers and its size as arguments
 *  and displays the elements of middle row and the elements of middle column. 
 * Printing can be done in any order.
[Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 
etc...]
 */
public class test {
    public static void main(String[] args){
        
        int arr[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        System.out.print("Middle Row: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==arr.length/2){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.print("\nMiddle Column: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(j==arr.length/2){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        
    }
}