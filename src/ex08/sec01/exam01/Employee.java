package ex08.sec01.exam01;

public class Employee extends Person {
    double baseSalary;

    public Employee(String name, int id, double baseSalary) {
        super(name, id);
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public void work() {

    }
}