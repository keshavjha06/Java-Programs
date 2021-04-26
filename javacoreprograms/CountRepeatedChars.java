package javacoreprograms;

import java.util.HashMap;
import java.util.Scanner;

public class CountRepeatedChars {
	//count each character/ find duplicate/repeated characters in String

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		 //Create HashMap containing char as a key and occurrences as value  
		HashMap<Character, Integer> charCountMap = new HashMap<Character,  Integer>(); 
		 //Converting given string to char array 
		 char[] chArr = str.toCharArray(); 
		 //Checking each char of strArray 
		 for (char ch : chArr) { 
		 if (charCountMap.containsKey(ch)) { 
		  
		 // If char is present in charCountMap,  
		 // incrementing it's count by 1 
		 charCountMap.put(ch, charCountMap.get(ch) + 1);   
		 } 
		 else 
		 { 
		  
		 //If char is not present in charCountMap,  //putting this char to charCountMap with 1 as it's value  
			 charCountMap.put(ch, 1); 
		 } 
		 } 
		 System.out.println(charCountMap); 

	}

}
