package Strings;

import java.util.Scanner;

public class Basic {
    public static void printLetter(String str){
      for(int i=0;i<str.length();i++){
        System.out.print(str.charAt(i)+" ");
      }
      System.out.println();
    }
    public static void main(String args[]){
    char a[] = {'a','b','c'};
    String str="abcd";
    String str2=new String("efg");

    

    //  Strings are IMMUTABLE

    //INPUT
    // Scanner sc=new Scanner(System.in);
    // String name=sc.next();
    // System.out.println(name);
    // String name2=sc.nextLine();
    // System.out.println(name2);

    //FUNCTION
    // System.out.println(name2.length());

    //CONCATENATION
    String FirstName="Anshika";
    String LastName="Srivastava";
    String FullName= FirstName+" "+LastName;
    System.out.println(FullName);
   

    // CHARAT particular place
    printLetter(FullName);
   }  
}

