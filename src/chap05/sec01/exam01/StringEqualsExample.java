package chap05.sec01.exam01;

public class StringEqualsExample {
    public static void main(String[] args) {
        String v1 = "tls123";
        String v2 = "Omniscient Reader's Viewpoint";
        String v3 = "tls123";

        if (v1 == v3) System.out.println("v1, v3는 서로 참조가 같다");
        else System.out.println("다르네, 참조가...");

        if (v1.equals(v3)) System.out.println("내용이 같네");

        String v4 = new String("asdf");
        String v5 = new String("asdf");

        if (v4 == v5) System.out.println("참조가 같노");
        else System.out.println("참조가 다르노");

        if(v4.equals(v5)) System.out.println("값이 같노");
    }
}
