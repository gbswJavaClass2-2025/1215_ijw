package test.three;

abstract class AbstractMonster {
    protected String name;
    protected int hp;
    protected int attack;
    protected int defense;

    protected AbstractMonster(String name, int hp, int attack, int defense) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    public boolean defense(int attack) {
        if (this.defense > attack) return false;
        else {
            hp -= attack;
            return true;
        }
    }

    abstract int attack();
}
