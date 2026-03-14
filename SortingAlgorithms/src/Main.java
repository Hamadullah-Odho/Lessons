import java.util.ArrayList;

public class Main {


   // method
    public static ArrayList<Integer> selectionSort(ArrayList<Integer> numbers){

        // outer loop > rows
        // 5 3 4 1 2
        // 0 1 2 3 4

        // first iteration  = 0 index
        // element 5 will be checked with whole arraylist > 3 4 1 2
        //1 3 4 5 2
        for(int i = 0 ; i < numbers.size(); i++){

            //
            int min = i;

            for(int j = i+1; j < numbers.size(); j++){

                if(numbers.get(j) < numbers.get(min)){
                    min = j;
                }
            }
            if (min != i){
                int temp = numbers.get(min);
                numbers.set(min,numbers.get(i));
                numbers.set(i,temp);
            }
        }
        return numbers;
    }
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(4);
        numbers.add(1);
        numbers.add(2);

        ArrayList<Integer> sorted = selectionSort(numbers);

        System.out.println(sorted.toString());

    }







}