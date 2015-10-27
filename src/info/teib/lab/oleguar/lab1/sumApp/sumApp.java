package info.teib.lab.oleguar.lab1.sumApp;


import java.util.Scanner;

/**
 * Created by Олег on 25.10.2015.
 */
public class sumApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int a = scn.nextInt();


        int avg = (a + b) / 2;


        int n = 1 + (a - b) / 2;
        int sum1 = avg * n;

        System.out.println("Сума непарних чисел"+sum1);
        int num = (a + b) / 2;


        int p = 2 + (a - b) / 2;
        int sum2 = num * p;
        System.out.println("Сума парних чисел"+sum2);
    }
}