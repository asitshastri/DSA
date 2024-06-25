package DSA6_Leet_Code;
public class AllPathOfOneDimensionBoard {
    public static void PrintPath(int current, int destination, String path){
        if(current>destination){
            return;
        }
        if(current==destination){
            System.out.println(path);
            return;
        }
        PrintPath(current+1, destination, path+"+1");
        PrintPath(current+2, destination, path+"+2");
        PrintPath(current+3, destination, path+"+3");
        PrintPath(current+4, destination, path+"+4");
        PrintPath(current+5, destination, path+"+5");
        PrintPath(current+6, destination, path+"+6");
    }
    public static void main(String[] args) {
        PrintPath(0, 9, "0");
    }
}
