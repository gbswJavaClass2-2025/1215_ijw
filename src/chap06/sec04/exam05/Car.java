package chap06.sec04.exam05;

public class Car {
    int speed;

    int getSpeed() {
        return speed;
    }

    void keyTurnOn() { // 키 턴 온 이러네;; 이건 어느나라 말이냐 크흛 큘ㄹㅂㄹ븧ㅂㅎ븧ㅂㅂ훏흐틐헙ㄹ 트흡ㅎ 붉
        System.out.println("키를 돌립니다.");
    }

    void run() {
        for (int i = 10; i <= 50; i+=10) {
            speed = i;
            System.out.println("달린다!!!( 시속: " + speed + "km/h )");
        }
    }
}
