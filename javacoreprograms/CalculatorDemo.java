package javacoreprograms;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		double firstNum = sc.nextDouble();
		double secondNum = sc.nextDouble();
		System.out.println("Enter an operator: (+, -, *, /):");
		char operator = sc.next().charAt(0);
	
		double result = 0;

		switch(operator) {
		case '+':
			result = firstNum + secondNum;
			break;
		case '-':
			result = firstNum - secondNum;
			break;
		case '*':
			result = firstNum * secondNum;
			break;
		case '/':
			result = firstNum / secondNum;
			break;
		
		}
		System.out.println(result);
		
		
		
	}
}

