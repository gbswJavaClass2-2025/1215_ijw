package cote1.exam02;

public class OrderItem extends Menu{
    final private int menu;
    final private int quantity;

    public OrderItem(int m, int q) {
        this.menu = m;
        this.quantity = q;
    }

    public int getPrice() {
        return this.menu * this.quantity;
    }
}
