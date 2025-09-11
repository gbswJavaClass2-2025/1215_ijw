package chap06.sec06.exam04.package1;

public class A {
    A a1 = new A(true); // (o)
    A a2 = new A(1); // (o)
    A a3 = new A("문자열"); // (o

    public A(boolean b) {} // < 모든 패키지에서 아무런 제한 없이 접근가능
    A(int b) {} // default < 접근 제한은 같은 패키지 안에서 아무런 제한 없이 생성자를 호출할 수 있으나, 다른 패키지에선 못함
    private A(String s) {} // < 동일한 패키지이건, 다른 패키지이건 상관없이 이 클래스 내부에서만 생성자 호출 가능하고 객체를 만듦
}
