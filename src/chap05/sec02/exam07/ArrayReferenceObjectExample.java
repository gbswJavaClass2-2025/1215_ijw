package chap05.sec02.exam07;

public class ArrayReferenceObjectExample {
    public static void main(String[] args) {
        String[] v1 = new String[3];
        v1[0] = "Java";
        v1[1] = "Java";
        v1[2] = new String("Java");

        System.out.println(v1[0] == v1[1]);
        System.out.println(v1[0] == v1[2]);
        System.out.println(v1[0].equals(v1[2]));

    }
}
