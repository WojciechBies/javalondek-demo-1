package pl.sda.javalondek4.java_demo.battle_heroes.heroes;

import pl.sda.javalondek4.java_demo.battle_heroes.Character;
import pl.sda.javalondek4.java_demo.battle_heroes.Name;
import pl.sda.javalondek4.java_demo.battle_heroes.Type;
import pl.sda.javalondek4.java_demo.battle_heroes.items.hero_items.HeroItem;
import pl.sda.javalondek4.java_demo.battle_heroes.moves.Kick;
import pl.sda.javalondek4.java_demo.battle_heroes.moves.Punch;
import pl.sda.javalondek4.java_demo.battle_heroes.special_moves.Batarang;
import pl.sda.javalondek4.java_demo.battle_heroes.special_moves.JumpAttack;

import java.util.List;

public class Batman extends Hero {

    private final int cost = 10000;

    public Batman() {
        super(Name.BATMAN, 800, 300, Type.DEFENSE, List.of(new Punch(30), new Kick(30)),
                List.of(new Batarang(90, 100, 10), new JumpAttack(70, 80, 8)),
                List.of(Name.SUPERMAN.toString(), Name.WONDER_WOMAN.toString()));
    }

    @Override
    public void attack(Character character) {

    }

    @Override
    public boolean addItem(HeroItem heroItem) {
        return false;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Batman{" +
                "cost=" + cost +
                "} " + super.toString();
    }
}
