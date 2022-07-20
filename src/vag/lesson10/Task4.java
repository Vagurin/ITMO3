package vag.lesson10;

import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        File directory1 = new File("files1");
        File directory2 = new File("files4");
        File file1 = new File(directory1, "10.1.txt");
        File file2 = new File(directory2, "10.4.txt");
        directory2.mkdir();
        try {
            file2.createNewFile();
        } catch (IOException io) {
            io.printStackTrace();
        }
        try (FileInputStream fin1 = new FileInputStream(file1);
             FileOutputStream fos1 = new FileOutputStream(file2)) {
            byte[] buffer = new byte[fin1.available()];
            fin1.read(buffer);
            for (int i = 0; i < buffer.length; i++) {
                if (!Character.isLetterOrDigit((char) buffer[i]) && buffer[i] != 10 && buffer[i] != 13) {
                    buffer[i] = (byte) '$';
                }
            }
            fos1.write(buffer);
            System.out.println("Запись  завершена");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
