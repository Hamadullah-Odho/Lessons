import java.util.*;
public class Main {
// interface = arraylist , list , scanner
// java.util = package > folder

// it is a folder which contain different classes and interface which we can use to create our programs

    public static void main(String[] args) {


        // String
        ArrayList<String> names = new ArrayList<>(); // > names
        // class = objects
        String myName = "Hamadullah";

        names.add(myName);
        names.add("Bob");
        names.add("alice");
        names.add("john");
        names.add("hamad");

        System.out.println(names.toString());
        names.size();
        // .add() > add elements
        // .size(); > how many elements are there in arraylist
        // length() > array != arraylist > size();
        // .toString(); > create a string of elements and print it
        // iterate through an arraylist > for each or for loop

        // for each

        // iterator . go through arraylist
        Iterator<String> iterator = names.iterator();

        // while loop
        // iterator.hasNext() > true otherwise false
        while(iterator.hasNext()){

            // String variable = store current element of arraylist inside the variable
            // .hasNext() , next()
            // current element from iterator
            String current = iterator.next(); // > next element from iterator

            System.out.println(current);
           

        }
    }

}