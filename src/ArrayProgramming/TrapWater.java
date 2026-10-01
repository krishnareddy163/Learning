package ArrayProgramming;

public class TrapWater {
    public static void main(String[] args) {
        int[] input = {0,1,0,2,1,0,1, 3,2,1,2,1};
        System.out.println(trapofwater(input));
    }
    public static int trapofwater(int[] input){
        int left = 0;
        int length = input.length;
        int right = length-1;
        int leftmax =0;
        int rightmax =0;
        int output =0;

        while (left< right) {
            leftmax = Math.max(leftmax, input[left]);
            rightmax = Math.max(rightmax, input[right]);

            if(leftmax< rightmax){
                output+=leftmax-input[left];
                left++;
            } else{
                output+=rightmax-input[right];
                right--;
            }
        }
        return output;
    }

}
