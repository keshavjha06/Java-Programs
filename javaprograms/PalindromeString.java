package javaprograms;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) // 3 2 1 0
        {
            rev = rev + str.charAt(i); //DCBA
        }
        //System.out.println("Reversed string is " +rev);
        if (str.equals(rev)) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");

        }

        //StringBuffer is mutable class and String is immutable so we cannot use reverse function
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		 StringBuilder str1 = new StringBuilder(str);  
		 System.out.println(str1.reverse());
    }
}
