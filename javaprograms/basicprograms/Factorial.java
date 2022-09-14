package javaprograms.basicprograms;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial");
        //int i = sc.nextInt();
        int fact = 1;
		/*while (i > 0) {
			factorial = factorial * i;
			i--;*/
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("factorial of given number is " + fact);
    }
}

