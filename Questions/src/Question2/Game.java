package Question2;

public class Game {

    private int homeScore;
    private int awayScore;

    public Game(){}
    public Game(int homeScore , int awayScore){
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public int getHomeScore(){return homeScore;}
    public int getAwayScore(){return awayScore;}


}
