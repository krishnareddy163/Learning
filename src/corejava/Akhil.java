package corejava;

public class Akhil {

    public static void main(String[] args) {
       /* int a =10;
        for(int i=0; i< a; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
     */

        int num =151;
        int originalNumber = num;
        int output =0;
        while(num >0){
            int rem = num%10;
            output = output+ rem*rem*rem;
            num = num/10;
        }

        if(originalNumber == output){
            System.out.println("Armstrong");
        } else{
            System.out.println("Not");
        }
    }
}
