package ex08.sec01.exam01;

class Nurse extends Employee {
    public Nurse(String name, int id, double baseSalary) {
        super(name, id, baseSalary);
    }

    @Override
    public void work() {
        System.out.println("환자를 돌봅니다.");
    }
}