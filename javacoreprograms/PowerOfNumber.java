package javacoreprograms;

import java.util.Scanner;

public class PowerOfNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        int base = sc.nextInt();

        System.out.println("Enter the exponent");
        int exponent = sc.nextInt();
        long result = 1;
        while (exponent != 0) {
            result = result * base;
            exponent--;
        }
        System.out.println(result);

        //System.out.println(Math.pow(base, exponent));

    }
}

