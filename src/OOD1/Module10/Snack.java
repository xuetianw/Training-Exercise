package OOD1.Module10;

public class Snack implements Basketltem, FoodItem {
    private String name;
    private double price;
    private int calories;
    private int fatContent;
    private int sugarContent;


    public int getFatContent() {
        return fatContent;
    }

    public void setFatContent(int fatContent) {
        this.fatContent = fatContent;
    }

    public int getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(int sugarContent) {
        this.sugarContent = sugarContent;
    }


    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
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
    public int getCalories() {
        return calories;
    }

    @Override
    public void setCalories(int calories) {
        this.calories = calories;
    }


    @Override
    public String toString() {
        return "Snack{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", fatContent=" + fatContent +
                ", sugarContent=" + sugarContent +
                '}';
    }
}
