package pl.sda.javalondek4.java_demo.battle_heroes.moves;

public abstract class Move {

    private int damage;


    public Move(int damage) {
        this.damage = damage;

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    @Override
    public String toString() {
        return "Move{" +
                "damage=" + damage +
                '}';
    }
}
