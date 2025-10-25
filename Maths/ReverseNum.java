package Maths;

public class ReverseNum {
    public static void main(String[] args) {
        int rev = 0;
        int n = 98732;
        while (n > 0) {
            int ld = n % 10;
            rev = rev * 10 + ld;
            n /= 10;
        }
        System.out.println(rev);
    }

}
