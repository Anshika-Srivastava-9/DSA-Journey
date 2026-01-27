public class MoveAllZeroUsingBubble {
    public static void print (int arr[]){
        for(int ele:arr){
            System.out.print(ele+" ");
        }

        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,0,3,0,4,9,0,6,-1,5};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag=true;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]==0&&arr[j+1]!=0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if(flag==true)
                break;
        }
        print(arr);
    }
}
