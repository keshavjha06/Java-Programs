package javacoreprograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using string concatenation operator
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		String rev= "";
		
		//int len = str.length(); //4
		//str.charAt(0)
		for(int i=str.length()-1;i>=0;i--) // 3 2 1 0
		{
			rev=rev+str.charAt(i); //DCBA
		}
		System.out.println("Reversed string is " +rev);
		
		// StringBuffer is mutable class and String is immutable so we cannot use reverse function
//	StringBuffer sb = new StringBuffer(str);
//	System.out.println(sb.reverse());
	}

}
