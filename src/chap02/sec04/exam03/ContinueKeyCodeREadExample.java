package chap02.sec04.exam03;

public class ContinueKeyCodeREadExample {
    public static void main(String[] args) throws Exception {
        int keyCode;

        while(true) {
            keyCode = System.in.read();
            System.out.println("keyCode: " + keyCode);
        }
    }
}
