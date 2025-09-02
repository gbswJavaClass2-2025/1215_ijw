package chap05.sec02.exam06;

public class ArrayInArrayExample {
    public static void main(String[] args) {
        int[][] v1 = new int[2][3];

        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v1[i].length; j++) {
                System.out.println("v1[" + i + "][" + j + "]=" + v1[i][j]);
            }
        }

        System.out.println();

        int[][] v2 = new int[2][];
        v2[0] = new int[2];
        v2[1] = new int[3];

        for (int i = 0; i < v2.length; i++) {
            for (int j = 0; j < v2[i].length; j++) {
                System.out.println("v2[" + i + "][" + j + "]=" + v2[i][j]);
            }
        }

        System.out.println();

        int[][] v3 = {{95, 80}, {92, 96, 80}};

        for (int i = 0; i < v3.length; i++) {
            for (int j = 0; j < v3[i].length; j++) {
                System.out.println("v3[" + i + "][" + j + "]=" + v3[i][j]);
            }
        }
    }
}
