package info.teib.lab.oleguar.lab1.stolovka;


import java.util.*;
/**
 * Created by Олег on 25.10.2015.
 */
public class stolovkaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Меню столовки Фізфака, введіть ваші гроші  !");
        float cash = Float.parseFloat(sc.nextLine());
        System.out.println(" Це наше меню");
        dish[] menu = dishes();
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i].getName() + " " + menu[i].getPrice() + "грн " + menu[i].getCalories());
        }
        System.out.println("Ви можете зробити замовлення(Введіть порядковий номер страви), або вам потрібна порада? ?");
        String order = sc.nextLine();
        if (order.contains("Порада")) {
            System.out.println("Добре я дам Вам пораду. ");
            Vector<dish> new_menu = new Vector(1);
            int k = 1;
            for (int i = 0; i < menu.length; ) {
                if (cash >= menu[i].getPrice() * k) {
                    new_menu.addElement(new dish((k + "x " + menu[i].getName()), menu[i].getPrice() * k, menu[i].getCalories() * k));
                    k++;
                } else {
                    i++;
                    k = 1;
                }

            }

            System.out.print("Найкращий раціон для Вас ");
            do {
                System.out.print(most_caloried(cash, new_menu).getName() + "  ");
                cash = cash - most_caloried(cash, new_menu).getPrice();
            } while (cash > 0.5);

        } else {
            String[] which_dish = order.split(" ");
            float total_price = 0;
            int total_calories = 0;
            System.out.println("Ваше замовлення\n--------\n");
            for (int j = 0; j < which_dish.length; j++) {
                System.out.print(menu[Integer.parseInt(which_dish[j]) - 1].getName() + ", ");
                total_price += menu[Integer.parseInt(which_dish[j]) - 1].getPrice();
                total_calories += menu[Integer.parseInt(which_dish[j]) - 1].getCalories();
            }
            System.out.println("\n-----------\nзагальна ціна " + total_price + " ");
            System.out.println("\n-----------\nкалорійність:" + total_calories + " калорій");
            if (cash - total_price < 0) {
                System.out.println("Ви не маєте поnрібних коштів");
            } else {
                System.out.println("Ось.Ваш новий баланс " + (cash - total_price));
            }

        }

    }

    public static dish[] dishes() {
        dish[] menu = new dish[9];
        menu[0] = new dish("картофан ", (float) 3.5, 350);
        menu[1] = new dish("жарена курка", 6, 300);
        menu[2] = new dish("рис", 3, 400);
        menu[3] = new dish("рєпка", 9, 285);
        menu[4] = new dish("суп з Россолою", 4, 192);
        menu[5] = new dish("мівіна по конопльовський", (float) 1.5, 255);
        menu[6] = new dish("хліб", 0.5F, 15);
        menu[7] = new dish("салат", 2.25F, 150);
        menu[8] = new dish("стакан опроміненої води", 1F, 2);

        return menu;
    }

    public static dish most_caloried(float cost, Vector<dish> menu) {
        Vector<dish> menu_below_cost = new Vector(1);
        for (int i = 0; i < menu.size(); i++) {
            if (menu.get(i).getPrice() < cost) {
                menu_below_cost.addElement(menu.get(i));
            }
        }
        dish max_calories = menu_below_cost.get(0);
        for (int j = 0; j < menu_below_cost.size(); j++) {
            if (menu_below_cost.get(j).getCalories() > max_calories.getCalories()) {
                max_calories = menu_below_cost.get(j);
            }
        }
        return max_calories;
    }
}
