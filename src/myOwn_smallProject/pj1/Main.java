package myOwn_smallProject.pj1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 간단한 덧셈 프로그램
        char operator;
        int num1, num2;
        String input;

        Scanner sc = new Scanner(System.in);

        System.out.println("ex)\n3 + 14");
        System.out.println("= 17");

        System.out.printf("> ");
        input = sc.nextLine();


        System.out.println(input);
    }
}
