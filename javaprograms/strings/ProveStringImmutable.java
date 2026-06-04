package javaprograms.strings;

public class ProveStringImmutable {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2); // true

        s1 = s1.concat(" World"); // s1 = s1 + " World"
        System.out.println(s1 == s2); // false (new object created)
        System.out.println(s2); // "Hello" (unchanged)

    }
}
