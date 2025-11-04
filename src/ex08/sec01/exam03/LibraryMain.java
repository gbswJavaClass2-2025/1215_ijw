package ex08.sec01.exam03;

public class LibraryMain {
    public static void main(String[] args) {
        Book bookA = new Book("자료구조", "홍길동");
        Magazine magA = new Magazine("코딩잡지", "이몽룡");

        Librarian lib1 = new Librarian(bookA);
        Librarian lib2 = new Librarian(magA);

        lib1.registerMaterial();
        lib1.loanMaterial();
        System.out.println("변환 성공1\n");

        lib2.registerMaterial();
        lib2.loanMaterial();
        System.out.println("변환 성공2");
    }
}
