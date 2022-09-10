package javaprograms.BasicPrograms;

import java.util.Scanner;

public class NaturalNumberSumRecursion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int sum = addNum(num);
        System.out.println("sum is " + sum);

    }

    public static int addNum(int num) {
        if (num != 0) {
            return num + addNum(num - 1);

        } else {
            return num;
        }

    }
}
