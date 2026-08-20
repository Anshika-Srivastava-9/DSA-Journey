public class Recursion_on_Array {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        recPrint(arr, 0);
        
    }
    public static void recPrint(int arr[], int indx) {
        System.out.print(arr[indx]+" ");
        
        if(indx ==arr.length-1) return;
        recPrint(arr, indx+1);
        
        System.out.print(arr[indx]+" ");
    }
}
