package javaprograms.basicprograms;

import java.util.Scanner;

public class VowelAndConsonant {

    public static void main(String[] args) {
        //a , e, i, o, u
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");

        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + "is vowel");
        } else {
            System.out.println(ch + " is consonant");
        }

        //2nd approach
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;

            default:
                System.out.println(ch + " is consonant");
        }
    }
}
