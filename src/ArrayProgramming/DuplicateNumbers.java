package ArrayProgramming;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 3, 4, 2};
        int[] resultArr = new int[arr.length];
        int j = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                resultArr[j++] = arr[i];
            } else {
                set.add(arr[i]);
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.println(resultArr[i]);
        }
    }
}
