public class Monster {

    private int health;
    private int strength;
    private int defense;
    private double attack;

    public Monster() {

    	health = 150000;
    	strength = 80;
    	defense = 40;
    	attack = 0.7;
    }

    public boolean isAlive() {
    return health > 0;
    }

    //I'm going to add getStrength and getAttack methods

    public int getDefense() {
    return defense;
    }

    public int getStrength() {
    return strength;
    }

    public double getAttack() {
    return attack;
    }

    //back to other methods

    public void lowerHP(int amt) {
    health = health - amt;

        if (health < 0) {
            health = 0;
            }
    }

    public int attack(Protagonist p) {
        int damage;
        
        int int0 = (int) (p.getStrength() * p.getAttack());
        damage = int0 - p.getDefense();

        if (damage < 0) {
            damage = 0;
        }

        lowerHP(damage);

        return damage;
    }
}