package OOD1.Module10;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Basketltem> basketItems = new ArrayList<>();

    public void addItem(Basketltem basketltem) {
        basketItems.add(basketltem);
    }

    public void removeItem(Basketltem basketltem) {
        basketItems.remove(basketltem);
    }

    public ArrayList<Basketltem> getAllItems() {
        return basketItems;
    }


    @Override
    public String toString() {
        return "Basket{" +
                "basketItems=" + basketItems +
                '}';
    }
}
