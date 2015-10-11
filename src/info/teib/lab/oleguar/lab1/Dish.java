package info.teib.lab.oleguar.lab1;

/**
 * Created by ќлег on 11.10.2015.
 */
public class Dish {
    int price;
    String name;
    int calorie;
    public Dish(int price, String name,int calorie ){
        this.price = price;
        this.name = name;
    this.calorie = calorie;}
    public String toString() {
               return String.format("ц≥на:%3d  гривень, назва страви: %10s, калор≥йн≥сть: %3d  калор≥й",
                       this.price, this.name, this.calorie);


    }


}
