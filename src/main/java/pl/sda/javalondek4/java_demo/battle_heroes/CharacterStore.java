package pl.sda.javalondek4.java_demo.battle_heroes;

import pl.sda.javalondek4.java_demo.battle_heroes.heroes.Batman;
import pl.sda.javalondek4.java_demo.battle_heroes.heroes.Superman;

import java.util.List;

public class CharacterStore {

    private final List<Character> characterList;

    public CharacterStore() {
        this.characterList = List.of(new Superman(), new Batman());
    }

    public void buyNewCharacter(Player buyer) {


    }

    public List<Character> getCharacterList() {
        return characterList;
    }

    public void showAllCharacters() {
        characterList.stream()
                .forEach(character -> { System.out.println(character.getName();
                    System.out.println(character.);})
                so);
    }
}
