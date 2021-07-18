package Work.Immutebles;

public class Main {
    public static void main(String[] args) {
        Owner alex = new Owner("Alex");
        final Cat lori = new Cat("Lori", 4, alex);
        System.out.println(lori.getName());
    }
}
