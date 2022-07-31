package javaprograms;

import java.util.HashSet;

public class DistinctVowels {

    public static void main(String[] args) {

        String str = "Selenium";

        str = str.toLowerCase();
        HashSet<Character> set = new HashSet<>(); // Here you store used vowels
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') { // if currently checked character is vowel...
                set.add(str.charAt(i)); // add this vowel to setOfUsedChars

            }

        }
        System.out.println(set.size());
    }
}
