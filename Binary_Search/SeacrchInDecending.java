package Binary_Search;

public class SeacrchInDecending {
    public static int  Search(int arr[],int target){
        int n=arr.length;
        int i=0;int j=n-1;
        while(i<=j){
            int mid=(i+j)/2;
         if(arr[mid]==target){
            return mid;
         }
         else if(arr[mid]<target){
            j=mid-1;
         }
         else{
            i=mid+1;
         }
         
        } 
     return -1;
    }
    public static void main(String[] args) {
       int arr[]={9,8,7,6,5,4,3,2,1};
       System.out.println(Search(arr, 7));
    }
}
