package chap12.sec02.exam02;

public class PrintThread1 extends Thread {

    // while문에 넣을 boolean stop 변수 선언
    private boolean stop;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public void run() {
        // while문 무한 반복
        while(!stop) { //
            System.out.println("실행 중");
        }
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }

}