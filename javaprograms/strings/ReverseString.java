package javaprograms.strings;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse:");
        String str = sc.nextLine();
        
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed using custom loop: " + reversed);
        
        // Approach 2: StringBuilder.reverse()
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Reversed using StringBuilder: " + sb.reverse());
    }
}
