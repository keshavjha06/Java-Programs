package javacoreprograms;

import java.util.Scanner;

public class AlphabetCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char c = sc.next().charAt(0);

		if ((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z'))

		{
			System.out.println("entered character is alphabet");
		} else {
			System.out.println("entered character is not an alphabet");

		}

	}

}
