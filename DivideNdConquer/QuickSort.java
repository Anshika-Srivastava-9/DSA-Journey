package DivideNdConquer;
public class QuickSort {

    // Function to print array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Quick Sort function using recursion
    public static void quickSort(int arr[], int low, int high) {

        // Base condition
        if (low < high) {

            // Pivot index
            int pivotIndex = partition(arr, low, high);

            // Left part sort
            quickSort(arr, low, pivotIndex - 1);

            // Right part sort
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition function
    public static int partition(int arr[], int low, int high) {

        int pivot = arr[high]; // Last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;

                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at correct position
        i++;

        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

    public static void main(String args[]) {

        int arr[] = {6, 3, 9, 5, 2, 8};

        quickSort(arr, 0, arr.length - 1);

        printArray(arr);
    }
}