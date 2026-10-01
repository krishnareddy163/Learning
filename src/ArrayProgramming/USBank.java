package ArrayProgramming;

public class USBank {

    public static void main(String[] args) {
        String input = "Hell#@o";
        char[] c = input.toCharArray();
        int left =0;
        int right = c.length-1;
        while (left <right){
            if(!Character.isLetter(c[left])){
                left++;
            }else if(!Character.isLetter(c[right])){
                right--;
        } else{
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;
            }
    }
        System.out.println(new String(c));
    }
}