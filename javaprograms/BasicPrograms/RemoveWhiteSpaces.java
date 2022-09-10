package javaprograms.BasicPrograms;

import java.util.Scanner;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        str = str.replaceAll("\\s", "");

        System.out.println("The new string is " + str);

    }

}
