package javacoreprograms;

import java.util.Scanner;

public class CountNumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num =123456;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int count=0;
		
		while(num>0)
		{
			num=num/10; //123 12 1 0
			count++;//1 2 3  4
		}
System.out.println("Number of digits " +count);
	}

}
