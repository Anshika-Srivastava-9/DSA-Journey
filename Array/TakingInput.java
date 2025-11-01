package Array;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter The size of Array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
            
        }
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i]+" ");
            
        }
    }
}
// javac Array/TakingInput.java
// java Array.TakingInput
