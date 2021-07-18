package Work.Inheritans;

public class Main {
    public static void main(String[] args) {
        British british = new British(3, "Alex", "Lori");
        British british1 = new British(3, "Alex", "Lori");
        Schotish schotish = new Schotish(5, "Ivan", "Baxter");
        Cat cat = new Cat(5, "Nik");

        british.sayMeow();
        schotish.sayMeow();
        System.out.println();
        System.out.println("Cat name: " + british.getName() +
                " Age: " + british.getAge() + " Owner: " + british.getOwner());
        System.out.println("Cat name: " + schotish.getName() +
                " Age: " + schotish.getAge() + " Owner: " + schotish.getOwner());
        System.out.println();

        System.out.println(british.toString());
        System.out.println(schotish.toString());

        System.out.println();

        System.out.println(british.equals(british1));
        System.out.println(british == british1);
    }
}
