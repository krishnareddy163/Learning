package ArrayProgramming;

import java.util.*;

public class TopKFrequentElements {

  public static int[] topKFrequent(int[] nums, int k) {

    // Step 1: Count frequency
    Map<Integer, Integer> freqMap = new HashMap<>();
    for (int num : nums) {
      freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
    }

    // Step 2: Max Heap based on frequency
    PriorityQueue<Integer> maxHeap =
            new PriorityQueue<>((a, b) -> freqMap.get(b) - freqMap.get(a));

    // Step 3: Add all numbers to heap
    maxHeap.addAll(freqMap.keySet());

    // Step 4: Extract top K elements
    int[] result = new int[k];
    for (int i = 0; i < k; i++) {
      result[i] = maxHeap.poll();
    }

    return result;
  }

  public static void main(String[] args) {
    int[] nums = {1, 1, 2, 3, 3, 4};
    int k = 2;

    System.out.println(Arrays.toString(topKFrequent(nums, k)));
  }
}
