public class Protagonist extends Character {
    // private String name;
    // private int health;
    // private int strength;
    // private int defense;
    // private double attack;

    public Protagonist(String input) {
        name = input;
        health = 300;
        strength = (int) (Math.random() * 20 + 150);
        defense = 35;
        attack = 1.2;
    }


    public boolean isAlive() {
    return health > 0;
    }

    //I'm going to add getStrength and getAttack methods

    // public int getDefense() {
    // return defense;
    // }

    // public int getStrength() {
    // return strength;
    // }

    // public double getAttack() {
    // return attack;
    // }

    //back to other methods

    public String getName() {
    return name;
    }

    // public void lowerHP(int amt) {
    // health = health - amt;

    //     if (health < 0) {
    //         health = 0;
    //         }
    // }

    /** 
        specialize and normalize
    */

    public void specialize(){
        attack = attack * 2;
        defense = defense / 2 - 5;
    }

    public void normalize(){
        attack = attack / 2;
        defense = (defense + 5) * 2;
    }


    /** 
        actions
    */

    public int attack(Monster m) {
        int damage = (int) (strength * attack - m.getDefense());

        if (damage < 0) {
            damage = 0;
        }

        m.lowerHP(damage);

        return damage;
    }

}