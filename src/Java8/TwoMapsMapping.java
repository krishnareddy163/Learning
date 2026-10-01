package Java8;

import java.util.HashMap;
import java.util.Map;

public class TwoMapsMapping {
    public static void main(String[] args) {
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

        map1.entrySet().stream()
                .map(e -> Map.entry(
                        e.getKey(),
                        map2.get(e.getValue())
                ))
                .sorted(Map.Entry.<Integer, Double>comparingByValue().reversed())
                .forEach(e ->
                        System.out.println(e.getKey() + "," + e.getValue().intValue())
                );
    }
}
