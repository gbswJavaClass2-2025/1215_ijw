package ex08.sec01.exam03;

public class Librarian extends LibraryMaterial{
    LibraryMaterial material;

    public Librarian(LibraryMaterial material) {
        this.material = material;
    }
    public void registerMaterial() {
        material.registerMaterial();
    }
    public void loanMaterial() {
        material.loanMaterial();
    }
}
