package Array;

import java.util.ArrayList;

public class AllZeroAtEnd {
    public static void main(String[] args) {
        int arr[]={1,0,2,3,2,0,0,4,5,1};
        ArrayList<Integer> temp=new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        for (int  ele : temp) {
            System.out.print(ele+" ");
        }
        System.out.println();
        int n=temp.size();
        for (int i = 0; i <temp.size(); i++) {
            arr[i]=temp.get(i);
        }

        for (int i = n; i < arr.length; i++) {
            arr[i]=0;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        }

        
    }

