package vag.lesson6.task3;

public class Main {

    public static void main(String args[]) {
        Truck truck1 = new Truck(6564, "Volvo", 'с', 120, 8, 2355);
        truck1.outPut();
        truck1.newWheels(9);
    }
}