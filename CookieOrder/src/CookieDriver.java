public class CookieDriver {

    public static void main(String[] args) {

        MasterOrder goodies = new MasterOrder();
        goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
        goodies.addOrder(new CookieOrder("Shortbread", 5));
        goodies.addOrder(new CookieOrder("Macaroon", 2));
        goodies.addOrder(new CookieOrder("Chocolate Chip", 3));

        int totalBoxes = goodies.getTotalBoxes();
        int removedBoxes = goodies.removeVariety("Chocolate Chip");

        System.out.println("Total Boxes: " + totalBoxes);
        System.out.println("Removed Boxes: " + removedBoxes);
    }
}
