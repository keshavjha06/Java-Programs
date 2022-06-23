package javacoreprograms;

public class FirstLetterCapitalInString {

    public static void main(String[] args) {

        String s = "java is good";
        StringBuffer s1 = new StringBuffer();
        char ch = ' ';
        for (int i = 0; i < s.length(); i++) {

            // If previous character is space and current
            // character is not space then it shows that
            // current letter is the starting of the word
            if (ch == ' ' && s.charAt(i) != ' ')
                s1.append(Character.toUpperCase(s.charAt(i)));
            else
                s1.append(s.charAt(i));
            ch = s.charAt(i);
        }

        System.out.println((s1));

    }

}
