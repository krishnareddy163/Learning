package ArrayProgramming;

public class ReverseNumber {
    public static int reverse(int x) {
        int reversed =0;

        while(x!=0){
            int digit= x%10;
            reversed = reversed*10 + digit;
            x= x/10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-321));
    }
}
