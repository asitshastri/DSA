package DSA3_Sorting_Searching_Number_system_Assignment;

import java.util.Scanner;

/*Q5. Given an integer array, duplicates are present in it in a way that all duplicates appear an even
number of times except one which appears an odd number of times. Find that odd appearing
element in linear time and without using any extra memory. */
public class OddOccuringElement {
    public static int findOddOccuring(int[] arr)
    {
        int xor = 0;
        for (int i: arr) {
            xor = xor ^ i;
        }
        return xor;
    }
    public static void main(String[] args) {
        int n;  
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: ");  
        //reading the number of elements from the that we want to enter  
        n=sc.nextInt();  
        //creates an array in the memory of length 10  
        int[] array = new int[n];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {  
        //reading array elements from the user   
            array[i]=sc.nextInt();  
        }
        System.out.println("The odd occurring element is " + findOddOccuring(array));
        sc.close();
    }
}
