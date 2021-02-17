package pl.sda.javalondek4.java_demo.battle_heroes;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String nick;
    private int gold;
    private final List<Character> characterList;

    public Player(String nick) {
        this.nick = nick;
        this.gold = 10000;
        this.characterList = new ArrayList<>();
    }

    public String getNick() {
        return nick;
    }

    public int getGold() {
        return gold;
    }


    public int addGold(int gold) {
        return this.gold = this.gold + gold;
    }

    public boolean addCharacter(Character character) {
        return addCharacter(character, this.characterList);
    }


    public void setNick(String nick) {
        this.nick = nick;
    }

    public List<Character> getCharacterList() {
        return characterList;
    }

    private boolean addCharacter(Character character, List<? super Character> characterList) {
        return characterList.add(character);
    }
}
