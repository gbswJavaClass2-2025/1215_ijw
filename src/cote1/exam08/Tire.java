package cote1.exam08;

public class Tire {
    public String model;
    public int maxRotation;
    public int curRotation = 0;

    public Tire(String m, int rot) {
        this.model = m;
        this.curRotation = 0;
        this.maxRotation = rot;
    }

    public boolean roll() {
        if (curRotation >= maxRotation) return false;
        else { curRotation++; return true; }
    }
}
