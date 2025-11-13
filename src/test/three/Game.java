package test.three;

public class Game {
    static void main() {
        AbstractMonster m1, m2;

        m1 = new Attacker();
        m2 = new Defender();

        m1.defense(m2.attack());
        m2.defense(m1.attack());

        System.out.printf("Attacker:%d\nDefender:%d\n", m1.hp, m2.hp);
    }
}
