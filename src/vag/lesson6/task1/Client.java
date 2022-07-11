package vag.lesson6.task1;

public class Client extends Human {
    private String bankName;

    public String getBankName() {
        return bankName;
    }

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public void showInfo() {
        System.out.println("Клиент банка \""
                + bankName + "\" "
                + getName() + " "
                + getSurname() + ".");

    }
}

