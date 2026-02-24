package PassengerProgram;

public class Main {

    public static void main(String[] args) {

        PassengerSeatingChart plane = new PassengerSeatingChart(4,3);


        plane.addPassenger(2,1,"UserA",50); // highest rating in row 2
        plane.addPassenger(3,1,"UserB",100); // highest rating in row 3

        // before upgrade
        System.out.println("Before Upgrade");
        plane.printChart();

        plane.upgradeRow(0,0);

        // after upgrade
        System.out.println("After Upgrade");
        plane.printChart();
    }
}
