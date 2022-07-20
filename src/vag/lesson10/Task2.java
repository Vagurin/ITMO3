package vag.lesson10;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        File directory = new File("files2");
        File file1 = new File(directory, "10.2.txt");
        if (file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                System.err.println("Error " + e.getMessage());
            }
            String string = "Summer 2022!";
            try (FileOutputStream outputStream = new FileOutputStream(file1)) {
                byte[] buffer = string.getBytes();
                outputStream.write(buffer);
                System.out.println("Запись завершена");
            } catch (IOException io) {
                System.err.println(io.getMessage());
            }
        } else {
            System.err.println("\n File is not found");
        }
    }
}