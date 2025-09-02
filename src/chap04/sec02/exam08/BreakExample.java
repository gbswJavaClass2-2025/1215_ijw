package chap04.sec02.exam08;

public class BreakExample {
    public static void main(String[] args) {
        while (true) {
            int num = (int) (Math.random() * 6) + 1; // 1 ~ 6까지(0~5 + 1)

            System.out.println(num);

            if (num == 6) break;

            System.out.println("프로그램 종료");
        }
    }
}
