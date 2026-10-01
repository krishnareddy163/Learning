package ArrayProgramming;

public class Palindrome {
    public static void main(String[] args) {
        int num =1210121;
        int newnum =0;
        int temp = num;
        while (num > 0){
            newnum = newnum*10 +num %10;
            num = num/10;
        }
        if(newnum == temp){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not");
        }
    }
}
