package chap02.sec03.exam02;

public class CastingExample {
    public static void main(String[] args) {
        int intValue = 44032;
        char charVlaue = (char) intValue;

        System.out.println(charVlaue);

        long longValue = 500;
        intValue = (int) longValue;

        System.out.println(longValue);

        double doubleValue = 3.14;
        intValue = (int) doubleValue;

        System.out.println(intValue);
    }
}
