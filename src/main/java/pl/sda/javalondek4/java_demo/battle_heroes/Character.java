package pl.sda.javalondek4.java_demo.battle_heroes;

import pl.sda.javalondek4.java_demo.battle_heroes.items.Item;
import pl.sda.javalondek4.java_demo.battle_heroes.moves.Move;
import pl.sda.javalondek4.java_demo.battle_heroes.special_moves.SpecialMove;

import java.util.ArrayList;
import java.util.List;
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
    private final List<String> battleBonusCharacters;
    private final List<Item> items;
    private final int cost;

    public Character(Name name, int health, int power, Type type, List<Move> moves,
                     List<SpecialMove> specialMoves, List<String> battleBonusCharacters, int cost) {
        this.id = UUID.randomUUID();
        this.level = 1;
        this.experience = 0;
        this.name = name;
        this.health = health;
        this.power = power;
        this.type = type;
        this.moves = moves;
        this.specialMoves = specialMoves;
        this.battleBonusCharacters = battleBonusCharacters;
        this.items = new ArrayList<>();
        this.cost = cost;
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

    public List<String> getBattleBonusCharacters() {
        return battleBonusCharacters;
    }

    public List<Item> getItems() {
        return items;
    }

    public int getCost() {
        return cost;
    }


}
