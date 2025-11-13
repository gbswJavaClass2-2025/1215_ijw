package chap10.sec01.exam04;

public class NumberFormatExceptionExample {
    static void main(String[] args) {
        String data1 = "100";
        String data2 = "a100";

        try {
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.printf("%d + %d = %d\n", data1, data2, result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
