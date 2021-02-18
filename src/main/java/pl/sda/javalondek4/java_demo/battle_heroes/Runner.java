package pl.sda.javalondek4.java_demo.battle_heroes;

public class Runner {

    public static void main(String[] args) {

        CharacterStore characterStore = new CharacterStore();
        Player player = new Player("Player");

        characterStore.showAllCharacters();

        System.out.println(player.getGold());

        characterStore.sellCharacter(player, Name.SUPERMAN);

        System.out.println(player.getGold());
        System.out.println(player.getCharacterList());




    }
}
