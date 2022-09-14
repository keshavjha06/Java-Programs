package javaprograms.strings;
import java.util.*;

public class SortStringSequence {
    public static void main(String[] args) {
        String str = "azcazdado";
        LinkedHashMap<Character,Integer> maxCount = new LinkedHashMap<>();
        char[] chars = str.toCharArray();
        for(Character character : chars){
            if(maxCount.containsKey(character)) {
                int count = maxCount.get(character);
                        count++;
                maxCount.put(character, count);
            }
            else {
                maxCount.put(character,1);
            }
        }
        StringBuilder newString = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : maxCount.entrySet()) {
            int itr = entry.getValue();
            char ch = entry.getKey();
            for(int i= 0;i<itr;i++){
                newString.append((ch));
            }
         //   newString.append(String.valueOf(ch).repeat(Math.max(0,itr)));
            //repeat will work with jdk 11
        }
        System.out.println(newString);
    }
}
