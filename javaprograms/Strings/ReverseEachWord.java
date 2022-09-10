package javaprograms.Strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {

    public static void main(String[] args) {

        String str = "Welcome To Java";
        String[] words = str.split(" ");//splitting string into words
        String reverseString = "";

        for (String w : words) //Welcome
        {

            String reverseWord = "";
            for (int i = w.length() - 1; i >= 0; i--) //Welcome
            {
                reverseWord = reverseWord + w.charAt(i);
            }
            reverseString = reverseString + reverseWord + " "; //emocleW
        }
        System.out.println(reverseString);
    }

    //2nd approach
    String st = "Welcome to Java";

    // Splitting the string based on space and reverse each part
    // and then join
    {
        String result = Arrays.asList(st.split(" ")).stream().map(s -> new StringBuilder(s).reverse()).collect(Collectors.joining(" "));
        System.out.println(result);
    }


}


