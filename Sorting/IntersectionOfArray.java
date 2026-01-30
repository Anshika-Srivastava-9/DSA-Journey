import java.util.*;
public class IntersectionOfArray {
    public static void main(String[] args) {
        ArrayList<Integer> ans=new ArrayList<>();
        int [] arr1={2,4,1,5,3,4,4,5,6,0,3};
        int [] arr2={1,3,5,5,4,6};
         Arrays.sort(arr1);
        Arrays.sort(arr2);

        int n=arr1.length;
        int m=arr2.length;
        int i=0;
        int j=0;
        while(i!=n&&j!=m){
            if(arr1[i]==arr2[j]){
                ans.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]) {
                i++;
            }
            else{
                j++;
            }
        }
        int answer[]=new int[ans.size()];
        for(int k=0;k<ans.size();k++){
            answer[k]=ans.get(k);
        
        }
       for (int x : answer) {
            System.out.print(x + " ");
    }
}
}
