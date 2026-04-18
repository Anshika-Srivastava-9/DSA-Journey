package Recursion;

public class IncreasingOrder {
    public static void printNUm(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printNUm(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
       int n=10;
       printNUm(n); 
    }
}
