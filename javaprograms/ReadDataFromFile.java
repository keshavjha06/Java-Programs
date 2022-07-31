package javaprograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromFile {

    public static void main(String[] args) throws IOException {
        // Approach 1 : Using FileReader & BufferReader

       /* FileReader fr = new FileReader("/Users/keshav.jha/Desktop/yaml.txt");

        BufferedReader br = new BufferedReader(fr);

        String str;

        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();*/

        // 2nd approach : using Scanner & file

        File file = new File("/Users/keshav.jha/Desktop/yaml.txt");

        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        // Approach 3

      /*  sc.useDelimiter("\\Z");
        System.out.println(sc.next());*/

    }

}
