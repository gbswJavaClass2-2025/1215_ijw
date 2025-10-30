package ex05.sec01.exam01;

class Latte extends Coffee {
    String foamType;
    int milkCharge = 500;

    Latte(String name, String size, int basePrice, String foamType) {
        super(name, size, basePrice);
        this.foamType = foamType;
    }

    @Override
    String getBeverageInfo() {
        return super.getBeverageInfo() + " | 거품 종류: **" + foamType + "**";
    }


    int calculatePrice(int extraShotPrice) {
        return basePrice + milkCharge + extraShotPrice;
    }
}