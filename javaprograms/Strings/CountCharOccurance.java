package javaprograms.Strings;

import java.util.Scanner;

public class CountCharOccurance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        int totalCount = str.length(); //total length

        int totalCountAfterRemove = str.replace("a", "").length(); //total length after removing a's

        int count = totalCount - totalCountAfterRemove;

        System.out.println("no of occurrences of a is " + count);

    }

}
