package Recursion;

public class GCD {
    public static void main(String[] args) {
        int n=12;
        int m=16;

        int gcf=1;
    for(int i=1;i<=m;i++){
        if(n%i==0 && m%i==0){
             gcf=i;
            
        }
        
    }
    System.out.println("gcf is "+ gcf);
}
}
