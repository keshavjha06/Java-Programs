package javaprograms.strings;

import java.util.ArrayList;
import java.util.Collections;


public class ArrangeString {
    public static void main(String[] args) {
        String s = "Test@123 Google";
        //GT@123 eegloost
        ArrayList<Character> v1 = new ArrayList<>();
        ArrayList<Character> v2 = new ArrayList<>();

        for(int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) >= 'a' &&
                    s.charAt(i) <= 'z')
                v1.add(s.charAt(i));

            if (s.charAt(i) >= 'A' &&
                    s.charAt(i) <= 'Z')
                v2.add(s.charAt(i));
        }

        // Sort both the list
        Collections.sort(v1);
        Collections.sort(v2);
        System.out.println(v1.toString());
    }
}