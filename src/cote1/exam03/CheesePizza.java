package cote1.exam03;

public class CheesePizza {
    public String name="Cheese Pizza";
    public int[] prices = { 1000, 2000, 3000 };
    public String size;

    public CheesePizza() {
        this.size = "M";
    }

    public CheesePizza(String s) {
        this.size = s;
    }

    public void cook() {
        System.out.printf("%s %s을 조리합니다.\n", name, size);
        System.out.printf("%s %s이 완성되었습니다.\n", name, size);
    }

    public void serve() {
        System.out.printf("%s %s를 드립니다. %d 입니다.\n", name, size, prices[2]);
    }
}
