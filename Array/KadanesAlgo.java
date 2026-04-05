package Array;

public class KadanesAlgo {
    public static int kadaneMaxSum(int nums[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            if(maxSum<currSum){
                maxSum=currSum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int nuums[]={2,4,6,8,10};
        System.out.println(kadaneMaxSum(nuums));
    }
}
