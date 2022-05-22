package OOD2.Generics.GenericsDemo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Race <D extends Driver, V extends Vehicle & AllWheelDrive>{
    private List<D> drivers;

    private Map<D, V> racers;

    public Race() {
        super();
        drivers = new ArrayList<>();
        racers = new HashMap<>();
    }

    public Race(List<D> drivers, Map<D, V> racers) {
        super();
        this.drivers = drivers;
        this.racers = racers;
    }

    public void addRacer(D driver, V vehicle) {
        drivers.add(driver);
        racers.put(driver, vehicle);
    }

    public void beginRace(){
        for (D d : drivers) {
            V v = racers.get(d);
            v.accelerate();
        }
    }



}
