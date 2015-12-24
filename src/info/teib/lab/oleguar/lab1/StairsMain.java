package info.teib.lab.oleguar.lab1;

/**
 * Created by ���� on 24.12.2015.
 */
import java.util.Scanner;

public class StairsMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������ �����?");
        int steps = scanner.nextInt();
        int fibonacci = 0;
        int prev = 0;
        int next = 1;
        for (int i = 0; i < steps; i++) {
            fibonacci = prev + next;
            prev = next;
            next = fibonacci;
        }

        System.out.println(fibonacci);
    }

}