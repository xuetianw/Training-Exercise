package Module10;

public class Toy implements Basketltem{
    private int minAge;
    private int maxAge;
    private String name;

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "minAge=" + minAge +
                ", maxAge=" + maxAge +
                ", name='" + name + '\'' +
                '}';
    }
}
