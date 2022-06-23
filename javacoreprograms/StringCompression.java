package javacoreprograms;

public class StringCompression {
    public static void main(String[] args) {
        String str = "AAAABBBCCDAA";
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1) {
                sb.append(str.charAt(i) + "" + count);
                break;
            }
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i) + "" + count);
                count = 1;

            }
        }
        System.out.println(sb.toString());
    }
}

       /* for(int i=0;i<str.length();i++){
            int count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            System.out.print(str.charAt(i));
            System.out.print(count);
        }
    }
}*/
