package chap03.sec02.exam09;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        int charCode = 'A';

        if ((charCode >= 65) && (charCode <= 90)) {
            System.out.println("대문자다, 어이!");
        }

        if ((charCode >= 97) && (charCode <= 122)) {
            System.out.println("네녀석의 다음 행동은 \"소문자 입력\"이다!");
        }

        if (!(charCode < 48) && !(charCode > 57)) {
            System.out.println("?... 자네... 자네는 숫자를 입력했어... 그 숫자... 그 숫자는 밥맛이야.");
        }

        int value = 6;

        if (!(value % 2) | !(value % 3)) {
            System.out.println("어이 당장 그만둬! 그건 2 혹은 3의 배수다!!!");
        }

        // 책 코드에 도대체 왜 2 또는 3의 배수를 두 개의 조건문으로 출력하는지 모르겠습니다;; 이런;;;
//        if ((charCode >= 65) && (charCode <= 90)) {
//            System.out.println("소문자다 어이!");
//        }
    }
}
