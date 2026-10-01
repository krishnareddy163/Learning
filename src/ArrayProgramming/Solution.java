package ArrayProgramming;

import java.util.*;

public class Solution {

    // Encodes a list of strings to a single string
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();
    }

    // Decodes a single string to a list of strings
    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

            // Find the delimiter '#'
            while (str.charAt(j) != '#') {
                j++;
            }

            // Extract length
            int length = Integer.parseInt(str.substring(i, j));

            // Extract the actual string
            j++; // skip '#'
            result.add(str.substring(j, j + length));

            // Move pointer to next encoded part
            i = j + length;
        }

        return result;
    }

    // Main method to test encode & decode
    public static void main(String[] args) {
        Solution solution = new Solution();

        List<String> input = Arrays.asList(
                "Java",
                "Spring Boot",
                "Microservices",
                "Encode#Decode"
        );

        // Encode
        String encoded = solution.encode(input);
        System.out.println("Encoded String:");
        System.out.println(encoded);

        // Decode
        List<String> decoded = solution.decode(encoded);
        System.out.println("\nDecoded List:");
        for (String s : decoded) {
            System.out.println(s);
        }
    }
}
