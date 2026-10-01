package ArrayProgramming;

import java.util.HashMap;

public class LongestSubstring {
  public static int lengthOfLongestSubstring(String s) {

    int n= s.length();
    int maxlength =0;
    HashMap<Character, Integer> hmap = new HashMap<>();
    for (int right =0, left =0; right < n;  right++){
      Character ch = s.charAt(right);
      if (hmap.containsKey(ch)){
        left = Math.max(hmap.get(ch)+1, left);
      }
      hmap.put(ch, right);
      maxlength = Math.max(maxlength, right-left+1);
    }
    return maxlength;

  }

  public static void main(String[] args) {
    String input = "krishnakumar";
    System.out.println("Length: " + lengthOfLongestSubstring(input));
  }
}