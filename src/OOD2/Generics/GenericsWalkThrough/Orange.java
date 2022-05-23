package OOD2.Generics.GenericsWalkThrough;

public class Orange implements Produce {
    private String species;

    public Orange(String species) {
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
        return "Orange{" +
                "species='" + species + '\'' +
                '}';
    }
}
