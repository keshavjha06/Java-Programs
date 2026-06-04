package javaprograms.strings;

import java.util.Arrays;

public class FirstLetterOfEachWord {

    public static void main(String[] args) {
        String str = "Keshav Jha";
        String[] words = str.split("\\s+");
        System.out.println(Arrays.toString(words));
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.print(word.charAt(0));
            }
        }
    }
}
