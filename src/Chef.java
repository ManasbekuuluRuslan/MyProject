import enums.Status;

public class Chef extends Person{
    private int salary;

    public Chef(String fullName, BankAccount bankAccount, int salary) {
        super(Status.CHEF, fullName, bankAccount);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void addMoneyToSalary(int som){
        this.salary += som;
    }
}
