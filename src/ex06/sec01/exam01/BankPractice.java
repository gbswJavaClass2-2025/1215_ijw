package ex06.sec01.exam01;

public class BankPractice {
    static void main(String[] args) {
        System.out.println("----- 은행 계좌 시스템 실습 시작 -----");

        // 객체 생성
        BankAccount account1 = new BankAccount("100-01-123456", "김철수");
        SavingsAccount account2 = new SavingsAccount("200-02-789012", "이영희", 2.5);

        System.out.println("\n------------------------------------\n");
        System.out.println("[정보 출력]");
        System.out.println(account1.getAccountInfo());
        System.out.println(account2.getAccountInfo());
        System.out.println("\n------------------------------------\n");
        System.out.println("[입금 기능]\n");

        // 계좌 거래 (오버로딩 각각 개시)
        System.out.println("--- 김철수님 일반 계좌 ---");
        account1.deposit(100000);
        account1.deposit(50000, "월급으로부터");

        System.out.println("\n--- 이영희님 저축 계좌 ---");
        account2.deposit(50000, "초기 납입금", true);
        account2.deposit(20000);
        account2.deposit(15000, "용돈으로부터");
        System.out.println("\n----- 실습 종료 -----");
    }
}
