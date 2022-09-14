package javaprograms.basicprograms;

import java.util.Scanner;

public class RemoveSpecialChars {

    public static void main(String[] args) {
        //Regular expression [^a-zA-z0-9]
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        str = str.replaceAll("[^a-zA-z0-9]", "");
        System.out.println(str);


    }

}
