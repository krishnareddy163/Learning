package ArrayProgramming;

import java.util.HashMap;

public class TwoSum {

  public static void main(String[] args) {
    int[] nums = {2, 5, 8, 7, 10};
    int target = 9;

    HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      int findoutnumber = target - nums[i];
      if (hashMap.containsKey(findoutnumber)) {
        System.out.println(findoutnumber + "," + nums[i]);
      }
      hashMap.put(nums[i], i);

    }
  }
}

