package chap04.sec01.exam05;

public class SwitchExample {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;

        switch(num) {
            case 1:
                System.out.println("Lesson 1.내게 묘한 기대는 하지마");
                break;

            case 2:
                System.out.println("Lesson 2는... 근육이 모르게");
                break;

            case 3:
                System.out.println("Lesson 3, 회전은 무한의 힘이다.");
                break;

            case 4:
                System.out.println("Lesson 4, 경의를 표하라");
                break;
            case 5:
                System.out.println("Lesson 5, 내게 항상 지름길은 돌아가는 길이였어…");
                break;

            default:
                System.out.println("결국 네트에 걸린 테니스 공은 어느 쪽으로 떨어질 지 아무도 알지 못해...");
                break;
        }
    }
}
