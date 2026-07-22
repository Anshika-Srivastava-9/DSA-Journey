package Recursion;

public class globalVriable {
       static int x=10;
    public static void main(String[] args) {
        x=10;
        // change(x);
        System.out.println(x);
        int x=4;
        System.out.println(x);
        x=6;

    }
    public static void change() {
        x=20;
       
    }
}
