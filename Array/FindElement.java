package Array;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        boolean flag=false ;  //Element not in Array
        System.out.println("Enter the Elements");
        int []arr=new int [5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i]+" ");  
        }
        System.out.println("Enter the target :");
        int target=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (target==arr[i]){
                 flag=true;   //Element present in Array and found
            break;
            }
           
        } 
        if(flag==true)
        System.out.println("Target found");
        else
        System.out.println("Element not present in Array");
    }
    
}
// javac Array/FindElement.java
// java Array.FindElement