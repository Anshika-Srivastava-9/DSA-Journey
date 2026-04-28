package Recursion;

public class Powern {
    public static double myPow(double x, int n) {
        if(n == 0) return 1;

        if(n < 0){
            return 1 / myPow(x, -n);  // handle negative
        }

        return x * myPow(x, n - 1);  // your original logic
    }

    public static void main(String[] args) {
        double x=2;
        int n=-6;
       System.out.println(myPow(x,n)); 
    }
}
