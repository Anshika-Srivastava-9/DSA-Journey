package Array;

public class Ques_Array {
    public static void main(String[] args) {
        int[] arr = { 70, 54, 65, 34, 56, 46, 68, 35 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 35) {
                // System.out.println(arr[i]); // print marks less than 35
                System.out.println(i); // prints index having less than 35 marks
            }
        }
    }
}
// javac Array/Ques_Array.java
// java Array.Ques_Array
