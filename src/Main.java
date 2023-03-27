import enums.Meal;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            BankAccount chefBankAccount = new BankAccount("Mbank");
            Chef chef = new Chef("Marat", chefBankAccount, 2000);

            BankAccount clientBankAccount = new BankAccount("СберБанк");
            Client client = new Client("Aizirek", clientBankAccount, 1200);

            System.out.println("Client: " + client.getFullName() + ", Balance: " + client.getBalance());
            while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("--- Menu ---");
            for (Meal meal : Meal.values()) {
                System.out.println(meal.name() + " - " + meal.getPrice() + "$");

            }
            System.out.println("Enter menu choice: ");
            String menu = scanner.nextLine();
            Meal m = Meal.valueOf(menu.toUpperCase());
            client.orderMeal(m, chef);

            System.out.println("Client: " + client.getFullName() + " account balance: " + client.getBalance() + "$");
            System.out.println("Chef: " + chef.getFullName() + " salary: " + chef.getSalary() + "$");
        }
    }
}