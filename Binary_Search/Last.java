package Binary_Search;
import java.util.ArrayList;

public class Last {
    public static int  lastOccur(int arr[], int target){
          int n=arr.length;
          int i=0; int j=n-1;
          int index=-1;
          while(i<=j){
            int mid= (i+j)/2;
            if(arr[mid]==target){
                index =mid;
                i=mid+1;
            }
            else if(arr[mid]>target){
                j=mid-1;
            }
            else{
                i=mid+1;
            } 
    }
    return index;
}
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

    public static ArrayList<Integer> ans(int arr[],int target){
         ArrayList<Integer> ans=new ArrayList<>();
         ans.add(Occurence(arr, target));
         ans.add(lastOccur(arr, target));
         return ans;
    }

public static void main(String[] args) {
    int arr[]={1,1,1,2,2,3,4,5,6,6,6,6,7,8};
         System.out.println(ans(arr, 6));
}
}