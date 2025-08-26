package chap02.sec04.exam04;

public class QStopExample {
    public static void main(String[] args) throws Exception {
        int keyCode;

        while(true) {
            keyCode = System.in.read();
            if (keyCode == 113) break;

            System.out.println("keyCode: " + keyCode);
        }

        System.out.println("종료");
    }
}
