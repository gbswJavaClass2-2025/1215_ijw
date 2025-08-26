package chap04.sec01.exam02;

public class IfElseExample {
    public static void main(String[] args) {
        int score = 85;

        if (score >= 90) {
            System.out.println("다시 돌아왔군. 점수가 90보다 크다니, 다행이다.");
            System.out.println("'A'를 주마.");
        } else {
            System.out.println("넌 나가 그냥");
            System.out.println("아니 어케 90을 못 넘냐 ㅉㅉ..");
        }
    }
}
