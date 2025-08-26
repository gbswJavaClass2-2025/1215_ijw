package chap02.sec04.exam02;

public class KeyCodeExample {
    public static void main(String[] args) throws Exception{ // 예외 처리
        int keyCode;

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);
    }
}
