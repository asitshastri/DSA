package DSA1_Array;
public class Reversal {
    public static void main(String[] args) {
        //sample array
        int sample[]={1,2,3,4,5};
        int n = sample.length;

        //swaping elements
        for(int i=0;i<n/2;i++){
            int temp = sample[i];
            sample[i] = sample[n-1-i];
            sample[n-1-i] = temp;
        }

        //checking arrayvalue
        for(int x:sample){
            System.out.print(x+" ");
        }
    }
}
