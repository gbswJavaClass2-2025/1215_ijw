package ex06.sec01.exam01;

public class BankAccount {
    String number, name;
    int balance;

    BankAccount(String number, String owner) {
        this.number = number;
        this.name = owner;
        this.balance = 0;
        System.out.printf(">> BankAccount 객체 생성: %s님 계좌(%s) 개설.\n", owner, number);
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.printf("[입금] 금액: %,d원 | 현재 잔액: %,d 원\n", amount, balance);
    }

    public void deposit(int amount, String reason) {
        // deposit(amount);
        balance += amount;
        System.out.printf("[입금] 금액: %,d원 (%s) | 현재 잔액: %,d 원\n", amount, reason, balance);
    }

    public String getAccountInfo() {
        return String.format("일반 계좌 정보: 계좌 번호: %s | 예금주: %s | 잔액: %,d 원", number, name, balance);
    }
}
