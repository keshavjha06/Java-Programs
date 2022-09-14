package javaprograms.strings;

import java.util.HashMap;
import java.util.Map;

public class CountStringOccurance {
    public static void main(String[] args) {
        String str = "Keshav Jha works in mnc Keshav Jha lives in Bangalore";
        stringCount(str);
    }

    static void stringCount(String str) {
        HashMap<String, Integer> strCount = new HashMap<>();
        String[] strArray = str.split(" ");
        for (String w : strArray) {

            if (strCount.containsKey(w)) {
                strCount.put(w, strCount.get(w) + 1);

            } else {
                strCount.put(w, 1);
            }

        }
        // System.out.println(strCount);
        for (Map.Entry stringCount : strCount.entrySet())
            System.out.println(stringCount.getKey() + " " + stringCount.getValue());
    }

}
