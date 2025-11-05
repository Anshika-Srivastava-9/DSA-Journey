package Array;

public class Duplicate {
    public static void main(String[] args) {
        boolean duplicate=false;
        int []arr={1,2,3,2,45,3,65};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    duplicate=true;
                    break;
                }
            }
        }
        return;
    }
}
