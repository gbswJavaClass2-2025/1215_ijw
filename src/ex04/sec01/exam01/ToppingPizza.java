package ex04.sec01.exam01;

public class ToppingPizza extends Pizza {
    // 제시된 과제에선 상수로 사용됨.
    // 이미 정의된 피자는 바뀌지 않으므로,

    // final 쓰면 될듯?
    // 생성자로 한 번 딱 지정해주니까 private
    // 그러니까 static은 안됨 ㅇㅇ;;

    private final String name;
    private final String top;

    // public ToppingPizza() {}
    public ToppingPizza(String d, int s, String n, String t) {
        super(d, s); // 정답 코드를 통해 배운 거 ㅇㅇ
        this.name = n;
        this.top = t;
    }

    // @Override
    public String describe() {
        return String.format("%s: %d인치, %s를 사용한 기본 피자입니다. 주요 토핑은 **%s**입니다.\n", name, sizeInInch, dough, top);
    }

    public void bake() {
        System.out.printf("%s (표준): 오븐에서 표준 시간동안 피자를 굽습니다.\n", name);
    }

    public void bake(int min) {
        System.out.printf("%s (시간 지정): %d분동안 특별히 피자를 굽습니다.\n", name, min);
    }

    public void bake(int tmp, int min) {
        System.out.printf("%s (온도+시간 지정): %d도에서 %d분동안 **%s** 피자를 완벽하게 굽습니다.\n", name, tmp, min, top);
    }
}
