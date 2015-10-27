package info.teib.lab.oleguar.lab1.rivnynia;

import java.util.Scanner;

/**
 * Created by Олег on 27.10.2015.
 */

public class rivnyniaApp {

    public static void main(String[] args) {
        System.out.println("Введіть значення а,b і с ");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int l = 2;
        double k = Math.pow(b, l);
        double d = k - 4 * a * c;
        double p = Math.sqrt(d);
        double x1 = (-b + p) / 2 * a;
        double x2 = (-b - p) / 2 * a;
        if (d < 0) {
            System.out.println("D=" + d);
            System.out.println("Рівняння не має коренів");

        } else
            System.out.println("D=" + d);
        System.out.println("x1=" + x1);
        System.out.println("x2=" + x2);


    }

}