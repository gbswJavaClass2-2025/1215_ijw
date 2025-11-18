package chap12.sec02.exam03;

public class PrintThread2 extends Thread {

    public void run() {

        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());

        // 스레드를 일시정지시켜 while문 빠져나가기
        try {
            while(true) {
                System.out.println("실행 중");
                Thread.sleep(1);
            }
        } catch(InterruptedException e) {
            // while문 빠져나감.
        }
        System.out.println("자원 정리");
        System.out.println("실행 종료");

        // interrupted() 메소드 사용하기
		/*
		while(true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) {
				break;
			}
		}
		*/
    }

}