package ex08.sec01.exam03;

public class Book extends LibraryMaterial{
    int publishedYear;

    public Book(String title, String author) {
        super(title, author);
        this.publishedYear = 2024;
    }
    public Book(String title, String author, int publishedYear) {
        super(title, author);
        this.publishedYear = publishedYear;
    }

    @Override
    void registerMaterial() {
        System.out.println("ISBN 등록");
    }
    @Override
    void loanMaterial() {
        System.out.println("일반 도서 대여 완료");
    }
}
