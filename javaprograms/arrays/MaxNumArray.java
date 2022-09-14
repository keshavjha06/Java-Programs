package javaprograms.arrays;

public class MaxNumArray {
    //print max numb from min num column
    //0 is the min num , so 4 is max number in that column
    public static void main(String[] args) {
        int[][] abc = {{2, 4, 5}, {3, 0, 7}, {1, 2, 9}};
        int min = abc[0][0];
        int mincolumn = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (abc[i][j] < min)//2 //>max for max number
                {
                    min = abc[i][j];
                    mincolumn = j;
                }
            }
        }
        int max = abc[0][mincolumn];
        int k = 0;
        while (k < 3) {
            if (abc[k][mincolumn] > max) {
                max = abc[k][mincolumn];
            }
            k++;
        }
        System.out.println(max);
    }
}
