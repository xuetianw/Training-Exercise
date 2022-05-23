package OOD2.Generics.GenericsWalkThrough;

import java.math.BigInteger;
import java.util.Map;

public class Market {

    private Map<? extends Produce, ? extends Number> producePrices;

    public Market(Map<? extends Produce, ? extends Number> producePrices) {
        this.producePrices = producePrices;
    }

    /*
    You can have a ‘lower limit’ as well by using the super keyword.
    The super keyword tells the wildcard not to accept anything that
    is below the class you declared.



    private Map<? extends Produce, ? super BigInteger> producePrices;

    public Market(Map<? extends Produce, ? super BigInteger> producePrices) {
        this.producePrices = producePrices;
    }

     */
}