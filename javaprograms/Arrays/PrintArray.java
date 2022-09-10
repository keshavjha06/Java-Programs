package javaprograms.Arrays;

import java.util.Arrays;

public class PrintArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        for (int element : array)
            System.out.print(element + " ");
        System.out.println(Arrays.toString(array));

        //print 2d array
        int[][] arr = {{1, 2}, {3, 4}, {5, 6, 7}};
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");

        for (int[] ints : arr)
            for (int j = 0; j < ints.length; j++)
                System.out.print(ints[j] + " ");
        System.out.println(Arrays.deepToString(arr));
    }


}
