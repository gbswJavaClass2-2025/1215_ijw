package cote1.exam07;

public class FullTimeEmployee extends Employee{
    public int annualSalary;

    @Override
    public int calculatePay() {
        return annualSalary;
    }
}
