package vag.lesson6.task1;

public class Employee extends Human {
    private String bankName;

    public Employee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void showInfo() {
        System.out.println("Работник банка  \""
                + bankName + "\" "
                + getName() + " "
                + getSurname() + ".");
            }
}
