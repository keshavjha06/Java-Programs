package javacoreprograms;

import java.util.Scanner;

public class NaturalNumberSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int sum=0;
		int sum1=0;
		//1+2+3+4.......100
		for(int i=1;i<=num;i++)
		{
			sum = sum+i; //1+2+3
		}
		System.out.println("sum is " + sum);
		
//		System.out.println("...............");
//		
//		int k=1;
//		while(k<=num)
//		{
//           sum1= sum1+k;
//           k++;
//
//		}
//		System.out.println("sum is " + sum);
	}

}
