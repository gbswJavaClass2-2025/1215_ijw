package chap05.sec02.exam05;

public class MainStringArrayArgument {
    public static void main(String[] args) {
        if (args.length < 2) { System.out.println("인자 수가 부족함"); System.exit(0); }
        else if (args.length >= 3) { System.out.println("넌 나가라"); System.exit(0); }

        String v1 = args[0];
        String v2 = args[1];

        int n1 = Integer.parseInt(v1);
        int n2 = Integer.parseInt(v2);

        int res = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + res);
    }
}
