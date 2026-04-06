package Array;

public class SegregtateZeroOne {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,0};
        int numOfZero=0;
        int numOfOne=0;
        for (int ele : arr) {
            if (ele==0) {
                numOfZero++;
            }
            else
            numOfOne++;
        }
        for (int i = 0; i < numOfZero; i++) {
            arr[i]=0;
        }
        for (int i = numOfZero; i < arr.length; i++) {
            arr[i]=1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
