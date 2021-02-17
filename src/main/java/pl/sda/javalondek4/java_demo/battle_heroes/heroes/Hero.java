package pl.sda.javalondek4.java_demo.battle_heroes.heroes;

import pl.sda.javalondek4.java_demo.battle_heroes.Character;
import pl.sda.javalondek4.java_demo.battle_heroes.Name;
import pl.sda.javalondek4.java_demo.battle_heroes.Type;
import pl.sda.javalondek4.java_demo.battle_heroes.items.hero_items.HeroItem;
import pl.sda.javalondek4.java_demo.battle_heroes.moves.Move;
import pl.sda.javalondek4.java_demo.battle_heroes.special_moves.SpecialMove;

import java.util.ArrayList;
import java.util.List;

public abstract class Hero extends Character {

    private final List<String> battleBonusHeros;
    private final List<HeroItem> heroItems;


    public Hero(Name name, int health, int power, Type type, List<Move> moves, List<SpecialMove> specialMoves,
                List<String> battleBonusHeros) {
        super(name, health, power, type, moves, specialMoves);
        this.battleBonusHeros = battleBonusHeros;
        this.heroItems = new ArrayList<>();
    }

    public List<String> getBattleBonusHeros() {
        return battleBonusHeros;
    }

    public List<HeroItem> getHeroItems() {
        return heroItems;
    }

    public abstract boolean addItem(HeroItem heroItem);


}
