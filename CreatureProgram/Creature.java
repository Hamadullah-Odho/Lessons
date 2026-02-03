package CreatureProgram;

import java.util.ArrayList;

public class Creature {

    private int size;

    public Creature(int size){
        this.size = size;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }
    public boolean isBig(ArrayList<Creature> creatures, int size){

        for(Creature c : creatures){

            if(c.getSize() > size){
                return false;
            }
        }
        return true;
    }

    public int countBigOnes(ArrayList<Creature> creatures, int size){

        int count = 0;

        for(Creature c : creatures){

            if(c.getSize() > size){
                count++;
            }
        }
        return count;
    }
}
