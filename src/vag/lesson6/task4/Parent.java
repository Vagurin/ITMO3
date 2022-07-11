package vag.lesson6.task4;

import java.util.Scanner;

public class Parent {
    Scanner scanner = new Scanner(System.in);
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber() {
        this.number = scanner.nextInt();
    }
}
