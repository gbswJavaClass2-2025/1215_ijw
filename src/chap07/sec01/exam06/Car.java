package chap07.sec01.exam06;

public class Car {
    public int speed;

    public void speedUp() {
        speed += 1;
    }

    public final void stop() { // 메서드에 쓰면 재정의 할 수 없음을 나타냄.
        System.out.println("차를 멈춤.");
        speed = 0;
    }
}
