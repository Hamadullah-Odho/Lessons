import java.util.ArrayList;

public class MasterOrder {

    ArrayList<CookieOrder> orders;

    public MasterOrder(){
        orders = new ArrayList<>();
    }

    public void addOrder(CookieOrder order){
        orders.add(order);
    }

    public int getTotalBoxes(){
        int total = 0;

        for(CookieOrder c : orders){
            total += c.getNumBoxes();
        }
        return total;
    }

    public int removeVariety(String cookieVar){
        int removed = 0;

        for(int i = orders.size() - 1; i >= 0; i--){

            if(orders.get(i).getVariety().equals(cookieVar)){
                removed += orders.get(i).getNumBoxes();
                orders.remove(i);
            }
        }
        return removed;
    }
}
