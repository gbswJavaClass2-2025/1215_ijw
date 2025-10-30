package cote1.exam07;

public class PartTimeEmployee extends Employee{
    public int hourlyRate;
    public int workHours;

    @Override
    public int calculatePay() {
        return hourlyRate * workHours;
    }
}
