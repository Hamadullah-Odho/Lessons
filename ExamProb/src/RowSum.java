import java.util.ArrayList;

public class RowSum {


    public static void main(String[] args) {

        int[][] arr = {
                {2,3,4,6,2},
                {2,6,4,2,1},
                {1,2,3,0,0},
        };

        RowSum r = new RowSum();
        System.out.println(r.dominateRow(arr));
    }

    public int dominateRow(int[][] arr){

        int dominateRow = 0;
        ArrayList<Integer> sumOfRows = new ArrayList<>();

        for(int i = 0 ; i < arr.length; i++){
            int sum = 0;

            for (int j = 0 ; j < arr[i].length; j++){
                sum += arr[i][j];
            }
            sumOfRows.add(sum);
        }

        for(int i = 0; i < sumOfRows.size() - 1; i++){

            if(sumOfRows.get(dominateRow) > sumOfRows.get(i)){
                dominateRow = i;
            }
        }
        return dominateRow;
    }
}
