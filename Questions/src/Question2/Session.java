package Question2;

import java.util.ArrayList;

public class Session {

    ArrayList<Game> allGames;

    public Session(){
        allGames = new ArrayList<>();
    }
    public Session(ArrayList<Game> allGames){
        this.allGames = allGames;
    }

    public int getLongestHomeWinStreak(){

        int maxScore = 0;
        int currentScore = 0;

        for(Game g : allGames){

            if(g.getHomeScore() > g.getAwayScore()){
                currentScore++;

                if(currentScore > maxScore){
                    maxScore = currentScore;
                }
                else {
                    currentScore = 0;
                }
            }
        }
        return maxScore;
    }

    public static void main(String[] args) {


    }
}
