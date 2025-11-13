public class BubbleSort {
    public static void print(int [] arr){
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,-2,6,7,2,0,8,2};
        int n=arr.length;
        for (int j = 0; j < arr.length-1; j++) {
         for (int i = 0; i < n-1-j; i++) {
            if (arr[i]>arr[i+1]) {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        }
        print(arr);   
        
    }
}
