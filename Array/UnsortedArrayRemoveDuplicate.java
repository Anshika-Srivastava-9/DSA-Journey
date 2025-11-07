package Array;

    import java.util.Arrays;

public class UnsortedArrayRemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {4, 1, 2, 4, 3, 2, 1};
        int n = arr.length;

        Arrays.sort(arr);

        
        int i = 0;

        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) { 
                i++;
                arr[i] = arr[j];
            }
        }

        System.out.print("After removing duplicates: ");
        for (int j = 0; j <= i; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}


