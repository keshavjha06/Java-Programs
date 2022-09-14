package javaprograms.strings;

import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "A", "A", "B", "C", "A");

        //create a SET to identify unique values
        Set<String> unique = new HashSet<>(list);

        Map<String, Integer> result = new HashMap<>();

        //iterate through your unique values
        for (String s : unique) {
            //result set is optional if you like to find out which is highest or lowest count
            result.put(s, Collections.frequency(list, s));
            System.out.println(s + " : " + Collections.frequency(list, s));
        }

        //if need to display for the specific item
        System.out.println(result.get("A"));


    }

}
