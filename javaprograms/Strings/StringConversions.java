package javaprograms.Strings;

public class StringConversions {

    public static void main(String[] args) {
        // Replace the character 'O' with 't' from 2nd word i.e World
        String str = "Hello World";
        String[] words = str.split(" ");
        String newWord = words[1].replace("o", "t");
        System.out.println(words[0] + " " + newWord);

        // It will replace all non digits from String
        String s1 = "helloThisIsA1234Sample";
        s1 = s1.replaceAll("\\D", "");
        System.out.println("Only Number : " + s1);

        // It will replace all digits from String
        String s2 = "helloThisIsA1234Sample";
        s2 = s2.replaceAll("\\d", "");
        System.out.println("Only String : " + s2);

        // Convert int to String
        int i = 100;
        String s3 = Integer.toString(i);
        System.out.println("String value: " + s3);

        // Convert String to int
        String str1 = "100";
        int i1 = Integer.parseInt(str1);
        System.out.println("integer value: " + i1);

        // Convert String to int using valueOf
        int i2 = 1000;
        String str2 = String.valueOf(i2);
        System.out.println("integer value : " + str2);


    }

}
