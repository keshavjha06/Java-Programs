package javaprograms.BasicPrograms;

import java.util.Scanner;

public class SumOfItsDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10; //4+3
            num = num / 10; //123   12
        }
        System.out.println("sum of digits in a number is " + sum);

    }
}
