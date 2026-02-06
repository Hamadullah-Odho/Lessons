package Question1;

import java.util.ArrayList;

public class GamePlatform {

    ArrayList<GameAccount> allPlayers;

    public GamePlatform(){
        allPlayers = new ArrayList<>();
    }
    public GamePlatform(ArrayList<GameAccount> allPlayers){
        this.allPlayers = allPlayers;
    }

    public double avgTeenAccounts(){

        int sumOfAge = 0;
        int playerCount = 0;
        for(GameAccount g: allPlayers){

            if(g == null){
                continue;
            }
            if(g.getAge() >= 13 && g.getAge() <= 19){

                sumOfAge += g.getAge();
                playerCount++;
            }

        }

        return sumOfAge / playerCount;


    }
}
