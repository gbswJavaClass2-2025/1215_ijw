package chap12.sec02.exam02;

public class StopFlagExample {
    public static void main(String[] args) {

        PrintThread1 printThread = new PrintThread1();
        printThread.start();

        // 메인 스레드 1초 정지
        try { Thread.sleep(1000); } catch(InterruptedException e) {}

        // printThread의 stop 필드 변경
        printThread.setStop(true);
    }

}