package Recursion;

public class BinaryStriingO {
    public static void printString(int n, int lastPlace,String str){
     if(n==0){
        System.out.println(str);
        return;
     }
     printString(n-1, 1, str+"1");
     if(lastPlace==1){
        printString(n-1, 0, str+"0");
     }
    }
    public static void main(String[] args) {
        printString(3, 1, " ");
    }
}
