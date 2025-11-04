package ex06.sec01.exam01;

public class SavingsAccount extends BankAccount{
    double profit;

    SavingsAccount(String num, String own, double pro) {
        super(num, own);
        this.profit = pro;
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
        System.out.printf("[입금] 금액: %,d 원 | 현재 잔액: %,d 원\n", amount, balance);
    }

    public void deposit(int amount, String reason, boolean i) {
        balance += amount;
        System.out.printf("[입금] 금액: %,d 원 (%s) | 현재 잔액: %,d 원\n", amount, reason, balance);
    }


    public String getAccountInfo() {
        return String.format("저축 계좌 정보: 계좌 번호: %s | 예금주: %s | 잔액: %,d 원 | 이율: %.1f%% (저축계좌)", number, name, balance, profit);
    }
}
