package javacoreprograms;

public class PrintAlternateStar {

    public static void main(String[] args) {

        String str = "Keshav";
        for (int i = 1; i < str.length(); i++) {
            //System.out.print(str);

            if (i % 2 == 0) {
                System.out.println("*");
            }


        }
    }

}
