package Array;

public class PrintNegativeElements {
    public static void main(String[] args) {
        int[]arr={2,34,56,-4,-34,25,-42,70};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                System.out.println(arr[i]);
            }
        }
    }
    
}
