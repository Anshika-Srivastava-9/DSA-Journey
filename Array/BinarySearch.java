package Array;

public class BinarySearch {
    public static int Binary_Search(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
        int mid=(start+end)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,3,9,10,12,23,24,35,45,56,68};
        int target=35;
        System.out.println("Target element is found at index: "+Binary_Search(arr,target));
    }
}
