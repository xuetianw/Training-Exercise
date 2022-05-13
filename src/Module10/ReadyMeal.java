package Module10;

public class ReadyMeal implements FoodItem, Basketltem {
    private int calories;
    private String name;
    private String cuisineType;


    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
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
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "ReadyMeal{" +
                "calories=" + calories +
                ", name='" + name + '\'' +
                ", cuisineType='" + cuisineType + '\'' +
                '}';
    }
}
