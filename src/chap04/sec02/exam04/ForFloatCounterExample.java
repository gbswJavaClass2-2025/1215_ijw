package chap04.sec02.exam04;

public class ForFloatCounterExample {
    public static void main(String[] args) {
        for (float x = 0.1f; x <= 1.0f; x += 0.1f) { // 정확하게 표현이 안됨. 0.9000001 까지...
            System.out.println(x);
        }
    }
}
