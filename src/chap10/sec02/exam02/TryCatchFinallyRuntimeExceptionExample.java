package chap10.sec02.exam02;

public class TryCatchFinallyRuntimeExceptionExample {
    public static void main(String[] args) {
        String data1 = null;
        String data2 = null;

        try {
            data1 = args[0];
            data2 = args[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("just set your parameters vro;;;🥀🥀🥀");
            return;
        }

        try {
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.printf("%d + %d = %d\n", value1, value2, result);
        } catch (NumberFormatException e) {
            System.out.println("we can't convert it into nums vro;;;🥀");
        } finally {
            System.out.println("get tf out of here vro plz;;;🥀");
        }
    }
}
