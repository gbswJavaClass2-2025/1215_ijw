package chap05.sec02.exam10;

public class AdvancedForExample {
    public static void main(String[] args) {
        int[] v1 = {95, 71, 84, 93, 87};

        int sum = 0;

        for (int score : v1) sum += score;

        System.out.println("점수 총합= " + sum);

        double avg = (double) sum / v1.length;
        System.out.println("평균= " + avg);
    }
}
