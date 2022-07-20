package vag.lesson10;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        File file1 = new File("files1/10.2.txt");

        if (file1.exists()) {
            try (BufferedReader buff = new BufferedReader(new FileReader(file1))) {
                int i= buff.read();
                while (i != -1) {
                    System.out.print((char) i);
                    i= buff.read();
                }
            } catch (IOException e) {
                System.err.println("Error " + e.getMessage());
            }
        } else {
            System.err.println("\n File is not found");
        }

    }
}
