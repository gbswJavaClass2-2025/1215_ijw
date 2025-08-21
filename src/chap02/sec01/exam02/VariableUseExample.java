package chap02.sec01.exam02;

public class VariableUseExample {
    public static void main(String[] args) {
        int tot = 185;
        int hour = tot / 60;
        int minute = tot % 60;

        // 예외 처리 안 해놓음(실제로 입력받는 게 아니라서)

        System.out.println(hour + "시간 " + minute + "분");

        System.out.println("총 " + tot + "분");
    }
}
