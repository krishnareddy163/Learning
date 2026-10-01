package ArrayProgramming;

import java.util.Scanner;

public class RomanNumeral {

    public static String toRoman(int n) {
        if (n < 1 || n > 3999) {
            throw new IllegalArgumentException("Input must be between 1 and 3999");
        }

        int[]    values  = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (n >= values[i]) {
                result.append(symbols[i]);
                n -= values[i];
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1–3999): ");
        int number = scanner.nextInt();
        System.out.println(number + " in Roman numerals is: " + toRoman(number));
        scanner.close();
    }
}