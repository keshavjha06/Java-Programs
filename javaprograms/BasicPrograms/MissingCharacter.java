package javaprograms.BasicPrograms;

import java.util.Arrays;

public class MissingCharacter {
    public static void main(String[] args) {
        char[] c = {'a', 'b', 'c'};
        c = new String(c).replace("b", "").toCharArray();
        System.out.println("b is missing" + " " + Arrays.toString(c));
    }
}
