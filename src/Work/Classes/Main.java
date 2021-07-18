package Work.Classes;

public class Main {
    public static void main(String[] args) {

        Cat loriCat = new Cat();
        loriCat.setName("Kitty");
        loriCat.setWeight(8);

        Cat billy = new Cat();
        billy.setName("billy");
        billy.setWeight(7);

        FightClub fightClub = new FightClub();
        System.out.println("Pobeditel " + fightClub.fight(loriCat, billy));

    }
}

class Cat {

    private String name;

    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
