package chap05.sec02.exam09;

public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] v1 = {"java", "array", "copy"};
        String[] v2 = new String[5];

        System.arraycopy(v1, 0, v2, 0, v1.length);

        for (int i = 0; i < v2.length; i++) System.out.print(v2[i] + ", ");
    }
}
