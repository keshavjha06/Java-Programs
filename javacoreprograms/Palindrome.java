package javacoreprograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
System.out.println("Enter number");
int num= sc.nextInt();
int result=0;
while(num>0)
{
	
	result=result * 10 + num%10;
	num = num/10;
	}
	System.out.println("reverse of number is " +result);
	}

}
