package Array;

public class MaxSubArray {
    public static void MaxSub(int nums[]) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
     for(int i=0;i<nums.length;i++){
        for(int j=i;j<nums.length;j++){
          currSum=0;
          for(int k=i;k<=j;k++){
            currSum+=nums[k];
          }
          System.out.println(currSum);
          if(maxSum<currSum){
            maxSum=currSum;
          }
        }
        System.out.println();
     }
     System.out.println("max sum = " +maxSum);
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10};
        MaxSub(nums);
    }
}
