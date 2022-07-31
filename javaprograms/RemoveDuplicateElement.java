package javaprograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateElement {

    public static void main(String[] args) {

        int[] a = {5, 2, 6, 8, 6, 7, 5, 2, 8};
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

        // adding elements to LinkedHashSet
        for (int i = 0; i < a.length; i++)
            set.add(a[i]);

        // Print the elements of LinkedHashSet
        System.out.print(set);
    }

}
