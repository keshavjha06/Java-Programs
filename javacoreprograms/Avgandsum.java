package javacoreprograms;

import java.util.Scanner;

public class Avgandsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a, b,sum;
float avg;

Scanner sc = new Scanner(System.in);
System.out.println("Enter first number");
a= sc.nextInt();
System.out.println("Enter second number");
b= sc.nextInt();

sum=a+b;
avg = (float)((a+b/2));
System.out.println("sum is "+sum);
System.out.println("avg is "+avg);

	
	}

}
