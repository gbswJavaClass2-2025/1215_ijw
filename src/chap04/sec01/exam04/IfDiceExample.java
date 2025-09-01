package chap04.sec01.exam04;

public class IfDiceExample {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;

        if (num == 1) {
            System.out.println("Lesson 1.내게 묘한 기대는 하지마");
        } else if (num == 2) {
            System.out.println("Lesson 2는... 근육이 모르게");
        } else if (num == 3) {
            System.out.println("Lesson 3, 회전은 무한의 힘이다.");
        } else if (num == 4) {
            System.out.println("Lesson 4, 경의를 표하라");
        } else if (num == 5) {
            System.out.println("Lesson 5, 내게 항상 지름길은 돌아가는 길이였어…");
        } else {
            System.out.println("결국 네트에 걸린 테니스 공은 어느 쪽으로 떨어질 지 아무도 알지 못해...");
        }
    }
}
