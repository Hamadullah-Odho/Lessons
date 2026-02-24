package PassengerProgram;

public class PassengerSeatingChart {

    // 2d array of passengers object
    private Passenger[][] passengers;

    public  PassengerSeatingChart(){}
    public  PassengerSeatingChart(int rows, int cols){
        passengers = new Passenger[rows][cols];
    }

    // int r = rows
    // int c = cols
    // String name and lp = passenger
    public void addPassenger(int r , int c , String name , int loyaltyPoints){
        passengers[r][c] = new Passenger(name,loyaltyPoints);
    }

    // main logic
    public void upgradeRow(int upgradeRow, int upgradeCol){

        // checking or restricted
        if (upgradeRow < 0 || upgradeCol < 0){
            return;
        }
        int max = 0;
        int Row = 0;
        int Col = 0;

        for (int i = upgradeRow + 1; i < passengers.length; i++){

            for (int j = 0 ; j < passengers[i].length; j++){

                if(passengers[i][j] != null){
                    int currentRating = passengers[i][j].getLoyaltyRating();

                    if(currentRating > max){
                        max = currentRating; // 100  , row 1 , 0
                        Row = i;
                        Col = j;

                    }
                }
            }
        }

        if(Row != -1){
            passengers[upgradeRow][upgradeCol] = passengers[Row][Col];
            passengers[Row][Col] = null;
        }


    }

    public void printChart(){

        for (int i = 0 ; i < passengers.length; i++){

            for (int j = 0 ; j < passengers[i].length; j++){

                if(passengers[i][j] != null){
                    System.out.println(passengers[i][j].getName() + " " + passengers[i][j].getLoyaltyRating() );
                }
            }
        }
    }



}
