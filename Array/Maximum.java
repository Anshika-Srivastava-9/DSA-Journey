package Array;

public class Maximum {
  public static void main(String[] args) {
    int max=1;                     //Not good Approach may be elements are negative we cannot preassume the number always
    // int max=arr[0];                //good approach because arr[o] will definitely be in array and can be gretaest or any element
     int arr[]={7,5,3,4,93,65,23,86};
     for (int i = 0; i < arr.length; i++) {
        if (arr[i]>max) {
            max=arr[i];
        }
     }
     System.out.println(max);
  }  
}
