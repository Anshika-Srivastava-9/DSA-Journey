package Recursion;

public class SumNaturalNo {
    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        int sn_o=Sum(n-1);
        int sn= n+ Sum(n-1);
        return sn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(Sum(n));
    }
}
