package javaprograms.arrays;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "Javata";
        char[] arr = str.toCharArray();
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char ele : arr) {
            frequencyMap.put(ele, frequencyMap.getOrDefault(ele, 0) + 1);
        }
        // System.out.println(frequencyMap);
        for(Map.Entry<Character, Integer> entry : frequencyMap.entrySet()){
            System.out.println(entry.getKey() + " : " +  entry.getValue());
            
        }
    }

}
