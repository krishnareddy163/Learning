package ArrayProgramming;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1,c;
        int number =10;
        for(int i=0; i< number; i++){
            System.out.println(a+" ");
            c=a+b;
            a=b;
            b=c;
        }

    }
}
