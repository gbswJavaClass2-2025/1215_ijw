package ex08.sec01.exam02;

abstract class Character {
    String name;
    int level;

    public Character(String name, int level) {
        this.name = name;
        this.level = level;
    }
    abstract void useSpecialAbility();
}
