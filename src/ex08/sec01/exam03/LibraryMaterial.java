package ex08.sec01.exam03;

abstract class LibraryMaterial {
    String title;
    String author;

    public LibraryMaterial() {}
    public LibraryMaterial(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void registerMaterial();
    abstract void loanMaterial();
}
