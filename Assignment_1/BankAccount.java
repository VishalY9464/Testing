import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Invalid deposit amount");
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount > balance)
            throw new IllegalArgumentException("Insufficient balance");
        balance -= amount;
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class BankManagementSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        BankAccount account = new BankAccount(name, 0);

        try {
            account.deposit(5000);
            account.withdraw(2000);
            account.displayBalance();
            account.displayAccountDetails();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
