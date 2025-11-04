package ex08.sec01.exam02;

class AttackSkill extends Skill {
    int damage;
    public AttackSkill(String skillName, int damage) {
        super(skillName);
        this.damage = damage;
    }

    @Override
    void execute() {
        System.out.println("vro dealt " + damage + " damage using " + skillName + "🥀.");
    }
}

