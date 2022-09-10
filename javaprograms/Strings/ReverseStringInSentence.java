package javaprograms.Strings;

import java.util.Scanner;

public class ReverseStringInSentence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        String[] str1 = str.split(" ");

        for (int i = str1.length - 1; i >= 0; i--) {
            System.out.print(str1[i]);
            if (i != 0) {
                System.out.print("*");
            }

        }


    }

}
