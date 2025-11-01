package Array;

public class SumOfAll {
    public static void main(String[] args) {
        int []arr={34,56,46,34,76,89,10,32};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
           sum+=arr[i]; 
        }
        System.out.println(sum);
    }
    
}
// javac Array/SumOfAll.java
// java Array.SumOfAll