package info.teib.lab.oleguar.lab1;

/**
 * Created by ���� on 11.10.2015.
 */

public class Stolovka  {


    public static void main  (String[] args  ){

    Dish[] dishes = new Dish[5];
        dishes[0] =  new Dish(15, "���� � ��������",400);
        dishes[1] =  new Dish(8,"������� �������",150);
        dishes[2] =  new Dish(5,"����� � ������ �� �������",200);
        dishes[3] =  new Dish(10,"��������",350);
        dishes[4] =  new Dish(7,"����� ����",10);
        for (int i = 0; i < dishes.length; i++)
        System.out.println(dishes[i]);

        Reader1 r = new Reader1();
        r.Scan();

    }
}


