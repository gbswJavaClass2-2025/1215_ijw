package chap10.sec02.exam03;

public class CatchByExceptionKindExample {
    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = args[1];

            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);

            int result = value1 + value2;

            System.out.printf("%d + %d = %d", value1, value2, result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("where're ur params vro;;");
        } catch(NumberFormatException e) {
            System.out.println("can't convert it tho;;;");
        } finally {
            System.out.println("run it again vro RUN IT AGAIN");
        }
    }
}
