public class CheckColumn {

    public static void main(String[] args) {

        String[][] vegetables = {

                {"Corn", "Peas", "Carrot"},
                {"Corn", "beans", "Carrot"},
                {"Corn", "Peas", "Potato"},
        };

        // 1 row [corn, peas, carrot]

        int col = 0;
    }

    public static boolean checkColumn(String[][] grid, int colIndex){

        if(grid == null || grid.length == 0){
            return  true;
        }

        String refVeg = grid[0][colIndex];

        for(int r = 1; r < grid.length; r++ ){

            if(colIndex >= grid[r].length || !grid[r][colIndex].equals(refVeg)){
                return false;
            }
        }
        return true;

    }
}
