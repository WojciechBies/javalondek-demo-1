package pl.sda.javalondek4.java_demo.battle_heroes;

import pl.sda.javalondek4.java_demo.battle_heroes.exceptions.CharacterNotFoundException;
import pl.sda.javalondek4.java_demo.battle_heroes.heroes.Batman;
import pl.sda.javalondek4.java_demo.battle_heroes.heroes.Superman;

import java.util.List;

public class CharacterStore {

    private final List<Character> characterList;

    public CharacterStore() {
        this.characterList = List.of(new Superman(), new Batman());
    }

    public void sellCharacter(Player buyer, Name chosenCharacter) {

         if(buyer.getGold() >= getCharacterCost(chosenCharacter) ) {
             buyer.subtractGold(getCharacterCost(chosenCharacter));
             buyer.addCharacter(getCharacter(chosenCharacter));
         }


    }


    public List<Character> getCharacterList() {
        return characterList;
    }

    public void showAllCharacters() {
        characterList
                .forEach(character -> {
                    System.out.println("Name: " + character.getName());
                    System.out.println("Health: " + character.getHealth());
                    System.out.println("Power: " + character.getPower());
                    System.out.println("Cost: " + character.getCost());
                    System.out.println();
                });

    }
    private int getCharacterCost(Name chosenCharacter) {
        return characterList.stream()
                .filter(character -> character.getName().equals(chosenCharacter))
                .mapToInt(character -> character.getCost())
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException());

    }

    private Character getCharacter(Name chosenCharacter) throws CharacterNotFoundException {
        return characterList.stream()
                .filter(character -> character.getName().equals(chosenCharacter))
                .findFirst()
                .orElseThrow(() -> new CharacterNotFoundException());
    }
}
