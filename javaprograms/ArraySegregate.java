package javaprograms;

public class ArraySegregate {
    // function to segregate 0s and 1s
    static void segregate0and1(int[] arr, int n) {
        int count = 0; // counts the no of zeros in arr

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count++;
        }

        // loop fills the arr with 0 until count
        for (int i = 0; i < count; i++)
            arr[i] = 0;

        // loop fills remaining arr space with 1
        for (int i = count; i < n; i++)
            arr[i] = 1;
    }

    // driver function
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 1, 2, 0, 2, 2, 1};
        int n = arr.length;
        segregate0and1(arr, n);
        System.out.print("Array after segregation is ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");


    }
}
