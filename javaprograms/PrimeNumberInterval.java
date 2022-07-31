package javaprograms;

import java.util.Scanner;

public class PrimeNumberInterval {


public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the lowest range");
	int num = sc.nextInt();

	System.out.println("Enter the highest range");
	int num1= sc.nextInt();

	while (num < num1) {
		boolean flag = false;

		for (int i = 2; i <=num / 2; i++) {
			if (num % i == 0) 
			{
				flag = true;
				break;
			}
		}

			if (!flag) {
				System.out.println(num + " ");
			}
			num++;

		}
	}
}

