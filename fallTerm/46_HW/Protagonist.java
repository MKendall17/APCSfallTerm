public class Protagonist extends Character {
    private String name;

    public Protagonist(String s) {
        name = s;
        health = 250;
        strength = (int)(20 + 45 * Math.random());
        defense = 40;
        rating = 0.4;
    }

    public String getName() {
        return name;
    }

    public void specialize() {
    defense = defense / 2;
    rating = rating * 2 ;
    }

    public void normalize() {
    this.defense = 75;
    this.rating = 0.4;
    }
}