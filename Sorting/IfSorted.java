public class IfSorted {
    public static void main(String[] args) {
        boolean flag = true;
        int arr[] = { 0, -1, 2, 3, 4 };
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;
            }
             
        }
        if (flag == true) {
            System.out.println("Array is sorted ");
        } else
            System.out.println("Array is not sorted");
    }
}