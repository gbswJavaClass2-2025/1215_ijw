package ex04.sec01.exam01;

public class PizzaShop {
    static void main() {
        Pizza a = new Pizza("씬 크러스트", 10);
        ToppingPizza b = new ToppingPizza("핸드 토스", 12, "Cheese Pizza", "모짜렐라");
        ToppingPizza c = new ToppingPizza("팬 도우", 14, "Pepperoni Pizza", "페퍼로니");

        System.out.println("----- 피자 가게 시스템 실습 시작 -----");
        System.out.printf(">> Pizza 객체 생성: %s %d인치 피자\n", a.dough, a.sizeInInch);
        System.out.printf(">> Pizza 객체 생성: %s %d인치 피자\n", b.dough, b.sizeInInch);
        System.out.printf(">> Pizza 객체 생성: %s %d인치 피자\n", c.dough, c.sizeInInch);

        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();

        System.out.println("[4. 오버라이딩 (설명)]");
        System.out.printf("%s", a.describe());
        System.out.printf("%s", b.describe());
        System.out.printf("%s", c.describe());

        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();

        System.out.println("[3. 오버로딩 (굽기)]");
        a.bake();
        a.bake(15);
        c.bake();
        c.bake(20);
        c.bake(350, 20);

        System.out.println("----- 실습 종료 -----");
    }
}
