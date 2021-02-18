package pl.sda.javalondek4.java_demo.battle_heroes.heroes;

import pl.sda.javalondek4.java_demo.battle_heroes.Character;
import pl.sda.javalondek4.java_demo.battle_heroes.Name;
import pl.sda.javalondek4.java_demo.battle_heroes.Type;
import pl.sda.javalondek4.java_demo.battle_heroes.items.Item;
import pl.sda.javalondek4.java_demo.battle_heroes.moves.Move;
import pl.sda.javalondek4.java_demo.battle_heroes.special_moves.SpecialMove;

import java.util.List;
import java.util.UUID;

public abstract class Hero extends Character {

    public Hero(Name name, int health, int power, Type type, List<Move> moves,
                List<SpecialMove> specialMoves, List<String> battleBonusCharacters, int cost) {
        super(name, health, power, type, moves, specialMoves, battleBonusCharacters, cost);
    }

    public abstract boolean addItem(Item item);


}
