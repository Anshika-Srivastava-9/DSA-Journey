package Array;

public class CountElement {
    public static void main(String[] args) {
      int count=0;
      int x=50;
      int [] arr={20,94,50,36,43,54,12,34,65,45,23,87,};
      for (int i = 0; i < arr.length; i++) {
        if(arr[i]>x){
            count++;
        }
      }
      System.out.println(count);
    }
    
}
