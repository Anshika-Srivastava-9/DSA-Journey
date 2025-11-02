package Array;

public class TwoSum {
    public static void main(String[] args) {
    int [] num={23,43,54,67,89,76,58,93,29,50};  
    int target=97;
    int ans[]=new int[2];
    for(int i=0;i<num.length;i++){
        for (int j = i+1; j<num.length; j++) {
            if (num[i]+num[j]==target) {
                ans[0]=i;
                ans[1]=j;
                break;
            }
        }
    }  
    System.out.println(ans[0]+" "+ans[1]);
    }
}
