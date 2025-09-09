package chap06.sec02.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        System.out.println("제작회사: " + myCar.company);
        System.out.println("모델명: " + myCar.model);
        System.out.println("색상: " + myCar.color);
        System.out.println("최고속력: " + myCar.maxSpeed);
        System.out.println("현재속력: " + myCar.speed);

        myCar.speed = 60;

        System.out.println("수정된 속도: " + myCar.speed);
    }
}
