package ex01.sec01.exam01;

public class People {
    public int age;
    public String name, home, gender;

    public void PeopleInfo() {
        System.out.println("나이: " + this.age + "\n 이름: " + this.name +
                "\n 집: " + this.home + "\n 성별: " + this.gender);
    }
}
