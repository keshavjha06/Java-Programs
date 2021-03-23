package javacoreprograms;

import java.util.Scanner;

public class RemoveSpecialChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Regular expression [^a-zA-z0-9]
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		String rev= "";
		
		str = str.replaceAll("[^a-zA-z0-9]","");
		System.out.println(str);
		
		

	}

}
