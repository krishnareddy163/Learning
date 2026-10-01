package ArrayProgramming;

public class AlphaSeries {

    public static void main(String[] args) {

        // Single letters
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }

        // Double letters
        for (char first = 'A'; first <= 'A'; first++) {
            for (char second = 'A'; second <= 'Z'; second++) {
                System.out.print("" + first + second + " ");
            }
        }
    }
}
