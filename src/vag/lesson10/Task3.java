package vag.lesson10;

import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        File directory1 = new File("files1");
        File directory2 = new File("files2");
        File directory3 = new File("files3");
        File file1 = new File(directory1, "10.1.txt");
        File file2 = new File(directory2, "10.2.txt");
        File file3 = new File(directory3, "10.3.txt");
        directory3.mkdir();
        try {
            file3.createNewFile();
        } catch (IOException io) {
            System.err.println("Error " + io.getMessage());
        }
        try (FileInputStream inputStream1 = new FileInputStream(file1);
             FileInputStream inputStream2 = new FileInputStream(file2);
             FileOutputStream outputStream1 = new FileOutputStream(file3, true);
             FileOutputStream outputStream2 = new FileOutputStream(file3, true)) {

            byte[] buffer1 = new byte[inputStream1.available()];
            byte[] buffer2 = new byte[inputStream2.available()];

            outputStream1.write(buffer1);
            System.out.println("Запись в файл 1 завершена");
            outputStream2.write(buffer2);
            System.out.println("Запись в файл 2 завершена");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

