package ArrayProgramming;

import java.util.HashSet;
import java.util.Set;

class Duplicate {
    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        for( int num : nums){
            if(!seen.add(num)){
                return true;
            }  
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,3};
        System.out.println(hasDuplicate(nums));
    }
}