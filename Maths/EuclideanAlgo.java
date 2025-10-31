package Maths;

import java.util.Scanner;

public class EuclideanAlgo {
   public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    while(a>0 && b>0){
      if(a>b)
      a=a%b;
      else
      b=b%a;
    }
    if(a==0)
    System.out.println("GCD or HCF is "+b);
    else
    System.out.println("GCD or HCF is "+a);
      } 
}
