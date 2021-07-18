package Work.Inheritans;

public class Cat {
    private int age;
    private String owner;

    public Cat(int age, String owner) {
        this.age = age;
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public String getOwner() {
        return owner;
    }

    public void sayMeow() {
        System.out.println("Meow");
    }

}
