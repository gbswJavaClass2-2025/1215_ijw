package cote1.exam02;

public class OrderExample {
    static void main() {
        Menu a = new Menu("밥", 1000);
        Menu b = new Menu("국", 2000);
        Menu c = new Menu("김치", 20000);

        OrderItem d = new OrderItem(20000, 2);

        System.out.printf("김치 2개 가격 : %d", d.getPrice());
    }
}
