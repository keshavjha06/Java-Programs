package javacoreprograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int count=0;

		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
			}
			if(count==2)
			{
				System.out.println("Prime number");
			}
			else {
				System.out.println("Not a prime number");
			}
		}
		else {
			System.out.println("Not a prime number");
		}
	}

}*/

Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int num = sc.nextInt();

	boolean flag = false;

	for (int i = 2; i <= num / 2; i++) {
		if (num % i == 0) 
		{
			flag = true;
			break;
		}
	}

		if (!flag) {
			System.out.println(num + " is a prime number");
		}
		else {
			System.out.println(num + " is not a prime number");
		}
		
	}
}