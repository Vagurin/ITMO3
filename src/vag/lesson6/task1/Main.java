package vag.lesson6.task1;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Alex", "Vagurin", "Sber");
        Employee employee = new Employee("Sveta", "Shevkunova", "VTB");

        getInfo(client);
        getInfo(employee);
    }

    public static void getInfo(Info info) {
        info.showInfo();
    }
}

