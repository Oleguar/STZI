package info.teib.lab.oleguar.lab1;

/**
 * Created by Юыху on 16.10.2015.
 */
public class Dish1 {
    float price;
    String name;
    int calories;
    public Dish1(String name, float price , int calories ){
        this.name = name;
        this.price = price;
        this.calories = calories;
    }
    public String getName(){
        return this.name;
    }
    public float getPrice(){
        return this.price;
    }
    public int getCalories(){
        return this.calories;
    }
}
