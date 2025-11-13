package chap10.sec01.exam05;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        try {
            changeDog(dog);
            changeDog(cat);
        } catch (Exception e) {
            System.out.println(e); // 가장 중요한 건 예외처리 하나 제대로 못해선 나중에 아무것도 못할 것이라는 사실이다.
            // 그렇기 때문에 난 책에 맞서 예외에 맞선다!!!!
        }
    }

    public static void changeDog(Animal animal) {
        Dog dog = (Dog) animal;
    }
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}