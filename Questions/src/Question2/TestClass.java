package Question2;

import java.util.ArrayList;

public class TestClass {

    public static void main(String[] args) {
        ArrayList<Game> allGames = new ArrayList<>();

        allGames.add(new Game(16,12));
        allGames.add(new Game(12,10));
        allGames.add(new Game(14,13));
        allGames.add(new Game(17,15));
        allGames.add(new Game(11,12));

        Session session = new Session(allGames);
        System.out.println(session.getLongestHomeWinStreak());
    }
}
