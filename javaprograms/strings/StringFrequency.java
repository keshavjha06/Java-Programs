package javaprograms.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StringFrequency {
    public static void main(String[] args) {
        String str = "Keshav Jha works in mnc and Keshav lives in Hyderabad";
        HashMap<String, Integer> strCount = new HashMap<>();
        String[] strArray = str.split(" ");
        for (String ele : strArray) {
            strCount.put(ele, strCount.getOrDefault(ele, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : strCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
