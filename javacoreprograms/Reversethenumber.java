package javacoreprograms;

import java.util.Scanner;

public class Reversethenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();// 1234 4321
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10; // 0*10+1234%10=4 4*10=40+3=43 430+2=432 4320+1=4321
			num = num / 10; // 1234/10=123 123/10=12 12/10=1 1/10=0
		}

		System.out.println("reverse number is :" + rev);

//using stringbuffer class
//StringBuffer sb = new StringBuffer(String.valueOf(num));
//StringBuffer rev=sb.reverse();
//System.out.println("reverse number is :"+ rev);

		// using string builder

//StringBuilder sb1 = new StringBuilder();
//sb1.append(num);
//StringBuilder rev1=sb1.reverse();
//System.out.println("reverse number is :"+ rev1);
	}
}
