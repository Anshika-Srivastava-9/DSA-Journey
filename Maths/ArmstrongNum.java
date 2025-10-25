package Maths;

import java.util.Scanner;

public class ArmstrongNum {
   public static void main(String[] args) {
    int sum=0;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int num=n;
    while(n>0){
        int ld=n%10;
        sum=sum+(ld*ld*ld);
        n/=10;
    }
    System.out.println(sum);
    System.out.println(num);
    if(num==sum){
        System.out.println("Armstrong Number");
    }
    else {
        System.out.println("Not Armstrong Number");
    }
   } 
}
