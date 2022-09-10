package javaprograms.BasicPrograms;

import java.util.Scanner;

public class FactorialRecursion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        System.out.println(multiplyNum(num));

    }

    public static int multiplyNum(int num) {
        if (num >= 1) {
            return num * multiplyNum(num - 1);

        } else {
            return 1;
        }
    }
}
