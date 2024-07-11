package DSA7_Backtracking;

public class StringPermutationss {
    public static String swap(String str,int i, int j){
        char temp;
        char[] charArr = str.toCharArray();
        temp = charArr[i];
        charArr[i]=charArr[j];
        charArr[j] = temp;
        return String.valueOf(charArr);
    }
    public static void permuteString(String str,int s, int end){
        if(s==end){
            System.out.println(str);
            return;
        }
        else{
            for(int i=s;i<=end;i++){
                str = swap( str,s,i);
                permuteString(str, s+1, end );

                //back tracking
                str = swap(str, s, i);
            }
        }
    }
    public static void main(String[] args) {
        String str = "XY";
        int e = str.length();
        permuteString(str, 0, e-1);
    }
}
