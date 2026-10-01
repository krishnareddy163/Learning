package ArrayProgramming;

import java.util.Arrays;

public class RotateArray {

  public static void main (String[] args){
    int[] nums = {1,2,3,4,5,6};
    int input = 3;
    rotateArray(nums, input);
    System.out.println(Arrays.toString(nums));
  }

  public static void rotateArray(int[]  nums, int input){
    int n = nums.length;
    input = input%n;
    int[] temp = new int[128];
    int tempIndex =0;
    for (int i = n-input; i<n; i++) {
      temp[tempIndex] = nums[i];
      tempIndex++;
    }
    for(int i =0; i< n-input; i++){
      temp[tempIndex] = nums[i];
      tempIndex++;
    }
    for (int i =0; i<n; i++){
      nums[i] = temp[i];
    }
  }
}
