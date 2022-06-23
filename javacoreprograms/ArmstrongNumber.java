package javacoreprograms;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        //153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int actualNum = num;
        double result = 0;
        while (actualNum != 0) {
            int n = actualNum % 10;
            result = result + Math.pow(n, 3);
            actualNum = actualNum / 10;

        }
        if (result == num) {
            System.out.println(num + " is a armstrong number");
        } else {
            System.out.println(num + " is not a armstrong number");

        }
    }

}
