package info.teib.lab.oleguar.lab1;
import java.util.*;
/**
 * Created by Олег on 11.10.2015.
 */
public class Reader1 {

    public void Scan(){
        System.out.println("Який ваш бюджет?");
        Scanner scn = new Scanner (System.in);
        int a  = scn.nextInt();
        int b = 15;
        int c = 10;
        int d = 8;
        int e = 7;
        int f = 5;
         if(a>=b)


         System.out.println("На ці гроші ви можете замовити одну із страв:Пюре з відбивною,Бульйон курячий,Салат з моркви та капусти,Вареники або кусок хліба." );
        if(a<b)
            System.out.println("На ці гроші ви можете замовити одну із страв:Бульйон курячий,Салат з моркви та капусти,Вареники або кусок хліба");
        if(a<c)
            System.out.println("На ці гроші ви можете замовити одну із страв:Бульйон курячий,Салат з моркви та капусти або кусок хліба");
        if(a<d)
            System.out.println("На ці гроші ви можете замовити одну із страв:Салат з моркви та капусти або кусок хліба");
        if(a<e)
            System.out.println("На ці гроші ви можете замовити Салат з моркви ");
        if(a<f)
            System.out.println("Ви нічого не можете замовити");

         {

        }
    }

}
