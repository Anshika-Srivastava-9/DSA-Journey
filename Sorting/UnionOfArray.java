import java.util.*;

public class UnionOfArray {
    public static void main(String[] args) {

        int[] a = {2, 4, 1, 5, 3, 4, 4, 5, 6, 0, 3};
        int[] b = {1, 3, 5, 5, 4, 6};

        Arrays.sort(a); // Sort arrays
        Arrays.sort(b);

        ArrayList<Integer> union = new ArrayList<>();

        int i = 0, j = 0;
        int n = a.length, m = b.length;

        // Traverse both arrays
        while (i < n && j < m) {
            if (a[i] == b[j] && !union.contains(a[i])) {
                union.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                if (!union.contains(a[i])) union.add(a[i]);
                i++;
            } else {
                if (!union.contains(b[j])) union.add(b[j]);
                j++;
            }
        }

        // Add remaining elements of a
        while (i < n) {
            if (!union.contains(a[i])) union.add(a[i]);
            i++;
        }

        // Add remaining elements of b
        while (j < m) {
            if (!union.contains(b[j])) union.add(b[j]);
            j++;
        }

        // Print union
        System.out.println("Union:");
        for (int x : union) {
            System.out.print(x + " ");
        }
    }
}
