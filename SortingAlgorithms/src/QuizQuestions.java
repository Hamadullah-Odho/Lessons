import java.util.ArrayList;

public class QuizQuestions {

    public void selectionSort(ArrayList<Integer> arr){

        for(int p = 0 ; p < arr.size(); p++){

            int largest = p; // smallest

            for(int q = p + 1; q < arr.size(); q++){

                if(arr.get(q) > arr.get(largest)){
                    largest = q;
                }

                if(arr.get(p) != arr.get(largest)){

                    int temp = arr.get(largest);
                    arr.set(p,arr.get(largest));
                    arr.set(largest,temp);
                }
            }
        }
    }

    public int repeats(int[] arr , int val){

        int count = 0;
        int writeIndex = 0;

        for(int i = 0 ; i < arr.length; i++){

            if(arr[i] == val){ // 1 arr[1] != val
                count++;
            }

            // keep the element and shift it to the left
            else{
                // shifting
                arr[writeIndex] = arr[i]; // arr[writeIndex] = arr[0] = arr[1]
                writeIndex++; // 3 9 4 6 3 2 > delete 3
                              // 9 4 6 2 null null
            }
        }

        // 0
        // writeIndex?
        for(int i = writeIndex; i < arr.length; i++){
            // null = 0
            arr[i] = 0;
        }
        return count;
    }


    public void printDiagonal(){

        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };

        for(int r = 0 ; r < matrix.length; r++){

            for(int c = 0 ; c < matrix[r].length ; c++){

                if(c <= r){
                    System.out.print(matrix[r][c] + " ");
                }
            }
            System.out.println();
        }

        // r = 0 , c = 0
        // 0 <= 0 true
        // r = 1 , c = 0
        // 0 <= 1
    }
}
