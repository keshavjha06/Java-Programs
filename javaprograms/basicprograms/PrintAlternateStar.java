package javaprograms.basicprograms;

public class PrintAlternateStar {

    public static void main(String[] args) {

        String str = "Keshav";
        for (int i = 0; i <= str.length()-1; i++) {
            if (i % 2 == 0)
                System.out.print(str.charAt(i));
            else
                System.out.print("*");
        }
    }
}

