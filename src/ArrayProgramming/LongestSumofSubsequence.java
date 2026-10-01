package ArrayProgramming;

public class LongestSumofSubsequence {

  public static void main(String[] args) {
    int[] nums= {5,2,3,-8,0,6,-1};
    int maxSum = nums[0];
    int currentSum = nums[0];
    for(int i=1;  i<nums.length; i++){
      currentSum = Math.max(nums[i], currentSum+nums[i]);
      maxSum = Math.max(maxSum, currentSum);
    }
    System.out.println(maxSum);
  }

}
