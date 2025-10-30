package ex05.sec01.exam01;

class Coffee {
    String name;
    String size;
    int basePrice;

    Coffee(String name, String size, int basePrice) {
        this.name = name;
        this.size = size;
        this.basePrice = basePrice;
    }

    int calculatePrice() {
        return basePrice;
    }


    int calculatePrice(double discountRate) {
        return (int)(basePrice * (1 - discountRate/100));
    }


    String getBeverageInfo() {
        return "종류: " + name + " | 사이즈: " + size + " | 기본 가격: " + basePrice + " 원";
    }
}