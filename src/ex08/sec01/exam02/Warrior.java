package ex08.sec01.exam02;

class Warrior extends Character {
    public Warrior(String name) {
        super(name, 1);
    }
    public Warrior(String name, int level) {
        super(name, level);
    }

    @Override
    void useSpecialAbility() {
        System.out.println("Charge!");
    }
}

