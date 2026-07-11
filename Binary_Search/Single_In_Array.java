package Binary_Search;
public class Single_In_Array {
    public static int SingleElement(int []arr){
       int n= arr.length;
       int i=0;
       int j=n-1;
       if(n==1) return arr[0];
       if(arr[0]!=arr[1]) return arr[0];
       if(arr[n-1] != arr[n-2])  return arr[n-1];
        while(i<=j){
            int mid= i+(j-i)/2;

        if(arr[mid]!=arr[mid-1] && arr[mid]!= arr[mid+1] )   return arr[mid];

        int f=mid , s=mid;
        if(arr[mid-1]== arr[mid])
            f=mid-1;
        else s=mid+1;

        int leftCount= f-i;
        int rightcount = j-s;

        if(leftCount %2==0) i =s+1;
        else j=f-1;

        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,5,5,6,6};
        System.out.println(SingleElement(arr));
    }
}
