import java.util.Arrays;

public class TwoSum {
   public static void main(String[] args) {
    int arr[]={7,0,4,3,2,8,6};
    int n=arr.length;
    int target=9;
    int ans[]=new int[2];
    int j=n-1;
    int i=0;
    Arrays.sort(arr);
    while(i<j){
        if(arr[i]+arr[j]<target){
            i++;
        }
        else if(arr[i]+arr[j]>target){
            j--;}
        
        else if(arr[i]+arr[j]==target){
            ans[0]=arr[i];
            ans[1]=arr[j];
        break;
        }
    }
    System.out.println("two elements whose sum is " +target+ " are "+ans[0] +" "+ ans[1]);
      
    }
   } 

