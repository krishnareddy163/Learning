package ArrayProgramming;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        // Edge case: empty array
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take first string as reference
        String first = strs[0];

        // Loop through each character of first string
        for (int i = 0; i < first.length(); i++) {
            char currentChar = first.charAt(i);

            // Compare with same index of other strings
            for (int j = 1; j < strs.length; j++) {

                // If index exceeds string length OR characters don't match
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return first.substring(0, i);
                }
            }
        }

        // If entire first string is a prefix
        return first;
    }

    public static void main(String[] args) {
        String[] names = {"Krishna", "Krida", "Krina"};
        System.out.println(longestCommonPrefix(names)); // Output: Kri
    }
}
