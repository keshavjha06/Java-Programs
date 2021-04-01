package javacoreprograms;

import java.util.Scanner;

public class Swaptwonumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();

		int t = a;// 10
		a = b; // 20
		b = t; // 10
//		
//		a = a^b;
//		b = a^b;
//		a = a^b;
//			
		System.out.println("After swapping values are " + a + " " + b);

//a = a+b;//30  a=a*b;
//b = a-b;//10  b=a/b
//a = a-b;//20  a=a/b
//System.out.println("a is " +a);
//System.out.println("b is "+b);


	
	}

}
