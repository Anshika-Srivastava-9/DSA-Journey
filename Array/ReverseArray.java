package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] num = {23, 43, 54, 67, 89, 76, 58, 93, 29, 50};
        int n = num.length;
        int[] brr = new int[n];

        // run loop in reverse
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            brr[j] = num[i];
            j++;
        }

        // print reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(brr[i] + " ");
        }
    }
}
