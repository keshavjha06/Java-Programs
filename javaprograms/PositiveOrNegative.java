package javaprograms;

import java.util.Scanner;

public class PositiveOrNegative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        double num = sc.nextDouble();
        if (num > 0.0) {
            System.out.println(num + " is positive number");
        } else if (num < 0.0) {
            System.out.println(num + " is negative number");
        } else {
            System.out.println(num + " is zero");
        }
    }

}


