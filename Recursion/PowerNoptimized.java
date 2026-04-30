package Recursion;

public class PowerNoptimized {
    public static double power(double x,int n){
       if(n==0)
        return 1;
    if(n<0){
        return 1/power(x, -n);
    }
double half= power(x,n/2);
    double halfPowerSq=half*half;
    if(n%2!=0){
        halfPowerSq= x*halfPowerSq;
    }
     return halfPowerSq;
    }
    public static void main(String[] args) {
      System.out.println(power(2,-9));  
    }
}
