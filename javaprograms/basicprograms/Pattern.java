package javaprograms.basicprograms;

/*no of lines = no of rows = no of times outer loop will run
 * identify for every row no,how many columns are there & type of elements in column
 * what do you need to print
 * Try to find the formula
 * */
public class Pattern {
    public static void main(String[] args) {
        pattern1(5);
        System.out.println("======================");
        pattern2(5);
        System.out.println("======================");
        pattern3(5);
        System.out.println("======================");
        pattern4(5);
        System.out.println("======================");
        pattern5(5);
        System.out.println("======================");
        pattern6(6);
        System.out.println("======================");
        pattern7(5);
        System.out.println("======================");
        pattern8(5);
        System.out.println("======================");
        pattern9(5);
        System.out.println("======================");
        pattern10(5);


    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row run the col
            {
                for (int col = 1; col <= row; col++)
                    System.out.print("* ");

            }
            //when one row is printed,we need to add a new line
            System.out.println();

        }

    }


    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            {
                for (int col = 1; col <= n; col++)
                    System.out.print("* ");

            }
            System.out.println();

        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            {
                for (int col = 1; col <= n - row + 1; col++)
                    System.out.print("* ");

            }
            System.out.println();

        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            {
                for (int col = 1; col <= row; col++)
                    System.out.print(col + " ");

            }
            System.out.println();

        }
    }

    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRows = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRows; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern6(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++)
                System.out.print("  ");
            for (int col = row; col >= 1; col--)
                System.out.print(col + " ");
            for (int col = 2; col <= row; col++)
                System.out.print(col + " ");
            System.out.println();

        }

    }

    static void pattern8(int n) {
        for (int row = 1; row <= 2 * n; row++) {

            int c = row > n ? 2 * n - row : row;

            for (int space = 0; space < n - c; space++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    static void pattern9(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    static void pattern10(int n){
        int num = 3;
        for(int row = 1;row<=n;row++){
            for(int col = 1;col < row;col++)
            {
                System.out.print(num+ " ");
                num = num + 3;
            }
            System.out.println();
        }
    }


}



