package javacoreprograms;

import java.util.Scanner;

public class AvgAndSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        int sum = a + b;
        float avg = (float) ((a + b / 2));
        System.out.println("sum is " + sum);
        System.out.println("avg is " + avg);


    }

}
