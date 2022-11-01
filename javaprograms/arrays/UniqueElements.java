package javaprograms.arrays;

import java.util.*;

public class UniqueElements {
    public static void main(String[] args) {
        // Make the two lists
        List<Integer> list1 = Arrays.asList(1, 3, 4, 5, 6, 92, 2, 56, 21);
        List<Integer> list2 = Arrays.asList(21, 6, 9, 51, 4, 8, 1);
        // Prepare a union
        Set<Integer> union = new HashSet<>(list1);
        union.addAll(list2);
        System.out.println(union);
        // Prepare an intersection
        Set<Integer> intersection = new HashSet<>(list1);
        intersection.retainAll(list2);
        System.out.println(intersection);
        // Subtract the intersection from the union
        union.removeAll(intersection);
        // Print the result
        for (Integer n : union) {
            System.out.print(n + " ");
        }

    }
}
