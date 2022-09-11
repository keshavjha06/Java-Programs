package javaprograms.Arrays;

import java.util.Arrays;

public class NegativeFirst {
    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int n = arr.length;
        move(arr,n);

    }

    static void move(int[] arr, int n) {
       /* Arrays.sort(arr);
        for(int i : arr)
            System.out.println(i+ " ");*/
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
