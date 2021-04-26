package javacoreprograms;

import java.util.HashMap;
import java.util.Scanner;

public class CountCharsAndDigits {
	//Count Uppercase, LowerCase, Digits and other characters in String  

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		 int upperCase = 0; 
		 int lowerCase = 0; 
		 int digits = 0; 
		 int other = 0;
		 for (int i = 0; i < str.length(); i++) 
		 { 
		 char ch = str.charAt(i); 
		 if (Character.isUpperCase(ch)) 
		 { 
		 upperCase++; 
		 } 
		 else if (Character.isLowerCase(ch)) 
		 {  lowerCase++; 
		 } 
		 else if (Character.isDigit(ch)) 
		 { 
		 digits++; 
		 } else 
		 { 
		 other++; 
		 } 
		 } 
		 System.out.println("Upper case letters: " + upperCase);  
		 System.out.println("Lower case letters: " + lowerCase);  
		 System.out.println("Digits : " + digits); 
		 System.out.println("Other letters: " + other); 

		
	}

}
