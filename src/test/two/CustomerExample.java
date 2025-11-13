package test.two;

public class CustomerExample {
    static void main() {
        Customer cust1 = new Customer("엄준식", "1234");
        Customer cust2 = new Customer("김박최수연", "23455", 100);

        System.out.println(cust1.updatePoint(50));
        System.out.println(cust2.updatePoint(-50));
        System.out.println(cust2.setPoint(200));
    }
}
