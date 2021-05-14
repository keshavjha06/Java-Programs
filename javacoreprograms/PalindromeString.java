package javacoreprograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		String org_str = str;
		String rev= "";
		
		int len = str.length(); //4
		//str.charAt(0)
		for(int i=len-1;i>=0;i--) // 3 2 1 0
		{
			rev=rev+str.charAt(i); //DCBA
		}
		//System.out.println("Reversed string is " +rev);

if(org_str==str) //if(org_str.equals(str))

{
	System.out.println(org_str+" is a palindrome string");
}
else
{
	System.out.println(org_str+" is not a palindrome string");

}

		//StringBuffer is mutable class and String is immutable so we cannot use reverse function
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		 StringBuilder str1 = new StringBuilder(str);  
		 System.out.println(str1.reverse());
}
}
