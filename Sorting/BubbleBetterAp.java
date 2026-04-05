public class BubbleBetterAp {
    public static void main(String[] args) {
        int arr[]={1,2,7,4,5,6,9};
        int swap=0;
        for (int i = 0; i < arr.length-1; i++) {
        for (int j = 0; j < args.length-1-i; j++) {
            if (arr[j]>arr[j+1]) {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swap++;
            }
        }
        if(swap==0)
        break;
    }
    for(int j=0;j<arr.length;j++){
        System.out.print(arr[j]+" ");
    }
}
}