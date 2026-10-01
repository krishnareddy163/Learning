package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) {

        String input = "Hello hello! Goodbye.";

        Map<String, Long> wordCount = Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(
                        w -> w,
                        Collectors.counting()
                ));

        System.out.println("Word count: " + wordCount);

        String mostfrequentWord = wordCount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println(mostfrequentWord);
    }
}
