public class findElement_in_Array {
    public static void main(String[] args) {
        int arr[]={34,23,56,78,45,64,25};
        int ele=55;
        System.out.println(exist(arr,ele,0));
    }
    public static boolean exist(int arr[] , int ele, int idx) {
        if(idx>arr.length-1) return false;
        if(ele==arr[idx]) return true;
        return exist(arr, ele, idx+1);
    }
}
