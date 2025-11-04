package ex08.sec01.exam01;

abstract class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract public void work();
}