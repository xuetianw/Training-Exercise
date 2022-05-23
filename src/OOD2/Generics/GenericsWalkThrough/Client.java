package OOD2.Generics.GenericsWalkThrough;

import java.util.HashMap;

public class Client {

    public static void main(String[] args) {
        Farmer<Produce> numberFarmer = new Farmer<>();

        numberFarmer.addProduce(new Banana("Species 1"));
        numberFarmer.addProduce(new Orange("Species 2"));
        numberFarmer.addProduce(new Apple("Species 3"));

        numberFarmer.printAllSpecies();
        System.out.println("The farmer is farming: " +  numberFarmer.getProduce(0));

        Market market = new Market(new HashMap<Produce, Integer>());

        Market appleMarket = new Market(new HashMap<Apple, Integer>());
    }
}