package javaprograms;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(anagramFinder("arc", "car"));
    }

    static boolean anagramFinder(String str, String s) {
        if (str.length() != s.length())
            return false;
        str = str.replace(" ", "").toLowerCase();
        s = s.replace(" ", "").toLowerCase();
        char[] a = str.toCharArray();
        char[] b = s.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);

    }

}
