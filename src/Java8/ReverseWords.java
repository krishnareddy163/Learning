package Java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {

    public static void main(String[] args) {

        String input = "krishna is hardworking candidate";

        String output = Arrays.stream(input.split(" "))
                .map(e -> new StringBuilder(e).reverse().toString()).
         collect(Collectors.joining(" "));

        System.out.println("Reversed words: " + output);
    }
}
