package OOD3.DesignPatterns.AdapterPattern;

class PlasticToyDuck implements ToyDuck {
    public void squeak() {
        System.out.println("Squeak");
    }
}