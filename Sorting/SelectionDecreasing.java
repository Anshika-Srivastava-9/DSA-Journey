public class SelectionDecreasing {
    public static void print(int[] arr) {
       for(int ele:arr){
        System.out.print(ele+" ");
       } 
       System.out.println();
    }
    public static void main(String[] args) {
       int arr[]={2,4,-1,6,0,1,-4,-3,9};
       int n=arr.length;
        for(int i=0;i<n-1;i++){
            int max=Integer.MIN_VALUE;
            int maxindx=i;
            for(int j=0;j<n-i;j++){
                if(arr[j]>max){
                    max=arr[j];
                    maxindx=j;
                }
            }
            int temp=arr[n-1-i];
            arr[n-1-i]=arr[maxindx];
            arr[maxindx]=temp;
        }
        print(arr);
    }
}
