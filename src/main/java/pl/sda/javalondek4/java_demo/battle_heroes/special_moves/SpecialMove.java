package pl.sda.javalondek4.java_demo.battle_heroes.special_moves;

public abstract class SpecialMove {

    private int damage;
    private int powerCost;
    private final int renewingTime;

    public SpecialMove(int damage, int powerCost, int renewingTime) {
        this.damage = damage;
        this.powerCost = powerCost;
        this.renewingTime = renewingTime;
    }

    public int getDamage() {
        return damage;
    }

    public int getPowerCost() {
        return powerCost;
    }

    public int getRenewingTime() {
        return renewingTime;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setPowerCost(int powerCost) {
        this.powerCost = powerCost;
    }

    @Override
    public String toString() {
        return "SpecialMove{" +
                "damage=" + damage +
                ", powerCost=" + powerCost +
                ", renewingTime=" + renewingTime +
                '}';
    }
}
