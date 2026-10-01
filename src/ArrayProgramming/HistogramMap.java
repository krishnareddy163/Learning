package ArrayProgramming;

import java.util.HashMap;
import java.util.Map;

public class HistogramMap {

    public static void main(String[] args) {

        int[] data = {10, 20, 10, 30, 20, 10};

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : data) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.print(entry.getKey() + " : ");
            for (int i = 0; i < entry.getValue(); i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
