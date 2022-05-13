package Module10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Toy toy = new Toy();
        toy.setMinAge(1);
        toy.setMaxAge(10);
        toy.setName("Tiddy Bear");
        Laptop laptop = new Laptop();

        laptop.setName("Asus vivibook");
        laptop.setCpuSpeed(1.2);
        laptop.setHardDrive(300);

        Snack snack1 = new Snack();
        Snack snack2 = new Snack();
        snack1.setCalories(300);
        snack2.setCalories(600);
        snack1.setName("Cracker");
        snack1.setFatContent(100);
        snack1.setSugarContent(10);

        snack2.setName("Chocolate");
        snack2.setFatContent(200);
        snack2.setSugarContent(300);

        ReadyMeal readyMeal1 = new ReadyMeal();
        ReadyMeal readyMeal2 = new ReadyMeal();

        readyMeal1.setCalories(600);
        readyMeal2.setCalories(300);
        readyMeal1.setName("Orange Chicken");
        readyMeal1.setCuisineType("Chinese");
        readyMeal2.setName("Salads");
        readyMeal2.setCuisineType("Canadian");

        Basket basket = new Basket();
        CalorieCounter calorieCounter = new CalorieCounter();

        // Calling methods
        //Basket:
        System.out.println("Calling methods");
        basket.addItem(toy);
        basket.addItem(laptop);
        basket.addItem(snack1);
        basket.addItem(snack2);
        basket.addItem(readyMeal1);
        basket.addItem(readyMeal2);

        basket.removeItem(readyMeal2);

        ArrayList<Basketltem> basketltems = basket.getAllItems();
        System.out.println("number items in the basket is " + basketltems.size());
        for (Basketltem basketltem : basketltems) {
            System.out.println(basketltem);
        }

        //CalorieCounter
        calorieCounter.addLowCalorieFood(readyMeal1);
        calorieCounter.addLowCalorieFood(readyMeal2);
        calorieCounter.addLowCalorieFood(snack1);
        calorieCounter.addLowCalorieFood(snack2);

        ArrayList<FoodItem> foodItems = calorieCounter.getAllLowCalorieFoods();
        System.out.println("the number of items in calorieCounter is " + foodItems.size());
        for (FoodItem foodItem : foodItems) {
            System.out.println(foodItem);
        }
    }
}
