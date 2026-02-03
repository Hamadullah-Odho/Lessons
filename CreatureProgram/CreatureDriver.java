package CreatureProgram;

import java.util.ArrayList;

public class CreatureDriver {

    public static void main(String[] args) {

        ArrayList<Creature> creatures = new ArrayList<>();

        creatures.add(new Creature(5));
        creatures.add(new Creature(3));
        creatures.add(new Creature(6));
        creatures.add(new Creature(7));
        creatures.add(new Creature(7));
        creatures.add(new Creature(7));
        creatures.add(new Creature(8));


        Creature creature = creatures.get(3);


        System.out.println(creature.countBigOnes(creatures,creature.getSize()));

    }
}
