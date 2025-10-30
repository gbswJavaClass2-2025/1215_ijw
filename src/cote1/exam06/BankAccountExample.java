package cote1.exam06;

public class BankAccountExample {
    static void main() {
        BankAccount a = new BankAccount("엄준식", "12345678");

        System.out.println(a.deposit(10000));
        System.out.println(a.withdrawal(5000));
        System.out.println(a.withdrawal(6000));
    }
}
