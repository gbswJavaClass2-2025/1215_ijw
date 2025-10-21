package ex01.sec02.exam01;

public class Product {
    private String productId, productName, productArea;
    private int price;
    private double tax;

    public Product() {}

    public Product(String productId, String productName, String productArea, int price, double tax) {
        this.productId = productId;
        this.productName = productName;
        this.productArea = productArea;
        this.price = price;
        this.tax = tax;
    }

    public String information() {
        return productId +
                " " + productName +
                " " + productArea +
                " " + price +
                " " + tax;
    }

    public void setId(String productId) {
        this.productId = productId;
    }

    public void setName(String productName) {
        this.productName = productName;
    }

    public void setArea(String productArea) {
        this.productArea = productArea;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    //

    public String getId() {
        return this.productId;
    }

    public String getName() {
        return this.productName;
    }

    public String getArea() {
        return this.productArea;
    }

    public int getPrice() {
        return this.price;
    }

    public double getTax() {
        return this.tax;
    }

    public int result(int price, double tax) {
        return (int)(price + (price * tax));
    }
}
