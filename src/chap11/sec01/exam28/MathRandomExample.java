package chap11.sec01.exam28;

public class MathRandomExample {
    static void main() {
        int num = (int) (Math.random()*6)+1;
        System.out.println("주사위 눈: " + num);
    }
}
