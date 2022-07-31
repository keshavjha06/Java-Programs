package javaprograms;

public class ArraySortDescending {

    public static void main(String[] args) {

        int[] a = {7, 5, 4, 8, 3};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int temp;

                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }

            }

            System.out.println(a[i]);

        }
    }

}
