class Account {
    private final String accountNumber;
    private double balance;

    Account(String accountNumber, double openingBalance) {
        if (openingBalance < 0) {
            throw new IllegalArgumentException("Opening balance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            throw new IllegalArgumentException("Invalid withdrawal");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

public class Main {
    public static void main(String[] args) {
        Account account = new Account("ACC1001", 5000);

        account.deposit(1500);
        account.withdraw(1000);

        System.out.println("Account: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
    }
}
