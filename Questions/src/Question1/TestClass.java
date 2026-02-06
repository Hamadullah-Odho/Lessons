package Question1;

import Question2.Game;

import java.util.ArrayList;

public class TestClass {

    public static void main(String[] args) {

        ArrayList<GameAccount> players = new ArrayList<>();
        players.add(new GameAccount("x", 15));
        players.add(new GameAccount("x", 11));
        players.add(new GameAccount("x", 17));
        players.add(new GameAccount("x", 18));
        players.add(new GameAccount("x", 19));
        players.add(new GameAccount("x", 20));
        players.add(new GameAccount("x", 16));
        players.add(new GameAccount("x", 14));
        players.add(new GameAccount("x", 22));
        players.add(new GameAccount("x", 21));

        GamePlatform gamePlatform = new GamePlatform(players);
        System.out.println(gamePlatform.avgTeenAccounts());
    }
}
