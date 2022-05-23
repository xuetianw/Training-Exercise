package OOD2.Generics.GenericsWalkThrough;

public class Apple implements Produce {
    private String species;

    public Apple(String species) {
        this.species = species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "species='" + species + '\'' +
                '}';
    }
}
