package cote1.exam04;

public class PepperoniPizza extends Pizza {
    public String name = "Pepperoni Pizza"; // 사용자에게서 입력을 받지 않는다? 그냥 지정만 해놓으면 끝인 문제;;
    public int[] prices = { 2000, 4000, 6000 };
    public String size;
    public String toppings = "pepperoni";

    public PepperoniPizza() {
        this.size = "M";
    }

    public PepperoniPizza(String s) {
        this.size = s;
    }

    @Override // 여기만 바뀜
    public void cook() {
        System.out.printf("%s을 추가합니다.\n", toppings);
        System.out.printf("%s %s을 조리합니다.\n", name, size);
        System.out.printf("%s %s이 완성되었습니다.\n", name, size);
    }

    public void serve() { // 사이즈도 다 똑같네;;
        System.out.printf("%s %s를 드립니다. %d 입니다.\n", name, size, prices[2]);
    }
}
