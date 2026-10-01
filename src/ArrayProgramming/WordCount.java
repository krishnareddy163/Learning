package ArrayProgramming;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public static void main(String[] args) {
        String input = "java java spring boot";
        String[] words = input.split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(String word: words){
            if(hashMap.containsKey(word)){
                hashMap.put(word, hashMap.get(word) + 1);
            }else{
                hashMap.put(word, 1);
            }
        }
        String output = null;
        int maxCount = 0;
        for(Map.Entry<String, Integer> entry: hashMap.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                output = (String) entry.getKey();
            }
        }
        System.out.println("Word count: " + output);
    }
}
