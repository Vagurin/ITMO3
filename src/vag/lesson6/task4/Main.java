package vag.lesson6.task4;

public class Main {
    public static void main(String[] args) {
        Child childClass = new Child();
        childClass.setNumber();
        System.out.println(childClass.getNumber() + "  целое число из родительского класса первоначально");
        childClass.getParentNumber();
    }
}
