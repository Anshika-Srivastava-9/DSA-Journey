package Array;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList_Vector {
    public static void main(String[] args) {
      ArrayList<Integer> arr=new ArrayList<>(); 
      arr.add(1); 
      arr.add(3); 
      arr.add(6); 
      arr.add(9); 
      arr.add(10); 
      arr.add(13); 
      arr.add(11); 

    arr.get(3);
    arr.set(4,19);
    
    System.out.println(arr);
    int n=arr.size();
    for (int i = 0; i < n; i++) {
      System.out.print(arr.get(i)+" ");
    }
    System.out.println();
    for (int ele : arr) {
      System.out.print(ele+" ");
    }
    System.out.println();

    arr.add(18);
    System.out.println(arr);
    arr.add(2,23);
    System.out.println(arr);
    arr.remove(3);
    System.out.println(arr);
    Collections.reverse(arr);
    System.out.println(arr);


    ArrayList<Character> arr2=new ArrayList<>();
    ArrayList<String> arr3=new ArrayList<>();
    }

}
