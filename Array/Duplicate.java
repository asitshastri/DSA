
package Array;
/*Q4. Write a program to print the duplicate elements of an array.Note: There would be
 only a single duplicate element present in the array for this question. */
public class Duplicate {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,5,6,6,9};
        int n=arr.length;
        //int Duplicates = 0;
        //searching for duplicate elements
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate Element= "+arr[i]);
                }
            }
        }
    }
}
