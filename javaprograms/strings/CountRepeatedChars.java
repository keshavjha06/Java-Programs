package javaprograms.strings;

import java.util.HashMap;

public class CountRepeatedChars {
    public static void main(String[] args) {
        printDuplicateChars("Javata");
    }

    public static void printDuplicateChars(String str) {
        if (str == null) {
            System.out.println("Null String");
            return;
        }
        if (str.isEmpty()) {
            System.out.println("Empty String");
            return;
        }
        if (str.length() == 1) {
            System.out.println("single character string");
            return;
        }
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] chArr = str.toCharArray();
        for (char ch : chArr) {
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }
        System.out.println(charCountMap);
    }
}
