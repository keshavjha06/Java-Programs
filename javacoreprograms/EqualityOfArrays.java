package javacoreprograms;

import java.util.Arrays;

public class EqualityOfArrays {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 3, 4};

        boolean flag = Arrays.equals(a, b);
        if (flag == true) {
            System.out.println("Arrays are equal");
        } else {

            System.out.println("Arrays are not equal");

        }

        // Approach2

        boolean status = true;
        if (a.length == b.length) {
            // compare rest of elements

            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    status = false;
                }

            }

        } else {
            status = false;
        }
        if (status == true) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

    }

}
