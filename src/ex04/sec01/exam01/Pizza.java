package ex04.sec01.exam01;

public class Pizza {
    // 배경지식 on
    protected String dough;
    protected int sizeInInch;

    public Pizza() {}
    public Pizza(String d, int s) {
        this.dough = d;
        this.sizeInInch = s;
    }

    public void bake() {
        System.out.println("Plain Pizza: 오븐에서 표준 시간 동안 피자를 굽습니다.");
    }

    public void bake(int min) {
        System.out.printf("Plain Pizza: %d분 동안 특별히 피자를 굽습니다.\n", min); // 레전드 잡기술;;;
    }

    public String describe() {
        return String.format("Plain Pizza: %d인치, %s를 사용한 기본 피자입니다.", sizeInInch, dough);
    }
}

// https://stackoverflow.com/questions/7278128/formatting-string-in-java-using-return-string-format
// 문자열 포맷 해버리기~~
