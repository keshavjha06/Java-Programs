package javaprograms;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21......

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int f1, f2 = 0, f3 = 1;
        for (int i = 1; i <= num; i++) {
            System.out.println(f3);
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;

        }
    }
}
