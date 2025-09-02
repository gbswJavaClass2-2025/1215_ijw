package chap05.sec02.exam08;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int[] v1 = {1,2,3};
        int[] v2 = new int[5];

        for (int i = 0; i < v1.length; i++) {
            v2[i] = v1[i];
        }
        for (int i = 0; i < v2.length; i++) System.out.print(v2[i] + ", ");
    }
}
