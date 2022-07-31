package javaprograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataFromFile {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("/Users/keshav.jha/Downloads/Test.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Selenium with Java");
        bw.write("Selenium with Python");
        bw.write("Selenium with C#");

        System.out.println("Finished");

        bw.close();

    }

}
