package ex08.sec01.exam03;

public class Magazine extends LibraryMaterial{
    public Magazine(String title, String author) {
        super(title, author);
    }

    @Override
    void registerMaterial() {
        System.out.println("정기 간행물 번호 등록");
    }
    @Override
    void loanMaterial() {
        System.out.println("최신호는 대여 불가");
    }
}
