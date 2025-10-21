package chap09.sec02.exam02;

public class AnonymousExample {
    static void main() {
        Anonymous anony = new Anonymous();

        anony.field.turnOn();

        anony.method1();

        anony.method2(
            new RemoteControl() {
                @Override
                public void turnOn() {
                    System.out.println("SmartTV를 켭니다.");
                }
                public void turnOff() {
                    System.out.println("SmartTV를 끕니다.");
                }
            }
        );
    }
}
