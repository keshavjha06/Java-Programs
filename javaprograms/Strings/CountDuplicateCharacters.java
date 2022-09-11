package javaprograms.Strings;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateCharacters {
    public static void main(String[] args) {
        String str = "Keshav Jha";
        countDuplicate(str);

    }

    static void countDuplicate(String str) {
        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (count.containsKey(str.charAt(i)))
                count.put(str.charAt(i), count.get(str.charAt(i)) + 1);
            else
                count.put(str.charAt(i), 1);

        }
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            if (entry.getValue() > 1)
                System.out.println(entry.getKey() + ", count =  " + entry.getValue());

        }

    }
}
