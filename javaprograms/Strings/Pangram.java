package javaprograms.Strings;

import java.util.Scanner;

public class Pangram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  string");
        String str = sc.nextLine();

        str = str.replaceAll("", "").toLowerCase();

        // empty string
        String s = "";

        // checking characters (a-z or A-Z)
        for (char i = 'a'; i <= 'z'; i++) {

            // indexOf(char i)--> This method returns '-1' substring not found, if the position of substrings 'i' in 'str'
            if (str.indexOf(i) != -1) {

                s = s + i;// empty string+character
            }
        }
        // s.length()-->this method returns number or character of a string
        if (s.length() == 26) {
            System.out.println("String is a Pangram");
        } else {
            System.out.println("String is not a Pangram");
        }

    }

}

//program to print without semicolon

//if(System.out.printf("Hello world")==null)
//{
//}
