package Binary_Search;

public class firstOccurence {
    public static int Occurence(int arr[],int target){
         
         int n=arr.length;
         int i=0; int j=n-1;
         int index=-1;
         while(i<=j){
            
           int mid=(i+j)/2;

           if(arr[mid]==target){
            index = mid;
            j=mid-1;
           }

           else if(arr[mid]>target){
           j=mid-1;
           }
           else {
            
             i =mid+1;
           }
          
         }
          return index;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3,4,5,6,6,6,6,7,8};
        int target=6;
        System.out.println("The first occurence of " +target+ " is at:" +Occurence(arr,target));
    }
}
