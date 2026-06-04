package javaprograms.arrays;

import java.util.Arrays;

public class PrintArrayReverse {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        System.out.print("Array in reverse order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
