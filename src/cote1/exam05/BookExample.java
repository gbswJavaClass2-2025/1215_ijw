package cote1.exam05;

public class BookExample {
    static void main() {
        Book[] a = new Book[3];

        String[] name = {"주술회전1", "주술회전2", "주술회전3"};
        String author = "아쿠타미 게게";
        int[] isbn = {1234, 2345, 3456};
        int[] price = {1000, 2000, 3000};

        for (int i = 0; i < 3; i++) {
            a[i] = new Book(name[i], author, isbn[i], price[i]);
        }


//        for (int i = 0; i < 3; i++) {
//            System.out.printf("%s - %s price: %d (isbn:%d)\n", a[i].title, author, isbn[i], price[i]);
//        }
    }
}
