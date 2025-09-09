package chap06.sec04.exam03;

public class Car {
    int gas;

    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("가스가 없는.");
            return false;
        }

        System.out.println("가스가 있는");
        return true;
    }

    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("달리는. (gas잔량: " + gas + " )");
                gas -= 1;
            } else {
                System.out.println("멈추는... (gas잔량: " + gas + " )");
                return;
            }
        }
    }
}
