import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        subset(new ArrayList<>(),arr,0);
    }
    public static void subset(ArrayList<Integer>ans,int arr[],int idx){
        if(idx==arr.length){
            System.out.print(ans+" ");
            return;
        }
        ans.add(arr[idx]);
        subset(ans, arr, idx+1); //pick

        ans.remove(ans.size()-1);
        subset(ans, arr, idx+1);  // skip
    }
}
