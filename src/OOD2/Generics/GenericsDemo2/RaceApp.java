package OOD2.Generics.GenericsDemo2;

public class RaceApp {
    public static void main(String[] args) {
        Driver driver1 = new Driver("A");
        Driver driver2 = new Driver("B");

        Sedan sedan1 = new Sedan("Sedan1", 2011);
        Sedan sedan2 = new Sedan("Sedan2", 2008);

        Race<Driver, Sedan> raceSedan = new Race<>();

        raceSedan.addRacer(driver1, sedan1);
        raceSedan.addRacer(driver1, sedan2);


        Race<Driver, SUV> raceSUV = new Race<>();

        SUV suv1 = new SUV("suv 1", 2019);
        SUV suv2 = new SUV("suv 2", 2018);
        suv1.accelerate();

        raceSUV.addRacer(driver1, suv1);
        raceSUV.addRacer(driver2, suv2);

        Car car = new Car("Car1", 4, 2021);

    }

    public static void addV(Vehicle vehicle){

    }
}
