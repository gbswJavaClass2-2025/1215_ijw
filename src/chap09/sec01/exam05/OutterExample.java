package chap09.sec01.exam05;

public class OutterExample {
    static void main() {
        Outter outter = new Outter();
        Outter.Nested nested = outter.new Nested();
        nested.print();
    }
}
