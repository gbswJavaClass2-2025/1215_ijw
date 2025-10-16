package chap08.sec02.exam03;

public class VehicleExample {
    static void main() {
        Vehicle vehicle = new Bus();

        vehicle.run();
        // vehicle.checkFare(); <- 이동수단 인터페이스에는 요금 검사하는 부분에 대한 정의가 없음

        Bus bus = (Bus) vehicle;

        bus.run();
        bus.checkFare();// <- 버스에는 있음
    }
}
