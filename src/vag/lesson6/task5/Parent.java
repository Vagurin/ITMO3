package vag.lesson6.task5;

import java.util.Scanner;

public class Parent {
    Scanner scanner = new Scanner(System.in);
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printUserInfo() {
        this.age = scanner.nextInt();
    }
}

