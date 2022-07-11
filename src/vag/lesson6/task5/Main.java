package vag.lesson6.task5;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.printUserInfo();
        System.out.println(parent.getAge());
        Child child = new Child();
        child.printUserInfo();
        System.out.println(child.getUserName());
    }
}
