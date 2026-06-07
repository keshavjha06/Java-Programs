package javaprograms.strings;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingSequence {
    public static void main(String[] args) {
        String str = "acbdfghybdf";
        String lrs = "";
        int n = str.length();

        Map<String, Integer> substringCounts = new HashMap<>();
        // Generate all possible substrings and count their occurrences
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = str.substring(i, j);
                substringCounts.put(sub, substringCounts.getOrDefault(sub, 0) + 1);
            }
        }
        // Find the longest substring that appears at least twice (count > 1)
        for (Map.Entry<String, Integer> entry : substringCounts.entrySet()) {
            String sub = entry.getKey();
            int count = entry.getValue();
            if (count > 1 && sub.length() > lrs.length()) {
                lrs = sub;
            }
        }
        System.out.println("Longest repeating sequence: " + lrs);
    }
}
