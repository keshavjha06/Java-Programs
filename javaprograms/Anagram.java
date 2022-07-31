package javaprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String x = sc.nextLine();
        System.out.println("Enter the second string");
        String y = sc.nextLine();
        x = x.replace(" ", "").toLowerCase();
        y = y.replace(" ", "").toLowerCase();

        char a[] = x.toCharArray();
        char b[] = y.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        boolean flag = Arrays.equals(a, b);
        if (flag == true) {
            System.out.println("String are anagram");
        } else {
            System.out.println("String are not anagram");
        }

    }

}
