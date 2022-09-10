package javaprograms.Arrays;

import java.util.ArrayList;

public class UniqueNumber {

    public static void main(String[] args) {

        int[] a = {4, 5, 5, 5, 4, 6, 6, 9, 4};
        //print unique number from the list
        //5-3,6-2,4-2,9-1
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            int k = 0;

            if (!al.contains(a[i])) {
                al.add(a[i]);
                k++;

                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        k++;
                    }
                }
                System.out.println(a[i]);
                System.out.println(k);
                if (k == 1)
                    System.out.println(a[i] + " is a unique number");
            }

        }

    }

}
