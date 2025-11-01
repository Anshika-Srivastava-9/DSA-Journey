package Array;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = { 7, 5, 3, 4, 93, 65, 23, 86 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        ;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }

        }
        System.out.println("First largest element is " + max);
        System.out.println("Second largest element is " + smax);
    }
}
