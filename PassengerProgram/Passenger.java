package PassengerProgram;

public class Passenger {

    // details of passengers

    private String name;
    private int loyaltyRating;
    public Passenger(){}
    public Passenger(String name, int loyaltyRating){

        this.loyaltyRating = loyaltyRating;
        this.name = name;

    }

    public String getName(){
        return name;
    }
    public int getLoyaltyRating(){
        return loyaltyRating;
    };

}
