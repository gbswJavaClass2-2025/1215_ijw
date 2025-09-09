package chap06.sec03.exam04;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;
    // 공통된 부분은 제거.
    // 한 틀을 다른 틀이 조정하여 사용하게 만들기

    Car() {
    }

    Car(String model) {
        this(model, "은색", 250);
    }

    Car(String model, String color) {
        this(model, color, 250);
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
