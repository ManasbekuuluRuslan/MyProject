import enums.Meal;
import enums.Status;

public class Client extends Person{
    private int balance;
    public Client(String fullName, BankAccount bankAccount,int balance) {
        super(Status.CLIENT, fullName, bankAccount);
        this.balance = balance;

    }
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void orderMeal(Meal meal, Chef chef){
        if(balance >= meal.getPrice()){
            balance -= meal.getPrice();
            chef.addMoneyToSalary(meal.getPrice());
        }else{
            System.out.println("Недостаточный баланс!");
        }

    }
}
