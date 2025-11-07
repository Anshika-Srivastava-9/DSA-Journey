package Array;

public class IfSorted {
    public static void main(String[] args) {
        boolean flag=false;
        int arr[]={1,2,3,4,5,6};
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){
                flag=true;
            }
        }
        if(flag==true)
        System.out.println("Sorted");
        else
        System.out.println("not");
    }
}
