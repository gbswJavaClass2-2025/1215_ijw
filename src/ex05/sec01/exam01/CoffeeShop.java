package ex05.sec01.exam01;

public class CoffeeShop {
    static void main() {
        System.out.println("----- 커피 전문점 시스템 실습 시작 -----");

        Coffee coffee1 = new Coffee("아메리카노", "Medium", 4000);
        Latte latte1 = new Latte("카라멜 라떼", "Large", 5500, "벨벳 폼");

        System.out.println(">> Coffee 객체 생성: " + coffee1.size + " " + coffee1.name);
        System.out.println(">> Coffee 객체 생성: " + latte1.size + " " + latte1.name);
        System.out.println("------------------------------------");

        System.out.println("[4. 오버라이딩 (음료 정보)]");
        System.out.println("아메리카노 정보: " + coffee1.getBeverageInfo());
        System.out.println("카라멜 라떼 정보: " + latte1.getBeverageInfo());

        System.out.println("------------------------------------");

        System.out.println("[3. 오버로딩 (가격 계산)]");
        System.out.println("아메리카노 최종 가격 (기본): " + coffee1.calculatePrice() + " 원");
        System.out.println("아메리카노 최종 가격 (할인): (할인율 10.0% 적용) " + coffee1.calculatePrice(10.0) + " 원");

        System.out.println("카라멜 라떼 최종 가격 (기본): " + latte1.calculatePrice() + " 원");
        System.out.println("카라멜 라떼 최종 가격 (할인): (할인율 20.0% 적용) " + latte1.calculatePrice(20.0) + " 원");

        System.out.println();
        System.out.println("카라멜 라떼 최종 가격 (샷 추가): (우유 비용 500 원 포함 (+샷 추가 1,000 원)) " + latte1.calculatePrice(1000) + " 원");

        System.out.println("----- 실습 종료 -----");
    }
}
