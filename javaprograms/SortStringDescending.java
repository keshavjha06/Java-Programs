package javaprograms;

import java.util.Arrays;

public class SortStringDescending {

    static void reverse(char[] a) {
        int i, n = a.length;
        char temp;
        for (i = 0; i < n / 2; i++) {
            temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
    }

    // Driver code
    public static void main(String[] args) {
        char[] s = "azcazdado".toCharArray();
        Arrays.sort(s);
        reverse(s);// function call
        System.out.println(s);
    }
}
