package chap06.sec04.exam06;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCal = new Calculator();

        double res1 = myCal.areaRectangle(10);
        double res2 = myCal.areaRectangle(10, 20);

        System.out.println("한 변의 길이가 10cm인 정사각형의 넓이: " + res1 + "cm^2");
        System.out.println("한 변의 길이가 10cm이고, 다른 한 변의 길이는 20cm인 정사각형의 넓이: " + res2 + "cm^2");
    }
}
