package vag.lesson11;
import java.io.*;

public class Task3 {
    public static final Object car = new Object();
    public static  String bmw ="bmw";
    public static  String audi ="audi";
    public static String currentString = "bmw";


    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (car) {
                for (int i = 0; i < 10; i++) {
                    try {
                        while (!currentString.equals(bmw)) {
                            car.wait();
                        }
                    }catch(InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(bmw);
                        currentString = audi;
                        car.notifyAll();
                    }
                }
            }).start();
        }
    }
