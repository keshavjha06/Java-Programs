package javaprograms.strings;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {
        String str = "Keshav Jha";
        removeDuplicates(str);

    }

    static void removeDuplicates(String str) {
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            lhs.add(str.charAt(i));
        }
        // System.out.println(lhs.toString().replaceAll("[, ]", ""));
        for (Character ch : lhs)
        System.out.print(ch);
    }
}
