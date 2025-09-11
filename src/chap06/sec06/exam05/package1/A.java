package chap06.sec06.exam05.package1;

public class A {
    public int field1;
    int field2;
    private int field3;

    public A() { // < 클래스 내부일 경우 접근 제한자의 영향을 받지 않음
        field1 = 1;
        field2 = 1;
        field3 = 1;

        method1();
        method2();
        method3();
    }

    public void method1() {}
    void method2() {} // < default
    private void method3() {

    }
}
