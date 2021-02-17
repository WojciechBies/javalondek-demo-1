package pl.sda.javalondek4.java_demo.battle_heroes;

import pl.sda.javalondek4.java_demo.battle_heroes.moves.Move;
import pl.sda.javalondek4.java_demo.battle_heroes.special_moves.SpecialMove;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

public abstract class Character {

    private final UUID id;
    private int level;
    private int experience;
    private final Name name;
    private int health;
    private int power;
    private final Type type;
    private final List<Move> moves;
    private final List<SpecialMove> specialMoves;

    public Character(Name name, int health, int power, Type type,
                     List<Move> moves, List<SpecialMove> specialMoves) {
        this.id = UUID.randomUUID();
        this.level = 1;
        this.experience = 0;
        this.name = name;
        this.health = health;
        this.power = power;
        this.type = type;
        this.moves = moves;
        this.specialMoves = specialMoves;
    }

    public abstract void attack(Character character);

    public UUID getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    public Name getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getPower() {
        return power;
    }

    public Type getType() {
        return type;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public List<SpecialMove> getSpecialMoves() {
        return specialMoves;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", level=" + level +
                ", experience=" + experience +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", power=" + power +
                ", type=" + type +
                ", moves=" + moves +
                ", specialMoves=" + specialMoves +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return level == character.level && experience == character.experience && health == character.health && power == character.power && id.equals(character.id) && name == character.name && type == character.type && moves.equals(character.moves) && specialMoves.equals(character.specialMoves);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, level, experience, name, health, power, type, moves, specialMoves);
    }
}
