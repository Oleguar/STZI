package info.teib.lab.oleguar.lab1;

/**
 * Created by ���� on 11.10.2015.
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
               return String.format("����:%3d  �������, ����� ������: %10s, ����������: %3d  ������",
                       this.price, this.name, this.calorie);


    }


}
