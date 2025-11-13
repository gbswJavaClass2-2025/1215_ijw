package chap10.sec02.exam04;

public class CatchOrderExample {
    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = args[1];

            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);

            int result = value1 + value2;

            System.out.printf("%d + %d = %d", value1, value2, result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("you didn't put your params vro.");
        } catch (Exception e) {
            System.out.printf("your code serve 0 purpose. you should reset your life now!: %s", e);
        } finally {
            System.out.println("idk how many times I should say ts.. but just re-run it vro.");
        }
    }
}
