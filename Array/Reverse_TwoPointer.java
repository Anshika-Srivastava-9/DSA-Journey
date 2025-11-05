package Array;

public class Reverse_TwoPointer {
    public static void print(int []arr) {
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
      }  
      System.out.println();
    }
    public static void swap(int []arr,int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
       
    }
    public static void main(String[] args) {
      int [] arr={23, 43, 54, 67, 89, 76, 58, 93, 29, 50};
      int n=arr.length;             
      print(arr);
     int i=0,j=n-1;
     while (i<=j) {
        swap(arr,i,j);
         i++;
        j--;
     }
     
     print(arr);
    }
}
