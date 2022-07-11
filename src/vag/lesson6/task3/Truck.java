package vag.lesson6.task3;

public class Truck extends Car {
    private int wheels;
    private int maxWeight;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    Truck(int w, String m, char c, float s, int wheels, int maxWeight) {
        super(w, m, c, s);
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }

    void newWheels(int wheels) {
        this.wheels = wheels;
        System.out.println("Количество колёс у грузовика " + this.wheels);
    }
}
