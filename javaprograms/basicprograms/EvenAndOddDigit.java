package javaprograms.basicprograms;

public class EvenAndOddDigit {
    public static void main(String[] args) {
        String num = "87530";
        int even_count = 0;
        int odd_count = 0;
        for (char c : num.toCharArray()) {
            int digit = Character.getNumericValue(c);
            // int digit = Integer.parseInt(String.valueOf(c));
            if (digit % 2 == 0) {
                even_count++;
            } else {
                odd_count++;
            }
        }
        System.out.println("even_count " + even_count);
        System.out.println("odd_count " + odd_count);
    }

}
