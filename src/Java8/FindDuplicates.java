package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicates {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 3, 5);
        Set<Integer> duplicates = list.stream()
         .collect(Collectors.groupingBy(e->e, Collectors.counting()))
         .entrySet().stream().filter(e -> e.getValue()>1)
         .map(Map.Entry::getKey).collect(Collectors.toSet());
        System.out.println("Duplicate elements: " + duplicates);
    }
}
