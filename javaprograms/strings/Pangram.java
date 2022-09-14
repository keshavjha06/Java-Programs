package javaprograms.strings;

public class Pangram {

    public static void main(String[] args) {
        if (pangram("abcdefghijklmnopqrstuvwxyz"))
            System.out.println("String is pangram");
        else
            System.out.println("String is not pangram");
    }

    static boolean pangram(String str) {
        str = str.replaceAll(" ", "");
        String s = "";
        for (char i = 'a'; i <= 'z'; i++) {
            // indexOf(char i)--> This method returns '-1' substring not found, if the position of substrings 'i' in 'str'
            if (str.indexOf(i) != -1)
                s = s + i;// empty string+character
        }
        if (s.length() == 26)
            return true;
        else
            return false;
    }
}


//program to print without semicolon
/*
if(System.out.printf("Hello world")==null)
{
}
*/
