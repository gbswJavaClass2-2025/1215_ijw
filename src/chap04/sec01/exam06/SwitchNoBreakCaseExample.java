package chap04.sec01.exam06;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        int time = (int) (Math.random() * 4) + 8;

        switch(time) {
            case 8:
                System.out.println("Lesson 1.내게 묘한 기대는 하지마");

            case 9:
                System.out.println("Lesson 2는... 근육이 모르게");

            case 10:
                System.out.println("Lesson 3, 회전은 무한의 힘이다.");

            default:
                System.out.println("Lesson 4, 경의를 표하라");

        }
    }
}
