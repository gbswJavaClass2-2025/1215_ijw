package chap04.sec01.exam03;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score = 75;

        if (score >= 90) {
            System.out.println("이럴수가... 점수가 너무 아름다우시군요.... 점수를 보고 그만... \"봇키\" 해버리고 말았습니다...");
        } else if (score >= 80) {
            System.out.println("좀 치네");
        } else if (score >= 70) {
            System.out.println("초등학생 때 받은 점수인거지?");
        } else {
            System.out.println("그러니까.... 아니다...");
        }
    }
}
