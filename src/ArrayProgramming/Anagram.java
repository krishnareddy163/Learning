package ArrayProgramming;

import java.util.Arrays;

public class Anagram {

  public static void main(String[] args) {
    System.out.println(isAnagram("Krishna", "Krishna"));
  }

  public static boolean isAnagram(String s, String t) {
    s = s.replaceAll("\\s", "").toLowerCase();
    t = t.replaceAll("\\s", "").toLowerCase();

    if(s.length()!=t.length()) {
      return false;
    }

    char[] sc = s.toCharArray();
    char[] tc = t.toCharArray();
    Arrays.sort(sc);
    Arrays.sort(tc);

    return  Arrays.equals(sc, tc);
  }

}
