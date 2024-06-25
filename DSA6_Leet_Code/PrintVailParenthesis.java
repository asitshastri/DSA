package DSA6_Leet_Code;
/*Leet Code Link- https://leetcode.com/problems/valid-parentheses/description/ */
public class PrintVailParenthesis {
    //Method to print 
    public static void printBalancedParenthesis(int n,int oc, int cc,String str){
        if(oc==n && cc==n){
            System.out.println(str);
            return;
        }
        if(oc<n){
            printBalancedParenthesis(n, oc+1, cc, str+"(");
        }
        if(oc>cc){
            printBalancedParenthesis(n, oc, cc+1, str+")");
        }
    }
    public static void main(String[] args) {
        printBalancedParenthesis(3, 0, 0, "");
    }
}
