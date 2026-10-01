package ArrayProgramming;

public class PalindromeString {
    public static void main(String[] args) {
        String s= "madam";
        char[] chars = s.toCharArray();
        int left =0;
        boolean isPalindrome = Boolean.TRUE;
        int right = chars.length-1;
        while(left < right){
            if(chars[left] != chars[right]){
                isPalindrome = Boolean.FALSE;
            }
            left++;
            right--;
        }
        System.out.println(isPalindrome);
    }
}
