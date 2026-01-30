import java.util.ArrayList;

public class RemoveElements {


    // 0 1 2 3 4 5 6 7 8
    // 0 1 2 3 4 5 6
    public static void main(String[] args) {

        // names
        ArrayList<String> names = new ArrayList<>();

        //elements inside names arraylist
        names.add("apple"); // 0
        names.add("box"); // remove
        names.add("bee"); // 1 bee
        names.add("bell"); // 2 remove
        names.add("cat"); // 2
        names.add("boy"); // 3
        names.add("bag");// 4 > remove
        names.add("rose"); // 5 > remove
        names.add("butterfly"); // 6 > remove


        // traditional , for each
        for(int i = 0; i < names.size() ; i++){

            // i = 2 > bell names.get(i) > .charAt(0)
            // bell.charAt(0) > b
            // b == b > true

            if(names.get(i).charAt(0) == 'b'){
                // remove method
                // names.remove(1) > box

                names.remove(i);
            }
        }

        System.out.printf(names.toString());
    }
}
