package ex08.sec01.exam02;

public class GameMain {
    public static void main(String[] args) {
        Warrior w1 = new Warrior("아레스");
        Warrior w2 = new Warrior("베오울프", 15);

        w1.useSpecialAbility();
        w2.useSpecialAbility();

        AttackSkill slash = new AttackSkill("Power Slash", 500);
        slash.execute();
    }
}
