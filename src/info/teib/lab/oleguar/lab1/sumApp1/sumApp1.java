package info.teib.lab.oleguar.lab1.sumApp1;

import java.util.Scanner;

/**
 * Created by Олег on 26.10.2015.
 */
public class sumApp1 {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
        int b = number.nextInt();
        int sum = 0;
        int sum2 = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            } else {
                sum2 = sum2 + i;
            }
        }
        System.out.println("Сума парних чисел" + sum);
        System.out.println("Сума непарних чисел " + sum2);
    }

}

