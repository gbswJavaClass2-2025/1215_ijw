package ex08.sec01.exam02;

abstract class Skill {
    String skillName;

    public Skill(String skillName) {
        this.skillName = skillName;
    }
    abstract void execute();
}