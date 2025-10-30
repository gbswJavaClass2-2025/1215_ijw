package cote1.exam01;

public class Student {
    private String name;
    private String email;
    private String id;

    public Student() {}
    public Student(String n, String e, String i) {
        this.name = n;
        this.email = e;
        this.id = i;
    }

    public void setName(String n) {
        this.name = n;
    }
    public String getName() {
        return this.name;
    }

    public void setEmail(String e) {
        this.email = e;
    }
    public String getEmail() {
        return this.email;
    }

    public void setId(String i) {
        this.id = i;
    }
    public String getId() {
        return this.id;
    }
}
