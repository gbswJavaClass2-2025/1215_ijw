package ex08.sec01.exam01;

public class HospitalMain {
    static void main() {
        Person doc1 = new Doctor("홍길동", 111); // 기본급 7000
        Person doc2 = new Doctor("김유신", 222, 9000); // 지정급 9000

        doc1.work();
        doc2.work();
        System.out.println("급여: " + ((Doctor)doc1).calculateSalary());
        System.out.println("급여: " + ((Doctor)doc2).calculateSalary());
    }
}
