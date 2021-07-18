package Work.Inheritans;

public class Schotish extends Cat {
    private String name;


    public Schotish(int age, String owner, String name) {
        super(age, owner);
        this.name = name;
    }

    public void saySchotish() {
        System.out.println("Ya Scottish");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat name: " + name + " Age: " + getAge() + " Owner: " + getOwner();
    }
}
