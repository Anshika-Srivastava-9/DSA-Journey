package Maths;

import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    boolean flag=false;  // Prime Number
    for (int i = 2; i <=Math.sqrt(n); i++) {
        if(n%i==0){
        flag=true;       // Composite Number
        break;
        }
    }
    if(n==1)
    System.out.println("Neither Prime nor Composite");
    else if (flag==false)
    System.out.println("Prime Number");
    else
    System.out.println("Composite Number");
  }  
}
// javac Maths/Prime.java
// java Maths.Prime