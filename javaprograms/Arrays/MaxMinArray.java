package javaprograms.Arrays;

import java.util.Arrays;

public class MaxMinArray {

    public static void main(String[] args) {

        int[] num = {50, 30, 40, 20, 60};

        int max = num[0]; //50
        int min = num[0];

        for (int i = 1; i < num.length; i++) //40
        {
            if (num[i] > max) //30>50
            {
                max = num[i]; //now 50 is max
            } else if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("given array is " + Arrays.toString(num));
        System.out.println("largest num is " + max);
        System.out.println("smallest num is " + min);

    }

}
