package javaprograms;

import java.util.HashSet;

public class DuplicateElementsArray {

    public static void main(String[] args) {

        String[] a = {"java", "python", "C", "Ruby", "java"};
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == (a[j])) {
                    System.out.println("Duplicate element is " + a[i]);
                    flag = true;
                }
            }
        }
        if (!flag) {
            System.out.println("Duplicate element not found");
        }

        //2nd approach
       /* String[] arr = {"java", "python", "C", "Ruby", "java"};

        HashSet<String> langs = new HashSet<>();

        boolean flag = false;
        for (String str : arr) {
            if (!langs.add(str)) {
                System.out.println("Duplicate element is " + str);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Duplicate element not found");
        }
*/
    }
}
