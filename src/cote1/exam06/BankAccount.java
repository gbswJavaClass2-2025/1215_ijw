package cote1.exam06;

public class BankAccount {
    private String name;
    private String accountNumber;
    private int balance;
    private static int count;

    public BankAccount(String n, String a) {
        this.name = n;
        this.accountNumber = a;
        count++;
    }

    public BankAccount(String n, String a, int b) {
        this(n, a);
        this.balance = b;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int withdrawal(int amount) {
        if (amount > balance) { int tmp = balance; balance = 0; return tmp;}

        balance -= amount;
        return amount;
    }

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }

    public int getCount() {
        return count;
    }
}
