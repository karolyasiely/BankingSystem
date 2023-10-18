import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private boolean active; // Added field to track account status

    private static List<BankAccount> allAccounts = new ArrayList<>(); // A list to store all bank accounts

    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.active = true; // New accounts are active by default
        allAccounts.add(this); // Add the account to the list
    }

    public String deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return "Deposited $" + amount + ". New balance: $" + balance;
        } else {
            return "Invalid deposit amount.";
        }
    }

    public String withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return "Withdrew $" + amount + ". New balance: $" + balance;
        } else {
            return "Invalid withdrawal amount or insufficient funds.";
        }
    }

    public String getBalance() {
        return "Account balance for " + accountHolder + ": $" + balance;
    }

    public void deleteAccount() {
        active = false;
        allAccounts.remove(this); // Remove the account from the list
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + "\nAccount Holder: " + accountHolder + "\nBalance: $" + balance;
    }

    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.print("Enter the account number: ");
        String accountNumber = info.next();
        info.nextLine(); // Consume newline
        
        System.out.print("Enter the account holder's name: ");
        String accountHolder = info.nextLine();
        BankAccount account = new BankAccount(accountNumber, accountHolder);
        System.out.println("");
        System.out.println("Account created successfully!");
        System.out.println(account);
        
    }
}
