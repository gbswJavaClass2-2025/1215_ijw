package chap10.sec02.exam01;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            Class ang = Class.forName("Ang");
        } catch(ClassNotFoundException e) {
            System.out.println("there's no class like that vro;;;");
        }
    }
}
