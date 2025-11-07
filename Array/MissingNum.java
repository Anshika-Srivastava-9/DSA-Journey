package Array;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr={8,2,4,5,3,7,1};
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        int arrSum=0;
        for (int ele : arr) {
            arrSum+=ele;
        }
        System.out.println(sum-arrSum);
    }
}
