package javaprograms.strings;

public class RemoveLeadingZeros {

    public static void main(String[] args) {
        String str1 = "00012345";
        String str2 = "0000";
        
        System.out.println("Original 1: " + str1);
        System.out.println("Leading zeros removed (Regex): " + removeLeadingZerosRegex(str1));
        System.out.println("Leading zeros removed (Manual): " + removeLeadingZerosManual(str1));
        
        System.out.println("\nOriginal 2: " + str2);
        System.out.println("Leading zeros removed (Regex): " + removeLeadingZerosRegex(str2));
        System.out.println("Leading zeros removed (Manual): " + removeLeadingZerosManual(str2));
    }
    
    // Approach 1: Regex
    public static String removeLeadingZerosRegex(String str) {
        String res = str.replaceFirst("^0+", "");
        return res.isEmpty() ? "0" : res;
    }
    
    // Approach 2: Manual traversal
    public static String removeLeadingZerosManual(String str) {
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0') {
            i++;
        }
        
        if (i == str.length()) {
            return "0";
        }
        return str.substring(i);
    }
}
