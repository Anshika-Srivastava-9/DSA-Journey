package Recursion;

public class Fibonacci {
    public static int fibonacciSeries(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fibnm1= fibonacciSeries(n-1);
        int fibnm2=fibonacciSeries(n-2);
        int fibn=fibnm1+fibnm2;
        return fibn;

    }
    public static void main(String[] args) {
        int n=26;
        System.out.println(fibonacciSeries(n));
    }
}
