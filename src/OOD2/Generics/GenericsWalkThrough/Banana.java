package OOD2.Generics.GenericsWalkThrough;

public class Banana implements Produce {
    private String species;

    public Banana(String species) {
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
        return "Banana{" +
                "species='" + species + '\'' +
                '}';
    }
}
