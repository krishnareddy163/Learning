package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class CharacterCount {

    public static void main(String[] args) {

        String input = "banana";
        Map<Object, Long> hmap = input.chars().mapToObj(c -> (char)c).
                collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(hmap);

    }
}
