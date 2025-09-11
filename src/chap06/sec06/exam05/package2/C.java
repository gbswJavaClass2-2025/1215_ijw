package chap06.sec06.exam05.package2;

import chap06.sec06.exam05.package1.A;

public class C {
    public C() {
        A a = new A();
        a.field1 = 1;
        //a.field2 = 1; < default 접근 X
        // a.field3 = 1; < private 접근 X

        a.method1();
        //a.method2(); 이유는 위와 각각 같음
        //a.method3();
    }
}
