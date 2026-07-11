package Binary_Search;

public class Floor_In_Sorted {
    public static int findFloor(int[] arr, int x) {
        int n=arr.length;
        int index=-1;
        int i=0;
        int j=n-1;
        while(i<=j){
            int mid=(i+j)/2;
            
        if (arr[mid]<=x){
           index=mid;
            i=mid+1;
             }
        else{ 
           j=mid-1;
        }
        
        }
       return index; 
    }
    public static void main(String[] args) {
        int []arr={1,2,8,10,10,11};
        int target=5;
        System.out.println(findFloor(arr, target));
    }
    
}
