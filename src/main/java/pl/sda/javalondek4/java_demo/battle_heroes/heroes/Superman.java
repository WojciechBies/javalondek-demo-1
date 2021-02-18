package pl.sda.javalondek4.java_demo.battle_heroes.heroes;

import pl.sda.javalondek4.java_demo.battle_heroes.Character;
import pl.sda.javalondek4.java_demo.battle_heroes.Name;
import pl.sda.javalondek4.java_demo.battle_heroes.Type;
import pl.sda.javalondek4.java_demo.battle_heroes.items.Item;
import pl.sda.javalondek4.java_demo.battle_heroes.moves.Kick;
import pl.sda.javalondek4.java_demo.battle_heroes.moves.Punch;
import pl.sda.javalondek4.java_demo.battle_heroes.special_moves.JumpAttack;
import pl.sda.javalondek4.java_demo.battle_heroes.special_moves.LaserEye;

import java.util.List;

public class Superman extends Hero {

    public Superman() {
        super(Name.SUPERMAN, 400, 600, Type.ATTACK, List.of(new Kick(50), new Punch(50)),
                List.of(new LaserEye(200, 300, 20), new JumpAttack(100, 150, 10)),
                List.of(Name.BATMAN.toString(), Name.WONDER_WOMAN.toString()), 10000);
    }

    @Override
    public void attack(Character character) {

    }

    @Override
    public boolean addItem(Item item) {
        return false;
    }

    @Override
    public String toString() {
        return "Superman{} " + super.toString();
    }
}
