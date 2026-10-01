package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeSelf {

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,2};
        HashSet<Integer> integerHashSet = new HashSet<>();
        Optional<Integer> firstDuplicate = Arrays.stream(arr).boxed().filter(i -> !integerHashSet.add(i)).findFirst();
        System.out.println(firstDuplicate);

        Set<Integer> allDuplicates = Arrays.stream(arr).boxed().collect(Collectors.groupingBy( i-> i, Collectors.counting())).entrySet()
                        .stream().filter(i -> i.getValue() >1).map(Map.Entry :: getKey).collect(Collectors.toSet());
        System.out.println("all"+allDuplicates);

        Set<Integer> noduplicates = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        System.out.println(noduplicates);

        List<Integer> listNumbers  = Arrays.asList(1,2,4,5,63,2,4);
        Set<Integer> resultDuplicates = listNumbers.stream().collect(Collectors.groupingBy( i->i, Collectors.counting()))
                        .entrySet().stream().filter(i -> i.getValue() >1).map(Map.Entry :: getKey).collect(Collectors.toSet());
        System.out.println(resultDuplicates);

        Set<Integer> noResultantDuplicates = listNumbers.stream().collect(Collectors.toSet());
        System.out.println(noResultantDuplicates);

        String s ="Krishna";
        Map<Object, Long> characterCount = s.chars().mapToObj(c ->(char) c).collect(Collectors.groupingBy(i->i, Collectors.counting()));
        System.out.println(characterCount);

        String str ="dfssfdd";
        Optional<Character> out = str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(i->i,LinkedHashMap::new, Collectors.counting()))
                        .entrySet().stream().filter( i-> i.getValue() ==2)
                .map(Map.Entry::getKey).findFirst();
        System.out.println(out);

        String inputString= "KrishnaReddy";

        String outputString = inputString.chars().mapToObj(c -> (char) c).distinct()
                .map(String::valueOf).collect(Collectors.joining());

        System.out.println(outputString);

        String input = "krishna is hardworking candidate";

        String reversewords = Arrays.stream(input.split(" ")).
                map(i -> new StringBuilder(i).reverse().toString()).collect(Collectors.joining(" "));
         System.out.println(reversewords);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        Integer resultout = list.stream().filter( i -> i%2 ==0).mapToInt(Integer::intValue).sum();
         System.out.println(resultout);

        int[] numarr = {1,2,3,4,5,6};
        Integer outputsum = Arrays.stream(numarr).boxed().filter( i -> i%2 ==0).mapToInt(Integer::intValue).sum();
        System.out.println(outputsum);

        String inputword = "krishna is hardworking candidate";
       Map<Object, Long> outputcount = Arrays.stream(inputword.split(" ")).collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        System.out.println(outputcount);

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(101,"Rahul");
        map1.put(103,"Raj");
        map1.put(106,"Chinna");
        map1.put(105,"Rahim");

        Map<String, Double> map2 = new HashMap<>();
        map2.put("Chinna",50000.0);
        map2.put("Rahim",60000.0);
        map2.put("Raj",70000.0);
        map2.put("Rahul",20000.0);

        map1.entrySet().stream().map(
                i -> Map.entry(i.getKey(),
                        map2.get(i.getValue()))
        ).sorted(Map.Entry.<Integer,Double>comparingByValue().reversed()).forEach(i -> System.out.println(
                i.getKey() +" ---"+i.getValue()
        ));
    }
}
