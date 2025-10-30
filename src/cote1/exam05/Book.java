package cote1.exam05;

public class Book {
    public String title;
    public String author;
    public int price;
    public int isbn; // 이거 책 안 보는 사람이면 어케 아는...;;

    // 1회 지정 후 변경이 가능하단 내용이 없으므로 final private이 맞다 ㅇㅇ

    public Book(String t, String a, int i) {
        this.title = t;
        this.author = a;
        this.isbn = i;
    }
    public Book(String t, String a, int p, int i) {
        this.title = t;
        this.author = a;
        this.price = p;
        this.isbn = i;
    }
}
